package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class indexPage extends PageObject {

    // Delclaracion de elementos
    @FindBy(id = "firstName")
    WebElement input_name;
    @FindBy(id = "lastName")
    WebElement input_lastName;
    @FindBy(id = "userEmail")
    WebElement input_email;
    @FindBy(xpath= "//label[contains(text(),'Male')]")
    WebElement gender_male;
    @FindBy(xpath= "//label[contains(text(),'Female')]")
    WebElement gender_female;
    @FindBy(xpath= "//label[contains(text(),'Other')]")
    WebElement gender_other;
    @FindBy(id = "userNumber")
    WebElement input_phone;
    @FindBy(id = "dateOfBirthInput")
    WebElement input_date;
    @FindBy(xpath = "//label[contains(text(),'Sports')]")
    WebElement hobbie_sports;
    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    WebElement hobbie_reading;
    @FindBy(xpath = "//label[contains(text(),'Music')]")
    WebElement hobbie_music;
    @FindBy(id = "subjectsInput")
    WebElement input_aptitudes;
    @FindBy(id = "uploadPicture")
    WebElement input_uploadPicture;
    @FindBy(id = "currentAddress")
    WebElement input_address;
    @FindBy(id = "state")
    WebElement select_state;
    @FindBy(id = "city")
    WebElement select_city;
    @FindBy(id = "submit")
    WebElement btn_submit;
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement text_ThanksFor;

    public indexPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void insertName(String name, String lastName) {
        input_name.clear();
        input_name.sendKeys(name);
        input_lastName.clear();
        input_lastName.sendKeys(lastName);
    }

    public void insertEmail(String email) {
        input_email.clear();
        input_email.sendKeys(email);
    }

    public void selectGende(String gender) {
        if (gender.equals("Male")) {
            gender_male.click();
        } else {
            if (gender.equals("Female")) {
                gender_female.click();
            } else {
                if (gender.equals("Other")) {
                    gender_other.click();
                }
            }
        }
    }
    public void selectHobbies(String hobb1, String hobb2, String hobb3, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);
        if(hobb1.equals("Sports")){
            hobbie_sports.click();
        }
        if (hobb2.equals("Reading")){
            hobbie_reading.click();
        }
        if(hobb3.equals("Music")){
            hobbie_music.click();
        }
    }

    public void insertNumber(String number) {
        input_phone.clear();
        input_phone.sendKeys(number);
    }

    public void insertDate(String month,String day,String year,WebDriver driver) {
        input_date.click();
        Select select_month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        Select select_year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        select_month.selectByVisibleText(month);
        select_year.selectByVisibleText(year);
        WebElement selected_day = driver.findElement(By.xpath("//div[contains(text(),'"+day+"')]"));
        selected_day.click();
    }

    public void insertAptitudes(String apt1, String apt2, String apt3) {
        input_aptitudes.sendKeys(apt1);
        input_aptitudes.sendKeys(Keys.ENTER);
        input_aptitudes.sendKeys(apt2);
        input_aptitudes.sendKeys(Keys.ENTER);
        input_aptitudes.sendKeys(apt3);
        input_aptitudes.sendKeys(Keys.ENTER);
    }

    public void uploadImage(String ruta) {
        if(ruta.equals("img01")){
            File file = new File("F:\\Jere\\QA\\practicas\\demoQA-test\\demoQA-test\\src\\main\\resources\\files\\images\\img01.jpg");
            String path = file.getAbsolutePath();
            input_uploadPicture.sendKeys(path);
        }else{
            if(ruta.equals("img02")){
                File file = new File("F:\\Jere\\QA\\practicas\\demoQA-test\\demoQA-test\\src\\main\\resources\\files\\images\\img02.jpg");
                String path = file.getAbsolutePath();
                input_uploadPicture.sendKeys(path);
            }else{
                if(ruta.equals("img03")){
                    File file = new File("F:\\Jere\\QA\\practicas\\demoQA-test\\demoQA-test\\src\\main\\resources\\files\\images\\img03.jpg");
                    String path = file.getAbsolutePath();
                    input_uploadPicture.sendKeys(path);
                }
            }
        }
    }

    public void insertAddress(String address) {
        input_address.sendKeys(address);
    }

    public void insertStateAndCity(String state, String city, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        select_state.click();
        WebElement selectedState = driver.findElement(By.xpath("//div[contains(text(),'"+state+"')]"));
        selectedState.click();
        select_city.click();
        WebElement selectedCity = driver.findElement(By.xpath("//div[contains(text(),'"+city+"')]"));
        selectedCity.click();
    }

    public void submit() {
        btn_submit.click();
    }

    public void verify() {
        String actualText = text_ThanksFor.getText();
        String expectedText = "Thanks for submitting the form";
        if(actualText.equals(expectedText)){
            System.out.println("Test passed");
        }else{
            System.out.println("Failed test");
        }
    }
}
