package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

        public RegisterPage() {
                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "((//a)[1])")
        public WebElement registerPage;

        @FindBy(xpath = "//*[@id='name']")
        public WebElement nameOfTheRegisterField;

        @FindBy(xpath = "//*[@id='surname']")
        public WebElement surnameField;

        @FindBy(xpath = "//*[@id='birthPlace']")
        public WebElement birthPlaceField;

        @FindBy(xpath = "//*[@id='phoneNumber']")
        public WebElement phoneNumberField;

        @FindBy(xpath = "(//*[@name='gender'])[1]")
        public WebElement femaleOfGender;

        @FindBy(xpath = "(//*[@name='gender'])[2]")
        public WebElement maleOfGender;

        @FindBy(xpath = "//*[@id='birthDay']")
        public WebElement birthDayField;

        @FindBy(xpath = "//*[@id='ssn']")
        public WebElement ssnField;

        @FindBy(xpath = "//*[@id='username']")
        public WebElement userNameOfTheRegisterField;

        @FindBy(xpath = "//*[@id='password']")
        public WebElement passwordField;

        @FindBy(xpath = "(//*[@type='button'])[3]")
        public WebElement registerButton;

        @FindBy(xpath = "//*[text()='One uppercase character']")
        public WebElement passwordFieldMessageOfRegisterButton;

}
