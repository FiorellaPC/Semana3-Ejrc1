import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Indique producto:");
        String producto = scan.next();
        System.out.println("Indique precio: s/ ");
        double precio = scan.nextDouble();
        System.out.println("Indique su saldo: s/ ");
        double saldo = scan.nextDouble();

        if (saldo >= precio){
            System.out.println("Su saldo es suficiente para adquirir el producto: "+producto);
        }
    }
}
