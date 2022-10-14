import java.util.Scanner;
/**
 * @author: Hejociara
 */
//Criar um programa que receba duas notas parciais, calcular a média final.
// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
// se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
// caso contrário imprime no console "Reprovado".
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota1;

        System.out.println("Digite segunda nota: ");
        double nota2;

        double media = (nota1 + nota2) /2;

        if (media >= 7.0)
            System.out.println("Aprovado");
        if(media < 7)

        entrada.close();
    }
}
