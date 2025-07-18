# Test-Automatizacion Prueba E2E
## Automatización de casos https://www.saucedemo.com/ y muestra de reportes CUcumber Serenity
Este repositorio contiene un proyecto de prueba automatización E2E para Swag Labs utilizando Java, Cucumber,BDD, Selenium, JUnit 4, Maven. Las pruebas estan diseñadas para cubrir escenarios como: Inicio de sesión, Compra de productos, Verificacion y completar la compra

##Alcance
El proyecto cubre las siguentes áreas del sitio web de Swang Labs
• Autenticarse con el usuario: standard_user y password: secret_sauce • Agregar dos productos al carrito • Visualizar el carrito • Completar el formulario de compra • Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”

##Caracteriísticas
1. Utiliza Cucumber para el desarrollo impulsado por el comportamiento (BDD)
2. Utiliza Selenium para interactuar con elementos web y realizar acciones automatizadas.
3. Proporciona informes de errores y resultados de pruebas fáciles de entender.

##Herramientas utilizadas
Este proyecto de automatización de pruebas para Swag Labs utiliza una variedad de herramientas para optimizar el proceso de prueba y garantizar resultados eficientes y precisos.

-Java jdk-21: el lenguaje de programación principal utilizado para escribir el código de automatización de pruebas.

-Cucumber: una herramienta de desarrollo basado en el comportamiento (BDD) que permite escribir escenarios de prueba en un formato legible por humanos.

-Selenium: un popular marco de código abierto para automatizar las interacciones y pruebas del navegador web.

-Gherkin: un lenguaje de texto sin formato que utiliza palabras clave para definir escenarios de prueba de forma estructurada, haciéndolos fáciles de leer y comprender.

-FirefoxDriver: la implementación de WebDriver para Firefox, que permite a Selenium automatizar las acciones del navegador Chrome.

-JUnit: un marco de prueba ampliamente utilizado para aplicaciones Java, utilizado para ejecutar y gestionar casos de prueba.

-Maven 3.9.4: una herramienta de gestión de dependencias y compilación que simplifica la configuración y el mantenimiento del proyecto.

-IntelliJ IDE: un entorno de desarrollo integrado para Java que proporciona un espacio de trabajo para codificar, probar y depurar.

##Uso
1. Abra el proyecto en Intellj o su IDE preferido.
2. Navegue hasta el directorio `src/test/java`.
3. Localice los archivos de prueba con la extensión `.feature`.
4. Ejecute los archivos de prueba usando maven `mvn clear verify` para ejecutar los escenarios de prueba.
5. Al finalizar se prodrá observar un informe resumido en cucumber
<img width="886" height="483" alt="image" src="https://github.com/user-attachments/assets/e85ab3fc-c16d-4e01-86f0-2bd4568e8239" />
6. Podemos encontrar el informe mas detallado en la ruta `\target\site\cucumber-html-reports` dentro del proyecto y le damos click en abrir con el navegador
<img width="510" height="299" alt="image" src="https://github.com/user-attachments/assets/a7c36a6e-b7d3-4176-b290-e3e57cadf310" />
<img width="1107" height="605" alt="image" src="https://github.com/user-attachments/assets/216c0086-2c8a-4f98-8f34-1b879cf1af7c" />

