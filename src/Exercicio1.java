import java.util.Scanner;

/**
 * @author: Hejociara
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num >= 0 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("O número " + num + " está entre 0 e 10 e é par.");
            } else {
                System.out.println("O número " + num + "está entre 0 e 10 mas não é par.");
            }
        }
        else{
                System.out.println("O número" + num + " não está entre 0 e 10.");
            }
            entrada.close();
        }
    }

