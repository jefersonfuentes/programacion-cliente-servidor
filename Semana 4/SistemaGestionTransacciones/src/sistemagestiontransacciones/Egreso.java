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

public class Egreso extends Transaccion {
    public Egreso(double monto, String descripcion, String fecha) throws ExcepcionTransaccion {
        super(monto, descripcion, fecha);
        if (monto > SistemaGestionTransacciones.capital) {
            throw new ExcepcionTransaccion("El egreso excede el capital disponible.");
        }
    }

    @Override
    public double calcularImpuesto() {
        return monto * 0.05; // 5% de impuestos sobre egresos
    }

    @Override
    public void procesarTransaccion() {
        double impuesto = calcularImpuesto();
        SistemaGestionTransacciones.capital -= (monto + impuesto);
        JOptionPane.showMessageDialog(null, "Egreso procesado con éxito.\nImpuesto aplicado: $" + impuesto);
    }
}