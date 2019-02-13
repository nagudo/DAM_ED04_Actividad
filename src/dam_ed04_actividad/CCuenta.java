/*
 * Paquete de las clases para la gestión de los datos de una cuenta bancaria.
 */
package dam_ed04_actividad;

/**
 * Clase para la operativa de las cuentas bancarias.
 * @author nacho agudo
 * @version 1.0
 * @since 14.Feb.2019
 */
public class CCuenta {

    /**
     * Devuelve el atributo cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna el valor al atributo cuenta.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el atributo saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asigna el valor al atributo saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de objeto vacío.
     */
    public CCuenta() {
    }

    /**
     * Constructor de cuenta con valores. 
     * @param nom - Nombre del propietario de la cuenta
     * @param cue - Número de cuenta
     * @param sal - Saldo de la cuenta
     * @param tipo - Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Asigna el valor del atributo nombre 
     * haciendo una llamada al método setNombre.
     * @param nom
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Devuelve el valor del atributo nombre 
     * haciendo una llamada al método getNombre.
     * @return 
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Devuelve el valor del atributo saldo
     * haciendo una llamada al método getSaldo.
     * @return
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad determinadad de dinero en la cuenta.
     * @param cantidad - Cantidad de dinero
     * @throws Exception - Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de dinero de la cuenta.
     * @param cantidad - La cantidad de dinero.
     * @throws Exception - Si la cantidad es negativa o no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el valor del atributo cuenta
     * haciendo una llamada al método getCuenta.
     * @return
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Devuelve el valor del atributo nombre.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el valor al atributo nombre.
     * @param nombre - Nombre del propietario de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el tipo de interés.
     * @return - El tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asigna un tipo de interés al objeto cuenta.
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
