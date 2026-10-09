# 🔐 Simulación de Control de Acceso por Credencial (POO en Java)

Este proyecto es una aplicación en Java que modela un sistema de seguridad de acceso físico. Simula la lectura de tarjetas magnéticas/credenciales, la verificación de niveles de privilegio y la autorización de entrada a zonas restringidas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema se compone de 4 clases principales:

*   **`Credencial`**: Modela la tarjeta física del usuario.
    *   **Atributos:** `codigo` (identificador de la tarjeta) y `nivelAcceso` (valor numérico que determina la jerarquía de permisos).
    *   **Métodos:** Métodos de acceso y modificación (*getters* y *setters*).
*   **`ControladorDeAcceso`**: Entidad encargada de aplicar las reglas de seguridad.
    *   **Métodos:** `verificarAcceso(Credencial credencial, String zona)`, evalúa si el nivel de acceso de la tarjeta satisface el umbral de seguridad (nivel $\ge 3$).
*   **`LectorTarjeta`**: Representa el hardware/dispositivo físico de lectura.
    *   **Atributos:** Mantiene la referencia a la instancia del `ControladorDeAcceso`.
    *   **Métodos:** `leerTarjeta(Credencial credencial, String zona)`, simula el escaneo de la tarjeta, solicita la validación al controlador e imprime el veredicto ("Tarjeta autorizada" o "Acceso denegado").
*   **`Main`**: Instancia el sistema de control, el lector y dos credenciales con distintos niveles de privilegio para probar el comportamiento.

---

## ⚙️ Reglas de Validación y Flujo de Operación

1. **Lectura del Dispositivo:** El `LectorTarjeta` recibe el objeto `Credencial` y la `zona` a la que se intenta ingresar.
2. **Evaluación de Jerarquía:** El `ControladorDeAcceso` obtiene el nivel mediante `credencial.getNivelAcceso()` y lo compara contra el mínimo requerido ($3$).
3. **Decisión de Autorización:**
   * **Nivel $\ge 3$:** Retorna `true` y el lector autoriza la entrada.
   * **Nivel $< 3$:** Retorna `false` y el lector deniega el acceso.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera la siguiente salida:

```text
leyendo tarjeta: Tarjeta001
Tarjeta autorizada.
leyendo tarjeta: Tarjeta002
Acceso denegado.
