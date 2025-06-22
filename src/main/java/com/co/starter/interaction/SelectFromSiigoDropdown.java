package com.co.starter.interaction;

import com.co.starter.helper.ShadowDomUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFromSiigoDropdown implements Interaction {
    private final String shadowHostSelector;
    private final String optionText;

    public SelectFromSiigoDropdown(String shadowHostSelector, String optionText) {
        this.shadowHostSelector = shadowHostSelector;
        this.optionText = optionText;
    }

    public static Builder inHost(String shadowHostSelector) {
        return new Builder(shadowHostSelector);
    }

    public static class Builder {
        private final String shadowHostSelector;

        public Builder(String shadowHostSelector) {
            this.shadowHostSelector = shadowHostSelector;
        }

        public SelectFromSiigoDropdown selectingText(String optionText) {
            return Tasks.instrumented(SelectFromSiigoDropdown.class, shadowHostSelector, optionText);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = net.serenitybdd.core.Serenity.getDriver();

        String script =
                "const host = document.querySelector('" + shadowHostSelector + "');" +
                        "if (!host || !host.shadowRoot) return;" +
                        "const shadow = host.shadowRoot;" +
                        "const anchor = shadow.querySelector('.mdc-select__anchor');" +
                        "anchor.click();" +
                        "setTimeout(() => {" +
                        "  const options = shadow.querySelectorAll('.mdc-list-item');" +
                        "  for (const option of options) {" +
                        "    if (option.innerText.trim() === '" + optionText + "') {" +
                        "      option.click();" +
                        "      break;" +
                        "    }" +
                        "  }" +
                        "}, 500);";

        ((JavascriptExecutor) driver).executeScript(script);
    }
}
