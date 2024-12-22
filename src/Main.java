import java.util.Scanner;

//Faça um programa que leia 5 valores (usando o FOR) e mostre a soma deles
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valorLido;
        int soma = 0;

        //Lê valores 5 vezes
        for(int i = 0; i < 5; i++){

            //Lê um valor digitado pelo usuário
            System.out.println("Digite um valor:");
            valorLido = sc.nextInt();

            //Incrementa a soma com o valor lido
            soma = soma + valorLido;
        }
        System.out.println("Resultado: " + soma);
    }
}