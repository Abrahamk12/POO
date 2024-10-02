/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseInner;

/**
 *
 * @author super
 */
public class Local {
    void metodoExterno() {
        class ClaseInternaLocal {
            void mostrar() {
                System.out.println("Dentro de la clase interna local");
            }
        }
        ClaseInternaLocal interna = new ClaseInternaLocal();
        interna.mostrar();
    }

    public static void main(String[] args) {
        Local externa = new Local();
        externa.metodoExterno();
    }
}
