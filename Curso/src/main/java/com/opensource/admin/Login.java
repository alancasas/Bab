package com.opensource.admin;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import com.opensource.base.SeleniumWrapper;
 
public class Login extends SeleniumWrapper{
 
	/*
	 * Constructor
	 */
	public Login(WebDriver driver) {
		super(driver);
	}
 
	By txt_username = By.xpath("//input[@id='txtUsername']");
	By txt_password = By.xpath("//input[@id='txtPassword']");
	By btn_login = By.xpath("//input[@id='btnLogin']");
	By btn_welcome = By.xpath("//a[@id='welcome']");
	By btn_logout = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");
 
	/*
	 * Login Orange opensource
	 * @author Ricardo Avalos
	 * @date 2/20/2021
	 */
 
	public void loginOrange(String username, String password) {
		reporterLog("Login into Orange open source");
		waitForElementPresent(txt_username, 10);
		type(txt_username, username, "Username text field");
		type(txt_password, password, "Password text field");
		click(btn_login, "Button Login");
		implicitlyWait(5);
	}
 
	/*
	 * Log out Orange
	 */
	public void logoutOrange() {
		reporterLog("Logout into Orange open source");
		click(btn_welcome, "Welcome button");
		click(btn_logout, "Logout button");
		implicitlyWait(5);
	}
}
 