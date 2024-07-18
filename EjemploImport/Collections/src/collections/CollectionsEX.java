/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alumne
 */
public class CollectionsEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> miArrayList = new ArrayList<>();
        List<Integer> miLinkedList = new LinkedList<>();

        //añadir
        miArrayList.add(4);
        miArrayList.add(3);
        miArrayList.add(7);
        miLinkedList.add(4);
        miLinkedList.add(3);
        miLinkedList.add(7);

        //imprimir
        System.out.println("Impimir AL");
        for (Integer i : miArrayList) {
            System.out.print(i + "  ");
        }
        System.out.println("\nImprimir LL");
        for (Integer i : miLinkedList) {
            System.out.print(i + "  ");
        }

        //Con Iterator borramos 3
        System.out.println("\nBorramos IT");
        Iterator<Integer> it = miLinkedList.iterator();
        while (it.hasNext()) {
            Integer elem = it.next();
            if (elem == 3) {
                miLinkedList.remove(elem);
            }
        }
        //volvemos a imprimir
        System.out.println("\nImprimir LL");
        for (Integer i : miLinkedList) {
            System.out.print(i + "  ");
        }
        
        //ordenar listas
        

    }

}
