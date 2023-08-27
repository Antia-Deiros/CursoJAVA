import java.util.Scanner;

public class BuclesFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media = 0;
        int cantidadnumeros = 3;
        for (int i = 1; i <=cantidadnumeros; i++) {
            System.out.println("Dime un numero: " + i + " de "+cantidadnumeros);
            int num = entrada.nextInt();
            media+=num;
        }
        System.out.println("La media es:"+(media/cantidadnumeros));
        entrada.close();
    }

}
