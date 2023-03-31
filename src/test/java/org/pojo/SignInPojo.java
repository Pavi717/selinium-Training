package org.pojo;

import org.base.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass1 {
public SignInPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Create new account']")
private WebElement CreateNew;

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement FirstName;

@FindBy(name="lastname")
private WebElement SecondName;

@FindBy(name="reg_email__")
private WebElement MoborEmail;

@FindBy(name="reg_passwd__")
private WebElement Password;

public WebElement getCreateNew() {
	return CreateNew;
}

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getSecondName() {
	return SecondName;
}

public WebElement getMoborEmail() {
	return MoborEmail;
}

public WebElement getPassword() {
	return Password;
}



}
