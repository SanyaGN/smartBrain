package com.smartbrain.pages;

import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {

    private static final String GOOGLE_SEARCH_PAGE = "//div[@class = 'sBbkle' and @role = 'navigation']";
    private static final String GOOGLE_LOGO_IMG = "//img[@alt = 'Google']";
    private static final String GOOGLE_SEARCH_RESULTS = "//h3[contains(text(), '%s')]";

    public void validateSearchPageAppearance() {
        $x(GOOGLE_SEARCH_PAGE)
                .shouldBe(visible);
    }

    public void validateSearchResults(String searchText) {
        $$x(String.format(GOOGLE_SEARCH_RESULTS, searchText))
                .filter(visible)
                .shouldHave(CollectionCondition.sizeGreaterThanOrEqual(6));
    }

    public void clickOnLeftLogoOnSearchPage() {
        $x(GOOGLE_LOGO_IMG)
                .shouldBe(visible)
                .click();
    }

    public boolean isSearchPageDisplayed() {
        return $x(GOOGLE_SEARCH_PAGE)
                .shouldNotBe(visible)
                .isDisplayed();
    }
}
