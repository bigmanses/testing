package com.bigmans.testslibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://library.voenmeh.ru/jirbis2/");
        driver.findElement(By.className("repo-img")).click();
    }
}
