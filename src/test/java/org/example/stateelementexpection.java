package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class stateelementexpection {
    @Test
    public void testloginnegivevwo() throws InterruptedException {
        WebDriver d = new EdgeDriver();
        d.get("https://www.google.com");
       WebElement search= d.findElement(By.name("q"));
        d.navigate().refresh();
        search.sendKeys("testing");
    }
}
