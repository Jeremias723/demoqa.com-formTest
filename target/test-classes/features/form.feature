Feature: Completado de formulario en demoqa.com

  Este feature trata sobre llenar un formulario auntomaticamente
  utilizando Selenium, Serenity, Cucumber, Junit

  Scenario Outline: Proceso de completado

    Given El usuario ingresa a demoqa.com
    When Complete con su nombre: <Nombre> y apellido: <Apellido>
    And Complete su E-mail: <E-mail>
    And Indique su genero: <Genero>
    And Complete su numero de telefono: <Numero>
    And Indique su fecha de nacimiento: <Mes> , <Dia> , <Anio>
    And Selecciona sus hobbies: <Hob1> , <Hob2> , <Hob3>
    And Complete sus aptitudes: <Apt1> , <Apt2> , <Apt3>
    And El usuario sube la foto: <img>
    And Ingresa su direccion: <direccion>
    And Selecciona su estado y ciudad: <estado> , <ciudad>
    And El usuario hace click en en boton 'Submit'
    Then Se verificaran los datos enviados

    Examples:
      | Nombre   | Apellido | E-mail                    | Genero | Numero     | Mes      | Dia | Anio | Hob1   | Hob2    | Hob3  | Apt1      | Apt2    | Apt3    | img   | direccion    | estado    | ciudad |
      | Jeremias | Manzano  | jeremiasmanzano@gmail.com | Male   | 2616662695 | February | 13  | 1999 | Sports | Reading | ..    | Chemistry | English | Maths   | img01 | Soler 38     | NCR       | Delhi  |
      | Antonio  | Gallardo | Antonio@gmail.com         | Other  | 2616547695 | January  | 22  | 1997 | ..     | Reading | ..    | Commerce  | Civics  | Arts    | img02 | Swipacha 873 | Haryana   | Karnal |
      | Lucia    | Diaz     | luciaD@gmail.com          | Female | 2615486695 | October   | 12  | 1995 | Sports | ..      | Music | Physics   | Arts    | Biology | img03 | Lavalle 239  | Rajasthan | Jaipur |