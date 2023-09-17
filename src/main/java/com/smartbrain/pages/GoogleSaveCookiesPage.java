package com.smartbrain.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GoogleSaveCookiesPage {
    private static final String SAVE_COOKIES_PAGE = "//div[@class = 'KxvlWc']";
    private static final String ADMIT_COOKIES_BTN = "//div[@class = 'QS5gu sy4vM']";

    public void closeSaveCookiesPage() {
        if ($x(SAVE_COOKIES_PAGE).is(Condition.visible)) {
            $$x(ADMIT_COOKIES_BTN)
                    .last()
                    .click();
        }
        $x(SAVE_COOKIES_PAGE)
                .shouldNotBe(Condition.visible);
    }
}
