package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 * 
 * @author TuNombre
 * @version 1.0
 * @since 2024
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número de cuenta bancaria */
    private String cuenta;
    
    /** Saldo disponible en la cuenta */
    private double saldo;
    
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInteres;

    /**
     * Constructor vacío de CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * 
     * @param nom  Nombre del titular.
     * @param cue  Número de cuenta.
     * @param sal  Saldo inicial.
     * @param tipo Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo disponible en la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un retiro de dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta: " + cantidad);

            if (cantidad <= 0)
                throw new Exception("No se puede retirar una cantidad negativa");
            if (estado() < cantidad)
                throw new Exception("No hay suficiente saldo");

            saldo = saldo - cantidad;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Realiza un ingreso de dinero en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta: " + cantidad);

            if (cantidad < 0)
                throw new Exception("No se puede ingresar una cantidad negativa");

            saldo = saldo + cantidad;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible.
     * 
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés.
     * 
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
