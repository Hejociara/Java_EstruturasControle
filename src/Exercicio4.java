import java.util.Scanner;

/**
 * @author: hejoc
 */
//Criar um programa que receba um número e diga se ele é um número primo.
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num = entrada.nextDouble();

        if(num)
            System.out.println(num + " é número primo");
            else
        System.out.println(num + " não é primo");


        entrada.close();
    }
}
