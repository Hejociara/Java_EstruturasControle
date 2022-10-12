import java.util.Scanner;

/**
 * @author: Hejociara
 * Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        if (num > 0 && num <= 10)
            System.out.println("O número é par" );

        entrada.close();

    }
}
