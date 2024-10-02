/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseInner;

/**
 *
 * @author super
 */
public class Anónima {
    interface MiInterfaz {
        void mostrar();
    }

    void metodoExterno() {
        MiInterfaz interna = new MiInterfaz() {
            @Override
            public void mostrar() {
                System.out.println("Dentro de la clase interna anónima");
            }
        };
        interna.mostrar();
    }
    public static void main(String[] args) {
        Anónima externa = new Anónima();
        externa.metodoExterno();
    }
}
