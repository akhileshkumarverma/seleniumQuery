package org.openqa.selenium.seleniumquery.functions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.seleniumquery.SeleniumQueryObject;

public class HtmlFunction {

	public static String html(SeleniumQueryObject seleniumQueryObject, List<WebElement> elements) {
		JavascriptExecutor js = (JavascriptExecutor) seleniumQueryObject.getWebDriver();
		if (elements.isEmpty()) {
			return null;
		}
		return js.executeScript("return arguments[0].innerHTML", elements.get(0)).toString();
	}

}