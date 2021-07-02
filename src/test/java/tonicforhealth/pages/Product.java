package tonicforhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Product {

    SelenideElement requestMoreInfoBtn = $("a.learnHow"),
            tonicTitle = $("h2");

    public void pressRequestMoreInfo() {
        requestMoreInfoBtn.click();
    }

    public void checkProductTitle(String expectedText) {
        tonicTitle.shouldHave(text(expectedText));
    }
}
