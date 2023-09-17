package com.smartbrain.tests.ui;

import com.smartbrain.configs.TestConfigs;
import com.smartbrain.pages.GooglePage;
import com.smartbrain.pages.GoogleSearchPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class GooglePageTests extends TestConfigs {

    @Test
    public void searchByName() {
        new GooglePage().googleSearch(NAME_PARAM);
        sleep(3000);
        new GoogleSearchPage().validateSearchPageAppearance();
        new GoogleSearchPage().validateSearchResults(NAME_PARAM);
    }

    @Test
    public void searchByFullName() {
        new GooglePage().googleSearch(FULL_NAME_PARAM);
        sleep(3000);
        new GoogleSearchPage().validateSearchPageAppearance();
        new GoogleSearchPage().validateSearchResults(FULL_NAME_PARAM);
    }

    @Test
    public void validateSearchFieldToolTip() {
        new GooglePage().hoverOverSearchField();
        sleep(3000);
        assertThat(new GooglePage().isSearchTooltipDisplayed())
                .as("Tooltip should be visible").isTrue();
    }

    @Test
    public void clickUpperLeftGoogleLogo() {
        new GooglePage().googleSearch(NAME_PARAM);
        sleep(3000);
        new GoogleSearchPage().clickOnLeftLogoOnSearchPage();
        assertThat(new GoogleSearchPage().isSearchPageDisplayed())
                .as("Search page should NOT be displayed")
                .isFalse();
        assertThat(new GooglePage().isGoogleMainPageDisplayed())
                .as("Google main page should be displayed")
                .isTrue();
    }
}
