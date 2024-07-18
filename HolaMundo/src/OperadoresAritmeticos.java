import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j, resta = i - j, multi = i * j, divi = i / j, resto = i % j;
        float divi2 = (float) i / j; // Con los parentesis hago un cast (forzar la conversión del int I a un float

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));

        System.out.println("resta = " + resta);

        System.out.println("multiplicación = " + multi);

        System.out.println("división = " + divi);
        System.out.println("divi2 = " + divi2);

        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else{
            System.out.println("numero impar = " + numero);
        }
    }
}
