/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosoo;

/**
 *
 * @author Mario
 */
public class Motocicleta extends Automotor {
  private String  tipoMarco;
  private int horasUso;

    public String getTipoMarco() {
        return tipoMarco;
    }

    public void setTipoMarco(String tipoMarco) {
        this.tipoMarco = tipoMarco;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getTipoFrenoEmer() {
        return tipoFrenoEmer;
    }

    public void setTipoFrenoEmer(String tipoFrenoEmer) {
        this.tipoFrenoEmer = tipoFrenoEmer;
    }

    public double getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(double Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getPermisoCirculacion() {
        return permisoCirculacion;
    }

    public void setPermisoCirculacion(String permisoCirculacion) {
        this.permisoCirculacion = permisoCirculacion;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public String getSistemaDireccion() {
        return sistemaDireccion;
    }

    public void setSistemaDireccion(String sistemaDireccion) {
        this.sistemaDireccion = sistemaDireccion;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAnno() {
        return Anno;
    }

    public void setAnno(String Anno) {
        this.Anno = Anno;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(double maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public String getTipodefreno() {
        return tipodefreno;
    }

    public void setTipodefreno(String tipodefreno) {
        this.tipodefreno = tipodefreno;
    }

    public int getCantidadPas() {
        return cantidadPas;
    }

    public void setCantidadPas(int cantidadPas) {
        this.cantidadPas = cantidadPas;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Motocicleta(String tipoMarco, int horasUso, String Motor, int cantidadPuertas, String tipoFrenoEmer, double Kilometraje, String permisoCirculacion, int cantidadRuedas, String tipoTraccion, String sistemaDireccion, String tipoTransmision, String Marca, String Modelo, String Anno, String Matricula, String Color, String tipoCombustible, double potencia, double maxVelocidad, String tipodefreno, int cantidadPas, double pesoMaximo) {
        super(Motor, cantidadPuertas, tipoFrenoEmer, Kilometraje, permisoCirculacion, cantidadRuedas, tipoTraccion, sistemaDireccion, tipoTransmision, Marca, Modelo, Anno, Matricula, Color, tipoCombustible, potencia, maxVelocidad, tipodefreno, cantidadPas, pesoMaximo);
        this.tipoMarco = tipoMarco;
        this.horasUso = horasUso;
    }
public void levantarRuedaDelantera()
{
  System.out.println("sin miedo al exito!");
}
public void levantarRuedaTrasera()
{
  System.out.println("sin miedo al exito x2!");

}
  @Override
  public void Acelerar()
{
 System.out.println("Ram Ram!");
}

    @Override
    public String toString() {
        return super.toString() + " Motocicleta{" + "tipoMarco=" + tipoMarco + ", horasUso=" + horasUso + '}';
    }

  


}
