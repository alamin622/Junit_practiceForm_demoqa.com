import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;


public class practiceForm extends setUp {
    WebElement txtFirstName, txtLastName, txtEmail, txtMobileNumber, txtDate, txtSubject;

    @Test
    public void getFirstName() throws InterruptedException, IOException, ParseException {
        driver.get("https://demoqa.com/automation-practice-form");
        txtFirstName = driver.findElement(By.id("firstName"));
        txtFirstName.sendKeys(" Al Amin Choudhury");

        txtLastName = driver.findElement(By.id("lastName"));
        txtLastName.sendKeys("Abeer");

        txtEmail = driver.findElement(By.id("userEmail"));
        txtEmail.sendKeys("abeer@gmail.com");

        WebElement typeRatio = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        typeRatio.click();

        WebElement txtPhoneNumber = driver.findElement(By.id("userNumber"));
        txtPhoneNumber.sendKeys("0174266778");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("dateOfBirthInput")));
        actions.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        actions.sendKeys("07-12-2018");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
        actions.build().perform();

        txtSubject = driver.findElement(By.id("subjectsInput"));
        txtSubject.click();
        txtSubject.sendKeys("physics");
        txtSubject.sendKeys(Keys.ENTER);

        WebElement HobbiesCheckbox = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
        HobbiesCheckbox.click();

        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
        uploadElement.sendKeys("c:\\ad.png");

        WebElement CurrentAdd = driver.findElement(By.id("currentAddress"));
        CurrentAdd.sendKeys("Mirpur-10, Dhaka-1216");

        Utils utils = new Utils();
        utils.StudentInfo();

    }

}




