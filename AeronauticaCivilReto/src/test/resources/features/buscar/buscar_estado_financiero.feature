# language: es
Característica: : Buscar estados financieros

  Escenario: : Buscar el estado financiero de Estado de Situacion Financiera valido
    Dado Daniel esta buscando los estados financieros en la pagina de Aeronautica Civil
    Cuando Daniel selecciona la opcion de Transparencia
    Y Daniel selecciona del apartado de Transparencia la opcion Presupuesto
    Y Daniel cambia de tab para ver los presupuestos
    Y Daniel selecciona del menu izquierdo la opcion Estados financieros
    Y Daniel selecciona la opcion de Balances
    Y Daniel selecciona el Estado de Situacion Financiera a 30 de abril de 2021
    Entonces Daniel cambia de tab para ver el documento generado
    Y Daniel verifica que el archivo generado se llame "Estado de Situación Financiera a 30 de noviembre de 2021.pdf"

