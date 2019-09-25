# language: es

  Característica: Creación de nuevo empleado en OrangeHRM
    Como usuario administrador
  quiero crear un nuevo empleado
  para registrar sus datos

  Esquema del escenario: crear nuevo usuario en OrangeHRM
    Dado que Juan necesita crear un empleado en el OrangeHRM
    Cuando el realiza el ingreso del registro en la aplicación
      |firstname|lastname|location|blood|hobbies|region|fte|temporary|
      |<firstname>|<lastname>|<location>|<blood>|<hobbies>|<region>|<fte>|<temporary>|
    Entonces el visualiza el nuevo empleado en el aplicativo
    Ejemplos:
      | firstname | lastname | location | blood | hobbies | region | fte | temporary |
      |Carlos|Trujillo|German Regional HQ|A|Correr|Region-1|0.5|Sub unit-1|
     # |Andrea|Guerrero|London Office|AB|Videojuegos|Region-3|1|sub unit-2|





