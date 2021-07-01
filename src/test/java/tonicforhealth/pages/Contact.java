package tonicforhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Contact {
    SelenideElement thankYouSubmit = $("#hbspt-form-1625094400861-3306307039"),
                    contactContainer = $("div.contact_form");


    public void switchToHelpFormIframe(){
        switchTo().frame(0);
    }

    public void switchToThankYouSubmitFrame(){
        switchTo().frame(0);
    }

    public void checkThankYouSubmittingText(String thankYouSubmitText){
        $(byText(thankYouSubmitText)).shouldBe(visible);
    }

    public void scrollUp(){
        executeJavaScript("window.scrollTo(document.body.scrollHeight, 0)");
    }
}
