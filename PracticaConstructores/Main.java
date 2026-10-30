package PracticaConstructores;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== LOTE VÁLIDO ===");

        try {
            LoteAtun lote1 = new LoteAtun( "LOTE-100", 100.0, 48.0, 52.0, 3.5);

            lote1.mostrarDatos();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== LOTE INVÁLIDO ===");

        try {
            LoteAtun lote2 = new LoteAtun("LOTE-101", 100.0, 48.0, 52.0, 5.5);

            lote2.mostrarDatos();

        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion capturada: "
                               + e.getMessage());
        }
    }
}
