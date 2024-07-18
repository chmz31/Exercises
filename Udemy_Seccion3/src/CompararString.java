public class CompararString {
    public static void main(String[] args) {

    String str1 = "Hola Andrés";
    String str2 = new String("Hola Andrés");

       //Chequea sin son el mismo objeto
        System.out.println("Son el mismo objeto? " + (str1 == str2));

        // Chequea si tienen el mismo valor
        System.out.println("Tienen el mismo valor? " + str1.equals(str2));



    }
}

