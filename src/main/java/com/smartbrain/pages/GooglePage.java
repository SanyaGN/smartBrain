package com.smartbrain.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {

    private static final String SEARCH_FIELD = "//textarea[@type = 'search' and @name = 'q']";
    private static final String SEARCH_TOOLTIP = "//textarea[@title = '%s']";
    private static final String TOOLTIP_ATTRIBUTE = "Title";

    public void googleSearch(String value) {
        $x(SEARCH_FIELD)
                .setValue(value)
                .pressEnter();
    }

    public void hoverOverSearchField() {
        $x(SEARCH_FIELD)
                .shouldBe(visible)
                .hover();
    }

    public boolean isSearchTooltipDisplayed() {
        return $x(String.format(SEARCH_TOOLTIP, $x(SEARCH_FIELD).getAttribute(TOOLTIP_ATTRIBUTE)))
                .shouldBe(visible)
                .isDisplayed();
    }

    public boolean isGoogleMainPageDisplayed() {
        return $x(SEARCH_FIELD)
                .shouldBe(visible)
                .isDisplayed();
    }

}
