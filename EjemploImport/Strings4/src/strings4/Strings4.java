/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Recibimos de una API el dato de día y hora en forma de string tal que:
string «2018-12-05T18:45:00Z»
 */
public class Strings4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //inicializamos el String
        String fecha = "2018-12-05T18:45:00Z";
        System.out.println("la hora es: "+stringAHora(fecha));
        //usamos DATE para que nos lea la fecha
        Date fecha1=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(fecha);  
        //Usamos otro DateFormat para que la convierta al formato que queremos
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd 'de' MMMMM 'de' yyyy");
        String fechaFormateada = outputFormat.format(fecha1);
        //Imprimimos la fecha final
        System.out.println(fechaFormateada);
        
    }
    
    public static int stringAHora(String fecha){
        //Indica el numero de la hora recibida (en formato entero), en nuestro caso debería ser 18.
        int hora = Integer.valueOf(fecha.substring(11, 13));
        return hora;
    }
    
}
