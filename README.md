# 🧪 Demoblaze Automation - Serenity BDD

## 📌 Descripción
Este proyecto contiene pruebas automatizadas E2E del flujo de compra en la aplicación web [Demoblaze](https://www.demoblaze.com/), implementadas con **Serenity BDD + Screenplay Pattern**.

El objetivo es validar el comportamiento completo del usuario desde la selección de productos hasta la finalización de la compra.

---

## 🧰 Tecnologías utilizadas

- Java 17
- Gradle (Kotlin DSL)
- Serenity BDD
- Selenium WebDriver
- Screenplay Pattern
- Cucumber (Gherkin)

---

## 🧪 Escenario cubierto

### Flujo E2E de compra:
- Agregar dos productos al carrito
- Visualizar el carrito
- Completar formulario de compra
- Finalizar la compra
- Validar confirmación de compra

---

## 📁 Estructura del proyecto

```
src/test/java
│
├── tasks/               # Acciones del usuario (Screenplay Tasks)
│   ├── AddProduct.java
│   ├── AddtwoProduct.java
│   ├── Checkout.java
│   ├── GoToCart.java
│   ├── Login.java
│   ├── AcceptAlert.java
│
├── ui/                  # Page Objects (Targets)
│   └── DemoblazePage.java
│
├── stepdefinitions/     # Steps de Cucumber
│   ├── BuyMultipleItemsStepDefinitions.java
│   ├── CommonStepDefinitions.java
│   └── Hooks.java
│
├── questions/           # Validaciones
│   └── PurchaseSuccessVisible.java
│
└── runners/             # Runner de pruebas
    └── TestRunner.java
```

---

## ▶️ Ejecución

### 1. Clonar el repositorio
```
git clone <repo-url>
cd demoblaze-sofka
```

### 2. Ejecutar pruebas
```
./gradlew clean test
```

### 3. Ver reporte
```
target/site/serenity/index.html
```

---

## ⚠️ Consideraciones técnicas

- La aplicación utiliza **alertas nativas del navegador**, manejadas mediante:
  ```
  driver.switchTo().alert().accept();
  ```
- Se implementaron **esperas explícitas (WebDriverWait)** para evitar problemas de sincronización.
- Se utiliza el patrón **Screenplay**, promoviendo código limpio y reutilizable.

---

## 🧠 Decisiones técnicas

- Uso de Screenplay para separar responsabilidades (Tasks, Questions, UI).
- Manejo de alertas mediante Task reutilizable (`AcceptAlert`).
- Validación del flujo mediante modal de confirmación (`.sweet-alert`).

---

## 📊 Resultados

- Flujo de compra validado exitosamente
- Manejo correcto de múltiples productos
- Validación final mediante confirmación visual

---

## 📌 Autor
Proyecto realizado como parte de prueba técnica QA Automation.

