package by.itacademy.arsenyaleksandrovich.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("https://svyatoslav.biz/testlab/wt/index.php");

        String xpath ="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By by = By.xpath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.sendKeys("Арсений");

        xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.sendKeys("185");

        xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.sendKeys("65");

        xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.click();

        xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        by = By.xpath(xpath);
        webElement = webDriver.findElement(by);
        webElement.click();
    }
}
