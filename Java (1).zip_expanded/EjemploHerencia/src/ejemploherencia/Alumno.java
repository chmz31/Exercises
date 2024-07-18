/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumne
 */
public class Alumno extends Persona {
    public String clase;

    public Alumno() {
        this.clase = "DAM1";
    }

    public Alumno(String clase, String nombre) {
        super(nombre);
        this.clase = clase;
    }


    @Override
    public String toString() {
        return "clase: " + clase + " nombre: "+nombre;
    }
    
}

