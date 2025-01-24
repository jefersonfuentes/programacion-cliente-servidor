package com.mycompany.lec01;

public class Lec01 {

    public static void main(String[] args) {
        // Instancia (Objeto)

        String estadio = "Santiago Bernabeu";

        Equipo equipo1 = new Equipo("Real Madrid", "Madrid", 1902, estadio, 35);

        Equipo equipo2 = new Equipo("FC Barcelona", "Barcelona", 1899, "Camp Nou");

        System.out.println(equipo1.getCantidadTitulos());
        System.out.println(equipo2.getCantidadTitulos());

        equipo2.setCantidadTitulos(26);

        System.out.println(equipo2.getCantidadTitulos());

        System.out.println(equipo1.toString());
        System.out.println(equipo2);


    }
}
