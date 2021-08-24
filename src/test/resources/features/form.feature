Feature: Registro en formulario de demoqa.com

  COMO usuario
  QUIERO registrarme en la pagina demoqa.com
  PARA poder ser socio de la web y utilizar el resto de funcionalidades que ofrece

  # Este feature trata sobre llenar un formulario en demoqa.com automaticamente
  # Utilizando Selenium, Serenity, Junit, Cubumber



  Scenario Outline: Formulario registro - Ejecucion exitosa

    Given Ingresa a demoqa.com
    When Complete con su nombre: <Nombre> y apellido: <Apellido>
    And Complete su E-mail: <E-mail>
    And Indique su genero: <Genero>
    And Complete su numero de telefono: <Numero>
    And Indique su fecha de nacimiento: <Mes> , <Dia> , <Anio>
    And Selecciona sus hobbies: <Hob1> , <Hob2> , <Hob3>
    And Complete sus aptitudes: <Apt1> , <Apt2> , <Apt3>
    And Sube una foto: <img>
    And Ingresa su direccion: <direccion>
    And Selecciona su estado y ciudad: <estado> , <ciudad>
    And Hace click en en boton 'Submit'
    Then Verifica el envio de datos

    Examples:
      | Nombre   | Apellido | E-mail                    | Genero | Numero     | Mes      | Dia | Anio | Hob1   | Hob2    | Hob3  | Apt1      | Apt2    | Apt3    | img   | direccion    | estado    | ciudad |
      | Jeremias | Manzano  | jeremiasmanzano@gmail.com | Male   | 2616662695 | February | 13  | 1999 | Sports | Reading | ..    | Chemistry | English | Maths   | img01 | Soler 38     | NCR       | Delhi  |
      | Antonio  | Gallardo | Antonio@gmail.com         | Other  | 2616547695 | January  | 22  | 1997 | ..     | Reading | ..    | Commerce  | Civics  | Arts    | img02 | Swipacha 873 | Haryana   | Karnal |
      | Lucia    | Diaz     | luciaD@gmail.com          | Female | 2615486695 | October  | 12  | 1995 | Sports | ..      | Music | Physics   | Arts    | Biology | img03 | Lavalle 239  | Rajasthan | Jaipur |