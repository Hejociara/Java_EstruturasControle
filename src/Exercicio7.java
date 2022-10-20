import java.util.Scanner;

/**
 * @author: Hejociara
 */
// Criar um programa que enquanto estiver recebendo números positivos,
// imprime no console a soma dos números inseridos,
// caso receba um número negativo, encerre o programa.
// Tente utilizar a estrutura do while.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int numSoma =0;

        while (num >= 0){
            System.out.println("Digite um numero inteiro: ");
            num = entrada.nextInt();
            if (num >=0){
                numSoma += num;
                System.out.printf("Soma: %d\n", numSoma);
            }
        }
        entrada.close();
    }
}
