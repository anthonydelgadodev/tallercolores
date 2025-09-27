public class Reloj {

    // 🔹 Atributos
    private String marca;
    private String tipo;      // analógico o digital
    private String color;
    private boolean alarma;
    private String material;

    // 🔹 Constructor
    public Reloj(String marca, String tipo, String color, boolean alarma, String material) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.alarma = alarma;
        this.material = material;
    }

    // 🔹 Getters & Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isAlarma() { return alarma; }
    public void setAlarma(boolean alarma) { this.alarma = alarma; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    // 🔹 Métodos propios
    public void mostrarHora(String hora) {
        System.out.println("⏰ La hora actual es: " + hora);
    }

    public void activarAlarma() {
        if (alarma) {
            System.out.println("🔔 La alarma está activada.");
        } else {
            System.out.println("🚫 Este reloj no tiene alarma.");
        }
    }

    public void desactivarAlarma() {
        if (alarma) {
            System.out.println("🔕 La alarma ha sido desactivada.");
        } else {
            System.out.println("🚫 Este reloj no tiene alarma.");
        }
    }

    public void cronometroIniciar() {
        System.out.println("▶️ Cronómetro iniciado...");
    }

    public void cronometroDetener() {
        System.out.println("⏹️ Cronómetro detenido.");
    }
}
