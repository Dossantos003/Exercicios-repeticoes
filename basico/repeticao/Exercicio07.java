package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int quantidadeVendas ;
        double valorVenda ;
        double faturaMentoTotal =0;

        System.out.println("Digite a quantidade de vendas:");
        quantidadeVendas = sc.nextInt();
        System.out.println("Digite o valor da venda:");
        valorVenda = sc.nextDouble();

        for(int numero = 1; numero <= quantidadeVendas; numero++){
            faturaMentoTotal += valorVenda;
        }
        System.out.println("Quantidade de vendas " + quantidadeVendas);
        System.out.println("Faturamento total " + faturaMentoTotal);
    }
}
