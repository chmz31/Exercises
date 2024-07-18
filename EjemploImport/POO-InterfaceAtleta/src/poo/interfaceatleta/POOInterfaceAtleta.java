/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.interfaceatleta;

/**
 *
 * @author alumne
 */
public class POOInterfaceAtleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Crea un nuevo Atleta de nombre Paco y dorsal 45
       Atleta atl1 = new Atleta("Paco",45);
       //Cambia su disciplina a Triatlon
       atl1.setDisciplina("Triatlon"); 
       //Cambia su dorsal a 88
       atl1.setDorsal(88);
       //Imprime el resultado que se obtiene después de que el Atleta vaya a clase, corra, salte y nade.
       atl1.irClase();
       atl1.correr();
       atl1.saltar();
       atl1.nadar();
       
       //imprimimos persona
        System.out.println(atl1);
    }
    
}
