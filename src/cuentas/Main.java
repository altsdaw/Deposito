package cuentas;

/**
 * Clase principal que simula un extracto bancario después de realizar operaciones.
 * 
 * @author TuNombre
 * @version 1.0
 * @since 2024
 */
public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        // Creación de cuenta
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();

        // Imprimir encabezado del extracto bancario
        System.out.println("===========================================");
        System.out.println("            EXTRACTO BANCARIO              ");
        System.out.println("===========================================");
        System.out.println("Titular  : " + cuenta1.getNombre());
        System.out.println("Cuenta   : " + cuenta1.getCuenta());
        System.out.println("-------------------------------------------");
        System.out.printf("%-20s %10s %10s\n", "Descripción", "Monto", "Saldo");
        System.out.println("-------------------------------------------");
        System.out.printf("%-20s %10.2f %10.2f\n", "Saldo inicial", 0.0, saldoActual);

        // Realizar operaciones
        operaciones(cuenta1);

        // Mostrar saldo final
        saldoActual = cuenta1.estado();
        System.out.println("-------------------------------------------");
        System.out.printf("%-20s %10s %10.2f\n", "Saldo final", "", saldoActual);
        System.out.println("===========================================");
    }

    /**
     * Método que realiza operaciones de retiro e ingreso en la cuenta.
     * 
     * @param cuenta1 Cuenta bancaria donde se realizarán las operaciones.
     */
    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        double retiro = 2300;
        double ingreso = 685;

        // Realizar retiro
        System.out.printf("%-20s %10.2f %10.2f\n", "Retiro", retiro, cuenta1.getSaldo() - retiro);
        cuenta1.retirar(retiro);

        // Realizar ingreso
        System.out.printf("%-20s %10.2f %10.2f\n", "Ingreso", ingreso, cuenta1.getSaldo() + ingreso);
        cuenta1.ingresar(ingreso);
    }
}
