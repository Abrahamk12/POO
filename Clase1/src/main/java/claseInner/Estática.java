/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseInner;

/**
 *
 * @author super
 */
public class Estática {
    private static String campoEstatico = "Campo estático";

    static class ClaseInternaEstatica {
        void mostrar() {
            System.out.println("Accediendo a: " + campoEstatico);
        }
    }

    public static void main(String[] args) {
        ClaseInternaEstatica interna = new ClaseInternaEstatica();
        interna.mostrar();
    }
}
