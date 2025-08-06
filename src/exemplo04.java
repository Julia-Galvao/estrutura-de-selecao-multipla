import java.util.Scanner;

/* Programa em java para ler um valor inteiro. Se o valor for par imprimir uma
 mensagem (informando que é par) e tbm imprimir o dobro do numero. Se o valor for impar
 imprimir uma msg (informando que é impar) e também o triplo do número.
 */
public class exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Valor: ");
        valor = sc.nextInt();

        switch (valor % 2){
            case 0 -> {
                System.out.println("Esse numero é par");
                System.out.println(2*valor);
            }
            case 1 ->{
                System.out.println("Esse numero é impar:");
                System.out.println(3*valor);
            }
        }
    }
}
