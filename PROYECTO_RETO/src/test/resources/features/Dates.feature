Feature: Seleccionar al azar una fecha y una fecha y hora
  Yo como automatizador de pruebas de Sophos
  Necesito acceder a la pagina web de https://demoqa.com/
  Para seleccionar al azar una fecha y una fecha y hora en Date Picker

  Scenario: Seleccionar aleatoriamente una fecha y una fecha y hora

    Given Yasser quiere ir a la opcion Widgets en Date picker
    When Seleccionar una fecha y fecha y hora al azar
    Then Se definen las fechas