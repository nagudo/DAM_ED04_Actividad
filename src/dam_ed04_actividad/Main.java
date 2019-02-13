/*
 * Paquete de las clases para la gestión de los datos de una cuenta bancaria.
 */
package dam_ed04_actividad;

/**
 * Clase principal para la aplicación de gestión de cuentas bancarias.
 * @author nacho agudo
 * @version 1.0
 * @since 14.Feb.2019
 */
public class Main {

    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad = 0;
        
        operativa_cuenta(cantidad);
    }

    /**
     * Método que recoge la operativa del objeto cuenta1.
     * @param cantidad - La cantidad de dinero con la que se va a operar. 
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
