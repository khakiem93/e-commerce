package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
public class P03_homePage {
    WebDriver driver;

    public P03_homePage() {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver, this);
    }

    //F03
    public WebElement CurrencyPom() {
        return driver.findElement(By.id("customerCurrency"));

    }

    public List<WebElement> ProductPricePom() {
        return driver.findElements(By.className("price"));
    }

    public WebElement searchFieldPOm() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButtonPom() {
        return Hooks.driver.findElement(By.className("button-1"));
    }

    public boolean validatePageURL(String expectedURL) {
        boolean result = false;
        System.out.println(driver.getCurrentUrl());

        if (driver.getCurrentUrl().contains(expectedURL)) {
            result = true;
        }
        return result;
    }

    //F04
    public List<WebElement> searchResultItems() {
        return driver.findElements(By.className("product-title"));
    }

    //F05
    public WebElement computersCategory() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }
    public WebElement DesktopsSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
    }
    public WebElement DesktopSubTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));
    }
    //F07
    public WebElement iconSelector_FaceBook()
    {
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement iconSelector_twitter()
    {
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public WebElement iconSelector_rss()
    {
        return Hooks.driver.findElement(By.className("rss"));
    }
    public WebElement iconSelector_youtube()
    {
        return Hooks.driver.findElement(By.className("youtube"));
    }

}



