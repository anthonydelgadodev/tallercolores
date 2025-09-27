public class Guitarra {

    // 🔹 Atributos
    private String marca;
    private String modelo;
    private int cuerdas;
    private String color;
    private boolean electrica;

    // 🔹 Constructor
    public Guitarra(String marca, String modelo, int cuerdas, String color, boolean electrica) {
        this.marca = marca;
        this.modelo = modelo;
        this.cuerdas = cuerdas;
        this.color = color;
        this.electrica = electrica;
    }

    // 🔹 Getters & Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCuerdas() { return cuerdas; }
    public void setCuerdas(int cuerdas) { this.cuerdas = cuerdas; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isElectrica() { return electrica; }
    public void setElectrica(boolean electrica) { this.electrica = electrica; }

    // 🔹 Métodos propios
    public void afinar() {
        System.out.println("🎶 Afinando la guitarra...");
    }

    public void tocarAcorde(String acorde) {
        System.out.println("🎵 Tocando el acorde de " + acorde);
    }

    public void cambiarCuerda(int numeroCuerda) {
        if (numeroCuerda > 0 && numeroCuerda <= cuerdas) {
            System.out.println("🔧 Cambiando la cuerda número " + numeroCuerda);
        } else {
            System.out.println("⚠️ Número de cuerda inválido.");
        }
    }

    public void conectarAmplificador() {
        if (electrica) {
            System.out.println("🔌 Conectando la guitarra eléctrica al amplificador...");
        } else {
            System.out.println("📢 Esta guitarra no necesita amplificador.");
        }
    }

    public void rasguear() {
        System.out.println("🎸 Rasgueando las cuerdas de la guitarra...");
    }
}
