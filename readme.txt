INSTRUCCIONES DE EJECUCIÓN - PROYECTO SERENITY BDD & SCREENPLAY

Este proyecto automatiza la prueba funcional End-to-End (E2E) para la compra exitosa de dos productos en el sitio https://www.saucedemo.com/.

1. PRERREQUISITOS
- Java 17 o superior instalado y configurado en sus variables de entorno (JAVA_HOME).
- Conexión a internet para la descarga de dependencias de Gradle.
- Navegador Google Chrome actualizado.

2. CÓMO EJECUTAR LA PRUEBA E2E (DESDE TERMINAL)
El proyecto cuenta con el Gradle Wrapper incluido, por lo que NO es necesario tener Gradle instalado globalmente.

- Paso A: Abra su terminal de preferencia y navegue hasta el directorio raíz del proyecto (donde se encuentra este readme.txt).
- Paso B: Ejecute el siguiente comando para correr las pruebas:

   En Windows:
   gradlew.bat test

   En Linux o Mac:
   ./gradlew test

3. VISUALIZAR EL REPORTE DE SERENITY BDD
Serenity es conocido por su excelente 'Living Documentation'.
Al finalizar la prueba, el reporte visual (con evidencias captura a captura y del escenario) se generará automáticamente.

- OPCIÓN LOCAL: Diríjase a la ruta `target/site/serenity/index.html` y abra este archivo index.html en cualquier navegador.
- OPCIÓN ONLINE (RECOMENDADA): El proyecto cuenta con un proceso de Integración Continua (GitHub Actions) que despliega el reporte "Living Documentation" automáticamente. Puede visualizar el resultado de la ejecución exitosa de este proyecto dirigiéndose a la siguiente URL en la nube de GitHub Pages:
  👉 https://christopherpalloarias.github.io/SERENITY_CHALLENGE/

4. ESTRUCTURA DEL PROYECTO (PATRÓN SCREENPLAY)
- src/test/resources/features/: Contiene el archivo checkout.feature escrito en lenguaje Gherkin.
- src/test/java/com/saucedemo/runners/: Contiene el ejecutor de la prueba.
- src/test/java/com/saucedemo/stepdefinitions/: Aquí se enlazan los pasos del feature con las acciones del Actor.
- src/test/java/com/saucedemo/tasks/: Lógica de negocio encapsulada por cada acción específica (Login, FillCheckout, etc).
- src/test/java/com/saucedemo/ui/: Mapeo de elementos de interfaz de usuario usando 'Target'.
- src/test/java/com/saucedemo/questions/: Verificaciones y afirmaciones para comprobar que la compra fue exitosa.
