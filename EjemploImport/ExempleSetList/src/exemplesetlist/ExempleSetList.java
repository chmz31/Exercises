/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplesetlist;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author alumne
 */
public class ExempleSetList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet(); //lista auto ordenada
        Collection<Integer> hashSet = new HashSet<>(); //lista ordenada por hash
        tree.add(12);
        tree.add(5);
        tree.add(1);
        tree.add(5);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(-2);
        hashSet.add(4);
        //añadimos duplicado
        System.out.println("\nImprimimos hashSet");
        for (Integer integer : hashSet) {
            System.out.println(integer);
            //vemos que no aparece el duplicado
        }
        System.out.println("\nImprimimos treeList");
        for (Integer i : tree) {
            System.out.println(i);
        }
    }

}
