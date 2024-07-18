import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);

        System.out.println("Escribe 3 nombres");

        String nombre1 = sb.nextLine();
        String nombre2 = sb.nextLine();
        String nombre3 = sb.nextLine();
        String barraBaja = "_";

       String transfor1 = nombre1.toUpperCase();
       String resul1 = transfor1.charAt(1) + "."+nombre1.substring(nombre1.length()-2) + barraBaja;

       String transfor2 = nombre2.toUpperCase();
       String resul2 = transfor2.charAt(1) + "."+nombre2.substring(nombre2.length()-2)+ barraBaja;

       String transfor3 = nombre3.toUpperCase();
       String resul3 = transfor3.charAt(1) + "."+nombre3.substring(nombre3.length()-2)+ barraBaja;


        System.out.println(resul1.concat(resul2.concat(resul3)));



    }
}
