/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

/**
 *
 * @author super
 */
public class objetos {
    public int valor1, valor2;
    
    public void objetos(int valor1, int valor2){
        this.valor1 = valor1;
      
    }
    public void objetos(int valor1, int valor2, String pata){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public void setDatosValor1(int valor1 ){
        this.valor1 = valor1;
    }
    public void suma(){
        int suma;
        suma = valor1 + valor2;
        
        System.out.println("El resultado de suma valor 1: " + valor1 + " valor 2: "
        +valor2 + " Es igual: " + suma);
    }
}
