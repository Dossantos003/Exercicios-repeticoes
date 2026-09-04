package flamingo.aprendendo.basico.repeticao;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        int n, numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        n = sc.nextInt();
        numero = 1;

        while(numero <=10){
            System.out.println( numero + " x " + n + " = " + (n * numero));
            numero++;

        }

    }
}
