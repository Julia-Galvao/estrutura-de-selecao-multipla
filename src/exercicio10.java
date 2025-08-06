import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("valor inteiro e positivo: ");
        numero = sc.nextInt();

        if (numero <= 0){
            System.out.println("O valor deve ser inteiro e positivo:");
        }
        else {
            for (int cont = 1; cont <= numero; cont ++){
                if (numero % cont == 0) {
                    System.out.println(cont + " ");
                }
            }
        }

    }
}
