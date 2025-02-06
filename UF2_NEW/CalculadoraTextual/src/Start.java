import java.util.Scanner;
public class Start
{
    public static void main(String[] args) {
        float numA = 0f;
        float numB = 0f;
        float numC = 0f;

        Scanner sc = new Scanner (System.in);

        System.out.println("***********************************");
        System.out.println("***CALCULADORA DE CALCULATOR S.A***");
        System.out.println("***********************************");

        char opcion;

        do{
            System.out.println("Introduce una opción: ");
            System.out.println("1. Función Sumar");
            System.out.println("2. Función Restar");
            System.out.println("3. Función Multiplicar");
            System.out.println("4. Función Dividir");
            System.out.println("5. Función Número mayor de 3 números");
            System.out.println("6. Función Factorial");
            System.out.println("0. Salir");
            opcion = sc.next().charAt(0);

            switch (opcion){

                case '1':
                    System.out.println("Dime el número A");
                    numA = sc.nextFloat();
                    System.out.println("Dime el número B");
                    numB = sc.nextFloat();
                    float resul = sumar(numA, numB);
                    System.out.println("El resultado es: " + resul);
                    break;
                case '2':
                    System.out.println("Dime el número A");
                    numA = sc.nextFloat();
                    System.out.println("Dime el número B");
                    numB = sc.nextFloat();
                    resul = restar(numA, numB);
                    System.out.println("El resultado es: " + resul);
                    break;
                case '3':
                    System.out.println("Dime el número A");
                    numA = sc.nextFloat();
                    System.out.println("Dime el número B");
                    numB = sc.nextFloat();
                    resul = multi(numA, numB);
                    System.out.println("El resultado es: " + resul);
                    break;
                case '4':
                    System.out.println("Dime el número A");
                    numA = sc.nextFloat();
                    System.out.println("Dime el número B");
                    numB = sc.nextFloat();
                    if (numB == 0){
                        System.out.println("Error división por 0");
                    } else { float result = divi(numA, numB);
                        System.out.println("El resultado es: " + result); }
                    break;
                case '5':
                    System.out.println("Dime el número A");
                    numA = sc.nextFloat();
                    System.out.println("Dime el número B");
                    numB = sc.nextFloat();
                    System.out.println("Dime el número C");
                    numC = sc.nextFloat();
                    resul = numMayor(numA, numB, numC);
                    System.out.println("El número mayor de los 3 es: " + resul);
                    break;
                case '6':
                    System.out.println("Dime el número del que quieras saber el Factorial");
                    numA = sc.nextFloat();
                    int numInt = (int) numA;
                    int result = factorial(numInt);
                    if (result == -1) {
                        System.out.println("Error valor inferior a 0, introduzca un valor superior a 0");
                    } else {
                        System.out.println("El factorial de " + numInt + " es " + result);
                    }
                    break;
                case '0':
                    System.out.println("El programa ha finalizado.....");
                    break;
                default:
                    System.out.println("Opción Erronea");

            }



        } while (opcion!= '0');


    }



    public static float sumar(float num1, float num2){

        return num1 + num2;
    }

    public static float restar (float num1, float num2){

        return num1 - num2;
    }

    public static float multi (float num1, float num2){
        return num1 * num2;
    }

    public static float divi (float num1, float num2){
        return num1 / num2;
    }

    public static float numMayor (float num1, float num2, float num3){
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }


    public static int factorial(int num) {
        if (num < 0) { //Devuelve -1 para un número menor que 0
            return -1;
        }

        int result = 1;  //Empiezo con 1 por 0 x 0 daría 0

        for (int i = num; i > 0; i--) {
            result *= i;
        }

        return result;
    }


}