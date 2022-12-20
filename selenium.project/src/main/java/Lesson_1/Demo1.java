package Lesson_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        //test cases...
        // selenium code..

        System.setProperty("webdriver.chrome.driver","C:\\Users\\alioz\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        //The code which is above no need to write here
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
//        String str = driver.getCurrentUrl();
//
//        String title = driver.getTitle();
//
//        System.out.println("Test1 : " .concat(str));
//        Thread.sleep(2000);
//        System.out.println("Title of page : " + title);
//
//
//        driver.quit();
//
//        WebElement searchInputBoxWebElement = driver.findElement(By.id("searchInput"));
//        Thread.sleep(2000);
//        searchInputBoxWebElement.sendKeys("Turkish");


        WebElement searchInputBoxWebElement = driver.findElement(By.xpath("//*[@id='searchInput']"));
        Thread.sleep(2000);
        searchInputBoxWebElement.sendKeys("English");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id='search-form']/fieldset/button"));
        searchButton.click();

        String currentPageUrl = driver.getCurrentUrl();
        if(currentPageUrl.equalsIgnoreCase(("https://en.wikipedia.org/wiki/Turkish"))){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        Thread.sleep(4000);
        driver.quit();

    }
}
