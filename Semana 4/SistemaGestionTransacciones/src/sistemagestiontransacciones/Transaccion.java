/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontransacciones;

/**
 *
 * @author JefersonFuentes
 */
public abstract class Transaccion {
    protected double monto;
    protected String descripcion;
    protected String fecha;

    public Transaccion(double monto, String descripcion, String fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    
    public abstract double calcularImpuesto();
    public abstract void procesarTransaccion();

    @Override
    public String toString() {
        return "Transaccion{" + "monto=" + monto + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    
    
}
