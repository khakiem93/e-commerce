package org.example.stepDefs;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {


       P03_homePage login = new P03_homePage();

        @When("^user click on \"(.*)\" icon")
        public void clickIcon(String website) throws InterruptedException {
            if(website.equals("facebook"))
            login.iconSelector_FaceBook().click();
            else if (website.equals("twitter")) {
                login.iconSelector_twitter().click();
            } else if (website.equals("rss")) {
                login.iconSelector_rss().click();

            } else if (website.equals("youtube")) {
                login.iconSelector_youtube().click();

            }
            Thread.sleep(3000);
        }
        @Then("^user redirected to the required page \"(.*)\"$")
        public void directPage(String url)
        {
            ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
            String currentTab = Hooks.driver.getWindowHandle();
            int index = tabs.indexOf(currentTab);
            if(tabs.size()>1)
            {
                Hooks.driver.switchTo().window(tabs.get(index+1));
            }
            System.out.println(Hooks.driver.getCurrentUrl());
            Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(url));
            Hooks.driver.close();

        }

    }
