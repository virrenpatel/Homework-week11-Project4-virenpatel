package project_4_com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get Current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page source:"+ driver.getPageSource());
        // Find the email field elements
        WebElement emailField = driver.findElement(By.id("user-name"));
        // Type email to email field
        emailField.sendKeys("test123@gmail.com");
        // Find the Password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Password12345");
        //Close the browser
        //driver.close();
    }
}
