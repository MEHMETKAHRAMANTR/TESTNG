package tests.day16_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_QualitydemyNegatifLoginTesti {
    QualitydemyPage qualitydemiyPage;


    @Test(groups = {"smoke","regression"})
    public void gecersizPasswordTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemiyPage=new QualitydemyPage();
        //qualitydemiyPage.acceptCookies.click();
        qualitydemiyPage.ilkLoginLinki.click();
        qualitydemiyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemiyPage.passwordKutusu.sendKeys("12345");
        qualitydemiyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemiyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();


    }
    @Test(groups = {"smoke","e2e1"})
    public void gecersizEmailTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemiyPage=new QualitydemyPage();
        //qualitydemiyPage.acceptCookies.click();
        qualitydemiyPage.ilkLoginLinki.click();
        qualitydemiyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemiyPage.passwordKutusu.sendKeys("Nevzat152032");
        qualitydemiyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemiyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();

    }
    @Test(groups = {"e2e1","regression"})
    public void gecersizEmailPassworTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemiyPage=new QualitydemyPage();
       // qualitydemiyPage.acceptCookies.click();
        qualitydemiyPage.ilkLoginLinki.click();
        qualitydemiyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemiyPage.passwordKutusu.sendKeys("123452");
        qualitydemiyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemiyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();

    }
}
