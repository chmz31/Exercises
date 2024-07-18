/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author alumne
 */
public class ExampleMap {

    public static void main(String[] args) {
        Map<Integer, String> nombreMap = new HashMap<>();
        //añadir elementos
        nombreMap.put(0, "Alfarero");
        nombreMap.put(1, "Ferretero");
        nombreMap.put(2, "Vidriero");
        //ver tamany
        System.out.println("TAMANY: " + nombreMap.size());
        //Obtener elemento
        System.out.println(nombreMap.get(0));
        //eliminar elemento
        //nombreMap.remove(1);
        //Contiene elemento
        System.out.println("Existe 0? " + nombreMap.containsKey(0));
        System.out.println("Existe Ferretero? " + nombreMap.containsValue("Ferretero"));
        //Iterator de hashmap
        System.out.println("Recorremos con Iterator");
        Iterator It = nombreMap.keySet().iterator();
        while (It.hasNext()) {
            Integer key = (Integer) It.next();
            System.out.println("Clave: "+ key+" | Valor: "+nombreMap.get(key));
        }
        System.out.println("Recorremos con foreach");
        for (Entry<Integer, String> entrada : nombreMap.entrySet()) {
            Integer key = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(key+" | "+valor);
        }
    }
}
