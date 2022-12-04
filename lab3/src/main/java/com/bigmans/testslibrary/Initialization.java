package com.bigmans.testslibrary;

import com.bigmans.testslibrary.additions.InitializationData;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization {

    By clicksInput = By.xpath("//div[@class='moduletable auth']//input[@class='button']");
    By uncover = By.xpath("//div[@class='form_accordion']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']");
    @Test
    public  void InitializationTest() {
        WebDriver driver = new ChromeDriver();
        InitializationData initialization = new InitializationData();
        helpFunc(driver, initialization.getUrl1(), initialization);
        String userName = driver.findElement((By.className("login-greeting"))).getText();
        Assertions.assertEquals(" Исмаилов Мансур Рахымжанович", userName);
    }
    @Test
    public void searchBook(){
        WebDriver driver = new ChromeDriver();
        InitializationData initialization = new InitializationData();
        helpFunc(driver, initialization.getUrl2(), initialization);
       driver.findElement(By.cssSelector("model")).click();
    }

    private void helpFunc( WebDriver driver, String url, InitializationData initialization){
        driver.get(url);
        driver.findElement(By.className("inputbox")).sendKeys(initialization.getLastName());
        driver.findElement(By.id("modlgn-passwd")).sendKeys(initialization.getPassword());
        driver.findElement(clicksInput).click();
    }
}
