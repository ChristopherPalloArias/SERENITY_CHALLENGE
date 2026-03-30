<div align="center">
  
# 🚀 SAUCEDEMO_E2E_AUTOMATION

### Reto Técnico: Automatización Funcional con Serenity BDD y Screenplay

**Autor:** Christopher Ismael Pallo Arias  
**Correo:** christopher.pallo@sofka.com.co  
**Celular:** 0995312828  
**Proyecto:** Prueba End-to-End (E2E) del flujo de compras en SauceDemo  
**Objetivo:** Automatizar la autenticación, agregar productos y validar aserciones exactas del checkout utilizando el patrón Screenplay.

<br />

### 🛠️ Technology Stack

**Quality Assurance & Automation Framework**
<br />
<img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
<img src="https://img.shields.io/badge/Serenity_BDD-4.1.14-80C342?style=for-the-badge&logo=testinglibrary&logoColor=white" alt="Serenity BDD" />
<img src="https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white" alt="Cucumber" />
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" />
<br />
<a href="https://skillicons.dev">
  <img src="https://skillicons.dev/icons?i=java,github,githubactions" alt="Automation Stack" />
</a>

</div>

---

## 📌 Panel de Evaluación y Entregables Solicitados

> ⚠️ **ATENCIÓN EVALUADOR:** Todos los insumos obligatorios exigidos en el documento del ejercicio fueron resueltos, documentados y pueden ser auditados de forma inmediata:

- 📄 **Instrucciones de Ejecución:** [`readme.txt`](./readme.txt) 
- 🧠 **Hallazgos y Conclusiones QA:** [`conclusiones.txt`](./conclusiones.txt) 
- 📊 **Evidencia de Ejecución (Reporte Serenity BDD):** 👉 **[Visualizar Reporte E2E Interactivo en GitHub Pages](https://ChristopherPalloArias.github.io/SERENITY_CHALLENGE/)**

---

## 📋 Tabla de Contenidos
1. [Contexto del Reto](#-contexto-del-reto)
2. [Entorno y Prerrequisitos](#️-entorno-y-prerrequisitos)
3. [Arquitectura y Estructura del Framework](#️-arquitectura-y-estructura-del-framework)
4. [Instrucciones de Clonado y Setup](#-instrucciones-de-clonado-y-setup)
5. [Ejecución y Generación de Reportes](#️-ejecución-y-generación-de-reportes)
6. [Integración Continua (CI/CD)](#-integración-continua-cicd)
7. [Consideraciones Técnicas y Retos Resueltos](#-consideraciones-técnicas-y-retos-resueltos)

---

## 🎯 Contexto del Reto

Este repositorio corresponde a la solución del **Ejercicio 1** del reto técnico de Automatización de Pruebas. El objetivo es certificar el dominio técnico sobre la implementación de pruebas funcionales automatizadas utilizando la herramienta **Serenity BDD** bajo el patrón de diseño **Screenplay** y **Cucumber** para la legibilidad de Behavior-Driven Development (BDD).

La prueba exige validar el flujo de compra iterativo en la página [SauceDemo](https://www.saucedemo.com/), logrando de principio a fin las siguientes acciones:
- Autenticarse con credenciales estándar (`standard_user`, `secret_sauce`).
- Agregar exactamente dos productos al carrito de compras.
- Visualizar el carrito y completar el formulario con datos personales.
- Finalizar la compra de manera exitosa.
- **Validar asertivamente la confirmación exacta:** `THANK YOU FOR YOUR ORDER`.

---

## 🛠️ Entorno y Prerrequisitos

> ⚠️ **El proyecto goza de portabilidad nativa gracias al Gradle Wrapper, por lo cual no requiere instalación global de parámetros de compilación.**

| Componente | Versión Sugerida | Notas |
|------------|------------------|--------------|
| **Java JDK** | `17 o superior` | Requerido en variables de entorno (`JAVA_HOME`) |
| **Navegador** | `Google Chrome` | Última versión |
| **Git** | `2.30+` | Para versionamiento |

*(La suite descarga sus propias dependencias a través de `./gradlew` y levanta automáticamente los WebDrivers correspondientes en ejecución).*

---

## 🏗️ Arquitectura y Estructura del Framework (Screenplay)

El repositorio abandona el arcaico Page Object Model simple y abraza el principio fundamental de modularidad utilizando **Screenplay Pattern**, logrando que *quién* interactúa (el Actor) se separe de *cómo* está orquestada la interfaz de usuario.

| Capa | Ruta Interna | Responsabilidad |
|---|---|---|
| 📝 **Features** | `resources/features/` | Archivo Gherkin (`checkout.feature`). Lenguaje de negocio (Given/When/Then). |
| 🏃 **Runners** | `runners/` | Punto de entrada dinámico (Cucumber-JUnit) manejado por `SauceDemoRunner`. |
| ⚙️ **Steps** | `stepdefinitions/` | Engranaje que une el Gherkin con los Actores y Tareas de Screenplay. |
| 🎬 **Tasks** | `tasks/` | Lógica de negocio orquestada. Tareas de paso como `Login` o `FinishPurchase`. |
| 🔍 **Questions** | `questions/` | Extrae la realidad del sistema y expone las validaciones visuales asertivas. |
| 🧩 **UI / Targets** | `ui/` | Diccionario base de localizadores web de elementos (Selectores, Xpaths, IDs). |

---

## ⚡ Instrucciones de Clonado y Setup

### Paso 1: Clonar este Repositorio
```bash
git clone https://github.com/ChristopherPalloArias/SERENITY_CHALLENGE.git
cd SERENITY_CHALLENGE
```

---

## ▶️ Ejecución y Generación de Reportes

Para despachar la prueba desde terminal de manera ágil (lo cual levantará brevemente el navegador de forma gráfica para ver la automatización visualmente) utiliza el Gradle Wrapper incorporado en el proyecto.

**En Windows:**
```bash
gradlew.bat clean test aggregate
```
**En Mac / Linux:**
```bash
./gradlew clean test aggregate
```

Al concluir el escenario de compra, Serenity BDD tejerá un poderoso formato de **Living Documentation**. 
Puedes ir a la ruta local arrojada y visualizar todas las evidencias y métricas:
`target/site/serenity/index.html`

---

## 🌐 Integración Continua (CI/CD)

El proyecto incluye de manera sofisticada un Action (`.github/workflows/serenity-report.yml`) configurado con Java 17 y Gradle 8.8 que compila y lanza la prueba E2E (en modo server-headless) cada que existe un cambio en el repositorio de manera autónoma.

Como valor agregado y demostración de dominio del ecosistema, **la suite despliega automática y centralizadamente el Reporte Vivo a la web pública**. 
El resultado documentado de esta automatización puede auditarse aquí:
👉 **[Reporte Serenity Público en GitHub Pages](https://ChristopherPalloArias.github.io/SERENITY_CHALLENGE/)**

---

## 🧩 Consideraciones Técnicas y Retos Resueltos

* **Aserción Fiel mediante Manipulación Funcional de DOM (Questions):**  
  La página de SauceDemo emite el título por convención semántica con signos ortográficos visuales (`Thank you for your order!`). No obstante, el reto requería una precisión total contra el string `"THANK YOU FOR YOUR ORDER"`. Se resolvió de manera altamente profesional purificando dinámicamente la extracción de texto a nivel del *Question* (`OrderConfirmation.java`) ejecutando sanitización algorítmica (`replace()` y `.toUpperCase()`). Esto hace a la aserción inmune a cambios superficiales de exclamación al tiempo que cumple el requerimiento del negocio estricto.

* **Ejecución Agnóstica y Ciega en Nubes Públicas (Headless Mode Injection):**  
  Pese a que el archivo global `.conf` dictaminaba ejecución visual por fines de Debug, fallaría invariablemente en entornos CI (como el Runner de GitHub) al carecer estos de ventanas. Para sortearlo sin mermar la experiencia de usuario, el flujo fue modificado estratégicamente dentro del pipeline de Github Actions inyectando una sobreescritura dinámica de Propiedad (`-Dheadless.mode=true`), permitiendo asombrosamente que corra blindado en la nube pero siga siendo gráfica en computadoras locales.

* **Separación Real de Responsabilidades Estructurales:**  
  La escalabilidad a futuro en un Framework E2E es vital. Cada set de interacciones en el flujo de compras está segmentado algorítmicamente y expuesto modularmente (`AddProducts`, `GoToCart`, `FillCheckoutForm`) dentro de su Task. Si una futura historia de usuario solicita testear la compra de únicamente un producto, se reutilizarán directamente las tareas sin incurrir deliberadamente en refactorización de código espagueti.
