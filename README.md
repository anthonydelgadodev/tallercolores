# 🎸⌚ Proyecto en Java: **Guitarra & Reloj**

Este proyecto en **Java** implementa dos clases basadas en dibujos:  
- Una **Guitarra** 🎶  
- Un **Reloj** ⏰  

Cada clase sigue el formato **AMC** (Atributos, Métodos y Constructor), con:  
✔️ 5 atributos  
✔️ Constructor  
✔️ Getters & Setters  
✔️ 5 métodos propios  

Además, se incluye un `Main.java` para crear objetos de cada clase y probar su funcionamiento.

---

## 📂 Estructura del Proyecto
src/
├── Guitarra.java # Clase que modela una guitarra
├── Reloj.java # Clase que modela un reloj
└── Main.java # Programa principal para probar las clases


---

## 🎸 Clase **Guitarra**

### 🔹 Atributos
- `marca`
- `modelo`
- `cuerdas`
- `color`
- `electrica`

### 🔹 Métodos
- `afinar()`
- `tocarAcorde(String acorde)`
- `cambiarCuerda(int numeroCuerda)`
- `conectarAmplificador()`
- `rasguear()`

---

## ⏰ Clase **Reloj**

### 🔹 Atributos
- `marca`
- `tipo`
- `color`
- `alarma`
- `material`

### 🔹 Métodos
- `mostrarHora(String hora)`
- `activarAlarma()`
- `desactivarAlarma()`
- `cronometroIniciar()`
- `cronometroDetener()`

---

## 🖥️ Clase **Main**

En `Main.java` se crean los objetos y se prueban las clases:

```java
public class Main {
    public static void main(String[] args) {
        Guitarra guitarra1 = new Guitarra("Fender", "Stratocaster", 6, "Roja", true);
        Reloj reloj1 = new Reloj("Casio", "Digital", "Negro", true, "Plástico");

        // Imprimir atributos
        System.out.println("Marca de la guitarra: " + guitarra1.getMarca());
        System.out.println("Color del reloj: " + reloj1.getColor());

        // Probar métodos
        guitarra1.afinar();
        guitarra1.tocarAcorde("Do mayor");

        reloj1.mostrarHora("10:45 AM");
        reloj1.activarAlarma();
    }
}

🚀 Cómo Ejecutar

Clona o descarga este repositorio.

Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse o NetBeans).

Compila y ejecuta el archivo Main.java.

Observa cómo se simula el uso de una guitarra y un reloj en consola. 🎶⌚

✨ Créditos

👨‍💻 Proyecto realizado como práctica de Programación en Java.
🎨 Inspirado en los dibujos: Guitarra y Reloj.
📚 Basado en el modelo AMC (Atributos, Métodos y Constructor).
