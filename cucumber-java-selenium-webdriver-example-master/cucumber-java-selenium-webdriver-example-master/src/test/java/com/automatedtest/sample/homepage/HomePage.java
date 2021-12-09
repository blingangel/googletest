package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import io.cucumber.java.de.Wenn;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "https://www.google.";

    @FindBy(css = "#hplogo")
    private WebElement logo;

    @FindBy(css = "input[name=q]")
    private WebElement searchInput;


    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(String country){
        driver.get(HOME_PAGE_URL + country);
        wait.forLoading(5);
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(5, this.logo, "Logo");
    }

    String getTitle() {
        return driver.getTitle();
    }

    void checkSearchBarDisplay() {

        wait.forElementToBeDisplayed(10, this.searchInput, "Search Bar");
    }

    void searchFor(String searchValue) {
        this.searchInput.sendKeys(searchValue);
        this.searchInput.sendKeys(Keys.ENTER);
    }
    public void clicksLinkByXpath(String xpath) throws InterruptedException {

        WebElement e = driver.findElement(By.xpath(xpath));

        Thread.sleep(10000);
        e.click();
        Thread.sleep(2000000);
    }

    public void printsTheTitleByXpath(String xpath) {
        WebElement a = driver.findElement(By.xpath("//*[@id=\"ArticleHolder\"]/div[2]/h1"));
        a.getText();
    }

    public void printsTheAuthorByXpath(String xpath) {
        WebElement i = driver.findElement(By.xpath("//*[@id=\"ArticleContent\"]/p[6]"));
        i.getText();
    }
    public void holdon (String minutes) throws InterruptedException{
        System.out.println("KEKW");
        Thread.sleep(1000);
    }
}
