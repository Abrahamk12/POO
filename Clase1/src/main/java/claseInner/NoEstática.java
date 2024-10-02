/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseInner;

/**
 *
 * @author super
 */
public class NoEstática {
    private String campoExterno = "Campo externo";

    class ClaseInterna {
        void mostrar() {
            System.out.println("Accediendo a: " + campoExterno);
        }
    }

    public static void main(String[] args) {
        NoEstática externa = new NoEstática();
        NoEstática.ClaseInterna interna = externa.new ClaseInterna();
        interna.mostrar();
    }
}
