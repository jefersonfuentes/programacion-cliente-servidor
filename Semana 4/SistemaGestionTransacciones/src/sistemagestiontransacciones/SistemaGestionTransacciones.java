/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestiontransacciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author JefersonFuentes
 */
public class SistemaGestionTransacciones {

    /**
     * @param args the command line arguments
     */

    static double capital = 1500.0;
    static ArrayList<Transaccion> transacciones = new ArrayList<>();
    
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("""
                    --- SISTEMA DE GESTIÓN DE TRANSACCIONES ---
                    1. Realizar Ingreso
                    2. Realizar Egreso
                    3. Eliminar Transacción
                    4. Mostrar Transacciones
                    5. Salir
                    Seleccione una opción:""");

            if (opcion == null || opcion.equals("5")) {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                break;
            }

            switch (opcion) {
                case "1":
                    realizarIngreso();
                    break;
                case "2":
                    realizarEgreso();
                    break;
                case "3":
                    eliminarTransaccion();
                    break;
                case "4":
                    mostrarTransacciones();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private static void realizarIngreso() {
        try {
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto del ingreso:"));
            String descripcion = JOptionPane.showInputDialog("Ingrese descripción:");
            String fecha = JOptionPane.showInputDialog("Ingrese fecha (YYYY-MM-DD):");

            Ingreso ingreso = new Ingreso(monto, descripcion, fecha);
            ingreso.procesarTransaccion();
            transacciones.add(ingreso);
        } catch (ExcepcionTransaccion e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado, intente nuevamente.");
        }
    }

    private static void realizarEgreso() {
        try {
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto del egreso:"));
            String descripcion = JOptionPane.showInputDialog("Ingrese descripción:");
            String fecha = JOptionPane.showInputDialog("Ingrese fecha (YYYY-MM-DD):");

            Egreso egreso = new Egreso(monto, descripcion, fecha);
            egreso.procesarTransaccion();
            transacciones.add(egreso);
        } catch (ExcepcionTransaccion e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado, intente nuevamente.");
        }
    }

    private static void eliminarTransaccion() {
        if (transacciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay transacciones para eliminar.");
            return;
        }

        StringBuilder lista = new StringBuilder("--- TRANSACCIONES ---\n");
        for (int i = 0; i < transacciones.size(); i++) {
            lista.append(i).append(". ").append(transacciones.get(i)).append("\n");
        }
        lista.append("Capital actual: $").append(capital);

        String indexStr = JOptionPane.showInputDialog(lista + "\nIngrese el índice de la transacción a eliminar:");
        if (indexStr == null) return;

        try {
            int index = Integer.parseInt(indexStr);
            if (index < 0 || index >= transacciones.size()) {
                JOptionPane.showMessageDialog(null, "Índice no válido.");
                return;
            }

            Transaccion transaccion = transacciones.remove(index);
            if (transaccion instanceof Ingreso) {
                capital -= transaccion.monto;
            } else if (transaccion instanceof Egreso) {
                capital += transaccion.monto;
            }

            JOptionPane.showMessageDialog(null, "Transacción eliminada con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la transacción.");
        }
    }

    private static void mostrarTransacciones() {
        if (transacciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay transacciones registradas.");
            return;
        }

        StringBuilder lista = new StringBuilder("--- TRANSACCIONES ---\n");
        for (int i = 0; i < transacciones.size(); i++) {
            lista.append(i).append(". ").append(transacciones.get(i)).append("\n");
        }
        lista.append("Capital actual: $").append(capital);

        JOptionPane.showMessageDialog(null, lista);
    }
    
}
