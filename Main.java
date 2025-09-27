public class Main {
    public static void main(String[] args) {

        // 🔹 Objeto 1: Guitarra
        Guitarra guitarra1 = new Guitarra("Fender", "Stratocaster", 6, "Roja", true);

        // 🔹 Objeto 2: Reloj
        Reloj reloj1 = new Reloj("Casio", "Digital", "Negro", true, "Plástico");

        System.out.println("\n==============================");
        System.out.println("🎸 INFORMACIÓN DE LA GUITARRA");
        System.out.println("==============================");
        System.out.println("🏷️ Marca: " + guitarra1.getMarca());
        System.out.println("🎨 Color: " + guitarra1.getColor());

        System.out.println("\n===========================");
        System.out.println("⌚ INFORMACIÓN DEL RELOJ");
        System.out.println("===========================");
        System.out.println("🏷️ Marca: " + reloj1.getMarca());
        System.out.println("🎨 Color: " + reloj1.getColor());

        // ✅ Probar algunos métodos
        System.out.println("\n✨ Probando métodos...");
        guitarra1.afinar();
        guitarra1.tocarAcorde("Do mayor");
        guitarra1.conectarAmplificador();

        reloj1.mostrarHora("10:45 AM");
        reloj1.activarAlarma();
        reloj1.cronometroIniciar();
        reloj1.cronometroDetener();
    }
}
