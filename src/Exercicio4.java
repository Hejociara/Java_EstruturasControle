import java.util.Scanner;

/**
 * @author: hejoc
 */
//Criar um programa que receba um número e diga se ele é um número primo.
public class Exercicio4 {
    public static void main(String[] args) {

        int contadorDivisores = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo:");
        int num = entrada.nextInt();

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDivisores++;
            }
        }
        if(contadorDivisores == 0) {
            System.out.println(num + " é número primo");
        }
        else{
                System.out.println(num + " não é primo");
            }
        entrada.close();
    }
}
