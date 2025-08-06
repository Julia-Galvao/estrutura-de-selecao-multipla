import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totaldeprodutos, opcao;
        double preco, totaldacompra = 0;

        System.out.println("Qual o total da produtos? ");
        totaldeprodutos = sc.nextInt();

        for (int cont = 1; cont <= totaldeprodutos; cont ++){
            System.out.println(" Preço do produto " + cont + " --> R$ ");
            preco = sc.nextInt();
            totaldacompra = totaldacompra + preco;

        }
        System.out.println();
        System.out.println("Total da compra: " + totaldacompra);
        System.out.println("Digite 1 para pagamento a vista ou 2 para parcelado --> ");
        opcao = sc.nextInt();

        switch (opcao){
            case 1 -> totaldacompra = totaldacompra * 0.90;
            case 2 -> totaldacompra = totaldacompra * 1.155;
        }
    }
}
