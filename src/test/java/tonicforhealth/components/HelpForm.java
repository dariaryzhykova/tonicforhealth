package tonicforhealth.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

//hbspt-form-1625092700998-1524895497
public class HelpForm {
    SelenideElement firstName = $("#firstname-f40233be-0893-48b2-b99b-5104426dbffe"),
                    lastName = $("#lastname-f40233be-0893-48b2-b99b-5104426dbffe"),
                    email = $("#email-f40233be-0893-48b2-b99b-5104426dbffe"),
                    phoneNumber = $("#phone-f40233be-0893-48b2-b99b-5104426dbffe"),
                    organization = $("#company-f40233be-0893-48b2-b99b-5104426dbffe"),
                    howCanWeHelp = $("#tonic_datstat_contact_us_inquiry_type-f40233be-0893-48b2-b99b-5104426dbffe"),
                    tellUs = $("#contact_comments_from_forms_2__c-f40233be-0893-48b2-b99b-5104426dbffe"),
                    submitBtn = $("input[value=\"Submit\"]");

    public void setFirstName(String firstNameText){
        firstName.val(firstNameText);
    }

    public void setLastName(String lastNameText){
        lastName.val(lastNameText);
    }

    public void setEmail(String emailText) {
        email.val(emailText);
    }

    public void  setPhoneNumber(String phoneNumberText) {
        phoneNumber.val(phoneNumberText);
    }

    public void setOrganization(String organizationText){
        organization.val(organizationText);
    }

    public void selectHowCanWeHelp(String text){
        howCanWeHelp.selectOptionByValue(text);
    }

    public void setComment(String comment){
        tellUs.val(comment);
    }

    public void submit(){
        submitBtn.click();
    }
}
