package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class D08_WishlistStepDef {P03_homePage login = new P03_homePage();

    @When("user click on wishlist button to add\"HTC One M8 Android L 5.0 Lollipop\"")
    public void click_WishList_Button() throws InterruptedException {
        login.Wish_ListButton().click();
        Thread.sleep(3000);
    }
    @Then("user get success message to inform  that item was added to wishlist")
    public void Success_Mssage_Shown()
    {
        Assert.assertTrue(login.Success_Mssage().isDisplayed());
    }
    @And("^color of wishlist success message \"(.*)\"$")
    public void successMSG_Color(String color)
    {


        String rgba = login.Success_Mssage().getCssValue("background-color");
        String hex = Color.fromString(rgba).asHex();
        Assert.assertEquals(hex,color);
    }
    @And("user go to wishlist page")
    public void wishlistPage()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.invisibilityOf(login.Success_Mssage()));
        login.Wish_ListLink().click();
    }
    @Then("user should increase amount of items in wishlist page")
    public void itemQuantity()
    {
        String q = login.Item_Amount().getAttribute("value");
        Assert.assertTrue(Integer.parseInt(q)>0);
    }

}
