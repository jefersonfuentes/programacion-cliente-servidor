/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransacciones;
import javax.swing.JOptionPane;

/**
 *
 * @author JefersonFuentes
 */
public class Ingreso extends Transaccion {
    public Ingreso(double monto, String descripcion, String fecha) throws ExcepcionTransaccion {
        super(monto, descripcion, fecha);
        if (monto < 0) {
            throw new ExcepcionTransaccion("El monto no puede ser negativo para un ingreso.");
        }
    }

    @Override
    public double calcularImpuesto() {
        return monto * 0.10; // 10% de impuesto sobre ingresos
    }

    @Override
    public void procesarTransaccion() {
        double impuesto = calcularImpuesto();
        SistemaGestionTransacciones.capital += (monto - impuesto);
        JOptionPane.showMessageDialog(null, "Ingreso procesado con éxito.\nImpuesto aplicado: $" + impuesto);
    }
}
