import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura o descripción:");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del producto #1: ");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del prodcuto #2: ");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;

        String resultado = "La factura " + nombreFactura + " tiene un total bruto de: " +  totalBruto +
        " con un impuesto de " + impuesto + " y el monto después del impuesto es de: " + (totalBruto + impuesto);

        System.out.println(resultado);


    }
}


