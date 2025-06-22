package com.co.starter.helper;

import org.openqa.selenium.*;

import java.util.Arrays;

public class ShadowDomUtils {
    public static WebElement getShadowElement(WebDriver driver, String... selectors) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        StringBuilder script = new StringBuilder("let el = document");
        for (String selector : selectors) {
            script.append(".querySelector('").append(selector).append("').shadowRoot");
        }

        script.setLength(script.length() - ".shadowRoot".length()); // eliminar el último .shadowRoot
        script.append("; return el;");
        return (WebElement) js.executeScript(script.toString());
    }

    public static WebElement getNestedShadowElement(WebDriver driver, String[] shadowPath, String finalSelector) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        StringBuilder script = new StringBuilder("let el = document");
        for (String selector : shadowPath) {
            script.append(".querySelector('").append(selector).append("').shadowRoot");
        }

        script.append(".querySelector('").append(finalSelector).append("'); return el;");
        return (WebElement) js.executeScript(script.toString());
    }

    public static WebElement findByTextInsideShadow(WebDriver driver, String[] shadowPath, String tag, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Construir ruta hasta el último shadowRoot
        StringBuilder script = new StringBuilder("let root = document");
        for (String selector : shadowPath) {
            script.append(".querySelector('").append(selector).append("').shadowRoot");
        }

        // Construir el bloque de búsqueda
        script.append(".querySelectorAll('").append(tag).append("');\n");
        script.append("let elements = root;\n");
        script.append("for (let el of elements) {\n");
        script.append("  if (el.textContent.trim() === '").append(text.replace("'", "\\'")).append("') return el;\n");
        script.append("}\n");
        script.append("return null;");

        return (WebElement) js.executeScript(script.toString());
    }
}
