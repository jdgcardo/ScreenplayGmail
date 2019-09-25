# Autor: Juan Garcia
# language: es

  Característica: Registro nuevo usuario en demo site
    Como cliente
  quiero registrar un nuevo usario en el aplicativo Demo site
  para poder acceder al aplicativo

  Esquema del escenario: Registrar usuario Demo Site
    Dado que Carlos quiere acceder a la Web Automation Demo Site
    Cuando el realiza el registro en la página
      | firstname | lastname | address | email | phone | gender | hobbies | languages | skills | country | selectcountry | yearofbirth | monthofbirth | dayofbirth | password |
      |<firstname>|<lastname>|<address>|<email>|<phone>|<gender>|<hobbies>|<languages>|<skills>|<country>|<selectcountry>|<yearofbirth>|<monthofbirth>|<dayofbirth>|<password>|
    Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row
    Ejemplos:
      | firstname | lastname | address | email | phone | gender | hobbies | languages | skills | country | selectcountry | yearofbirth | monthofbirth | dayofbirth | password |
      |Juan	      |Garcia	 |cra 11   |juan@prueba.com	|3159990011	|Male	|Movies	|Italian	|Android	|Austria	|Japan	|1988	|May	|8	|Jd123456|
      |Camila	  |Cardenas	 |cra 11   |juan@prueba.com	|3159990011	|FeMale	|Cricket|English	|C	|Chile	|India	|2000	|June	|1	|Jd123456|
