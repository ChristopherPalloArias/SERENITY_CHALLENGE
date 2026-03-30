===========================================================
EJERCICIO 1: Automatización Funcional E2E (Serenity BDD)
Instrucciones de Ejecución Paso a Paso
===========================================================

NOTA IMPORTANTE: 
Toda la metodología, arquitectura de pruebas (Screenplay)
y justificaciones técnicas elaboradas, se encuentran documentadas 
exhaustivamente en el archivo "README.md" central ubicado 
en la raíz de este repositorio, donde pueden visualizarse. 
A continuación, se detalla lo estrictamente solicitado para la ejecución.

1. TECNOLOGÍAS Y VERSIONES A USAR
-----------------------------------------------------------
- QA Framework Automatización: Serenity BDD (v4.1.14)
- Orquestador de Interfaz BDD: Cucumber (Gherkin syntax)
- Lenguaje / Plataforma: Java JDK (Versión 17 LTS requerida)
- Gestor de Tareas y Compilación: Gradle (Wrapper embebido v8.8)
- Navegador Local: Google Chrome (Última versión instalada)

2. INSTRUCCIONES DE EJECUCIÓN PASO A PASO (CÓMO REPLICAR EL TEST)
-----------------------------------------------------------
Paso 1: Abra una terminal o línea de comandos en su sistema.

Paso 2: Clonar el proyecto público y posicionarse en la carpeta raíz.
> git clone https://github.com/ChristopherPalloArias/SERENITY_CHALLENGE.git
> cd SERENITY_CHALLENGE

Paso 3: Verifique en su terminal que Java 17 se encuentre correctamente expuesto en sus Variables de Entorno (JAVA_HOME).
> java -version

Paso 4: Descargue las dependencias, limpie previas compilaciones y ejecute la suite de pruebas E2E.
(El proyecto corre automáticamente el ciclo WebDriver configurado hacia "https://www.saucedemo.com/").

En Windows:
> gradlew.bat clean test aggregate

En Linux / macOS:
> ./gradlew clean test aggregate

3. EVIDENCIAS Y REPORTES OFICIALES (LIVING DOCUMENTATION)
-----------------------------------------------------------
Serenity BDD construye tras bastidores un formato asombroso de reporte interactivo al que denomina "Living Documentation", el cual incluye captura de pantalla instantánea asertiva a cada paso (Step) interceptado.

- Ubique en su sistema local la ruta generada (tras terminar el script):
  /target/site/serenity/
- Dé doble clic sobre el archivo maestro interactivo: 
  index.html

Ahí se visualizarán exitosamente todas las interacciones de Screenplay mapeadas hacia el Feature de SauceDemo en completo verde (Passed).
