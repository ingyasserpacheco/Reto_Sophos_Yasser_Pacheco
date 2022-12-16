Feature: Interactuar con 4 tipos de ventanas emergentes
  Yo como automatizador de pruebas de Sophos
  Necesito interactuar con unas ventanas emergentes
  Para activarlas y cerrarlas

  Scenario: Interactuar con ventanas emergentes

    Given Yasser ingresa a la opcion Alerts,Frame & Windows
    When Interactua con cuatro ventanas emergentes
    Then Las activa y cierra segun sus condiciones