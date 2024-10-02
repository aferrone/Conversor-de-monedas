<h1>Conversor de Monedas en Java</h1>
<h3>Descripción</h3>
<p>Este proyecto es un conversor de monedas desarrollado en Java que permite a los usuarios convertir cantidades de una moneda a otra utilizando datos de una API de tasas de cambio en tiempo real. El programa interactúa con el usuario a través de un menú simple y solicita la cantidad, la moneda de origen y la moneda de destino. Utiliza la API de ExchangeRate para obtener las tasas de cambio actualizadas.</p>

<h2>Estructura del Proyecto</h2>
El programa está compuesto por tres clases principales:

<ul>ConversorDeMonedas.java: Maneja la lógica de la conversión y la obtención de tasas de cambio a través de la API.</ul>
<ul>MenuConversor.java: Muestra un menú interactivo para el usuario, permitiendo elegir la conversión de monedas o salir del programa.</ul>
<ul>Principal.java: Es el punto de entrada del programa y coordina la ejecución del menú y la lógica de conversión.</ul>
<h2>Instalación y Ejecución</h2>
<h4>Requisitos</h4>
<ul>Java JDK 8 o superior</ul>
<ul>Conexión a Internet (para la obtención de tasas de cambio en tiempo real)</ul>
<ul>Clonar el Repositorio</ul>
<ul>Copiar código</ul>
<ul>Compilar y Ejecutar el Programa</ul>



<h2>Funcionamiento</h2>
Al iniciar el programa, se mostrará un menú de bienvenida con las siguientes opciones:

<ul>1. Convertir moneda: El usuario podrá ingresar la cantidad y las monedas para la conversión.</ul>
<ul>2. Salir: Finaliza la ejecución del programa.</ul>

<h3>Si el usuario selecciona la opción de conversión:</h3>

<ul>Se le pedirá ingresar la cantidad a convertir.</ul>
Luego, el usuario debe ingresar el código de la moneda principal (por ejemplo, USD para dólares).
A continuación, se solicita el código de la moneda destino (por ejemplo, EUR para euros).
El programa realiza la conversión y muestra el resultado.
El programa utiliza la API de ExchangeRate para obtener las tasas de cambio actuales. En caso de error en la conexión o en la conversión, el programa muestra un mensaje de error.

<h2>Ejemplo de Ejecución</h2>

<ul>¡Bienvenido al Conversor de Monedas!</ul>
<ul>Selecciona una opción:</ul>
<ul>1. Convertir moneda</ul>
<ul>2. Salir</ul>
<ol> Seleccionando la opcion 1
  
  <ul>Introduce la cantidad a convertir: 100</ul>
  <ul>Introduce la moneda principal: USD</ul>
  <ul>Introduce la moneda secundaria: EUR</ul>
  <ul>100 USD son equivalentes a 85.50 EUR</ul>
  </ol>
  
<h3>API Utilizada</h3>
El programa hace uso de la API de ExchangeRate-API para obtener las tasas de cambio actuales.
URL Base: https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/
<strong>Recuerda que necesitarás tu propia clave de API para ejecutar el programa correctamente.</strong>

Si deseas contribuir a este proyecto, ¡eres bienvenido! Puedes hacer un fork del repositorio, crear tus propias ramas y enviar tus pull requests.
