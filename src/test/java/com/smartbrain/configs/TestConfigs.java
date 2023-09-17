package com.smartbrain.configs;

import com.codeborne.selenide.Configuration;
import com.smartbrain.pages.GoogleSaveCookiesPage;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class TestConfigs {
    public static final String URL = "https://www.google.com";
    private static final String CHROME_LANGUAGE_PARAM = "--lang=en-GB";
    public static final String NAME_PARAM = "Elon";
    public static final String FULL_NAME_PARAM = "Jeff Bezos";

    @BeforeEach
    public void openBrowser() {
        setBrowserLanguage();
        open(URL);
        new GoogleSaveCookiesPage().closeSaveCookiesPage();
    }

    public static void setBrowserLanguage() {
        Configuration.browserCapabilities = new ChromeOptions()
                .addArguments(CHROME_LANGUAGE_PARAM);
    }
}
