package Colecciones;
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

import java.util.LinkedList;
import java.util.Queue;

public class Ejemplos {
    public static void main(String[] args) {
        objetos objeto1 = new objetos();
        objeto1.setDatosValor1(1);
        //ejList();
        //ejSet();
        //ejMap();
        //ejQueue();
    }
    static void ejList(){
        List<String> list = new ArrayList<>();
        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");

        for (String elemento : list) {
            System.out.println(elemento);
        }
    }
    static void ejSet(){
        Set<String> set = new HashSet<>();
        set.add("Elemento 1");
        set.add("Elemento 2");
        set.add("Elemento 3");

        for (String elemento : set) {
            System.out.println(elemento);
        }
    }
    static void ejMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Valor 1");
        map.put(2, "Valor 2");
        map.put(3, "Valor 3");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
    static void ejQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Elemento 1");
        queue.add("Elemento 2");
        queue.add("Elemento 3");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
