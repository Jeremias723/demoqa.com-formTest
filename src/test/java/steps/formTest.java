package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class formTest extends baseTestSuite{

    @Given("El usuario ingresa a demoqa.com")
    public void goToIndex(){
        openDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @When("Complete con su nombre: (.*) y apellido: (.*)")
    public void completeName(String name,String lastName){
        indexPage.insertName(name,lastName);
    }
    @And("Complete su E-mail: (.*)")
    public void completeEmail(String email){
        indexPage.insertEmail(email);
    }
    @And("Indique su genero: (.*)")
    public void selectGender(String gender){
        indexPage.selectGende(gender);
    }
    @And("Complete su numero de telefono: (.*)")
    public void completePhoneNumber(String number){
        indexPage.insertNumber(number);
    }

    @And("Indique su fecha de nacimiento: (.*) , (.*) , (.*)")
    public void completeDate(String month,String day,String year){
        indexPage.insertDate(month,day,year,driver);
    }

    @And("Selecciona sus hobbies: (.*) , (.*) , (.*)")
    public void selectHobbies(String hobb1, String hobb2,String hobb3) throws InterruptedException {
        indexPage.selectHobbies(hobb1,hobb2,hobb3,driver);
    }

    @And("Complete sus aptitudes: (.*) , (.*) , (.*)")
    public void completeAptitudes(String apt1,String apt2,String apt3){
        indexPage.insertAptitudes(apt1,apt2,apt3);

    }
    @And("El usuario sube la foto: (.*)")
    public void uploadPicture(String ruta){
        indexPage.uploadImage(ruta);
    }
    @And("Ingresa su direccion: (.*)")
    public void completeAddress(String address){
        indexPage.insertAddress(address);
    }

    @And("Selecciona su estado y ciudad: (.*) , (.*)")
    public void selectCity(String state, String city){
        indexPage.insertStateAndCity(state,city,driver);
    }
    @And("El usuario hace click en en boton 'Submit'")
    public void submitForm(){
        indexPage.submit();
    }
    @Then("Se verificaran los datos enviados")
    public void verifyData(){
        indexPage.verify();
    }

}
