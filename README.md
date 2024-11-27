
# JavaFX Calculator

Una calculadora simple pero funcional desarrollada en **JavaFX**. Esta aplicación permite realizar operaciones matemáticas básicas y tiene una interfaz gráfica amigable y personalizable.

## Características

- **Operaciones básicas**: Suma, resta, multiplicación, división.
- **Interfaz gráfica (GUI)**: Botones numéricos y de operadores.
- **Evaluador de expresiones**: Maneja la precedencia de operaciones.
- **Historial de operaciones** (opcional): Visualización de cálculos realizados.
- **Diseño personalizable**: Estilos definidos en `styles.css`.

## Requisitos

- **Java JDK 17 o superior** (compatible con JavaFX).
- **Maven** configurado en el proyecto.

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   ├── estebangmz666/
│   │   │   ├── Calculator.java               # Clase principal
│   │   │   ├── controller/
│   │   │   │   └── MainDashboardController.java # Controlador principal
│   │   │   └── util/
│   │   │       └── ExpressionEvaluator.java  # Evaluador de expresiones
│   ├── resources/
│       └── view/
│           ├── MainDashboard.fxml            # Interfaz de la calculadora
│           └── styles.css                    # Estilos personalizados
```

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/calculator
   cd calculator
   ```

2. **Abrir en tu IDE favorito**:
   - IntelliJ IDEA, Eclipse o cualquier otro compatible con Maven.

3. **Configurar JavaFX**:
   - Asegúrate de que tu IDE tenga configuradas las librerías de JavaFX.
   - En Maven, revisa el archivo `pom.xml`:
     ```xml
     <dependency>
         <groupId>org.openjfx</groupId>
         <artifactId>javafx-controls</artifactId>
         <version>17.0.2</version>
     </dependency>
     <dependency>
         <groupId>org.openjfx</groupId>
         <artifactId>javafx-fxml</artifactId>
         <version>17.0.2</version>
     </dependency>
     ```

4. **Ejecutar la aplicación**:
   - Desde el IDE, ejecuta la clase `Calculator`.
   - Alternativamente, usa Maven:
     ```bash
     mvn clean javafx:run
     ```

## Uso

- **Interfaz gráfica**:
  - Ingrese números usando los botones.
  - Seleccione operadores como `+`, `-`, `*`, `/`.