Feature: Agregar, verificar y eliminar registros en demoqa
  Yo como automatizador de pruebas de Sophos
  Necesito acceder a la pagina web de https://demoqa.com/
  Para agregar, verificar y eliminar registro en la Web Table

  Scenario Outline: Registros

    Given Yasser quiere ir a la pagina de "<url>"
    When Agregar un nuevo registro ingresando "<firstname>""<lastname>""<email>""<age>""<salary>""<department>"
    Then Se valida que el usuario se cree exitosamente y se elimina

    Examples:
      | url                 | firstname | lastname | email                      | age | salary  | department |
      | https://demoqa.com/ | Yasser    | Pacheco  | ingyasserpacheco@gmail.com | 24  | 1200000 | Ingenieria |

