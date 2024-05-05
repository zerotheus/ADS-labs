// Sugestão: caso for mexer tente implementar um try-catch para pegar as execeções de input do user, 
// tipo, se o usuario inserir uma letra em vez de um inteiro

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0){
            System.out.println("************************CALCULADORA************************");
            System.out.println("Escolha a operação:");
            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÂO");
            System.out.println("4 - DIVISÃO");
            System.out.println("0 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número:");
                    int n1Soma = leitor.nextInt();
                    System.out.println("Digite o número:");
                    int n2Soma = leitor.nextInt();
                    System.out.println("O resultado da soma foi: "+ somar(n1Soma, n2Soma));
                    break;

                case 2:
                    System.out.println("Digite o número:");
                    int n1Sub = leitor.nextInt();
                    System.out.println("Digite o número:");
                    int n2Sub = leitor.nextInt();
                    System.out.println("O resultado da subtração foi: "+ subtrair(n1Sub, n2Sub));
                    break;

                case 3:
                    System.out.println("Digite o número:");
                    int n1Mult = leitor.nextInt();
                    System.out.println("Digite o número:");
                    int n2Mult = leitor.nextInt();
                    System.out.println("O resultado da multiplicação foi: "+ multiplicar(n1Mult, n2Mult));
                    break;

                case 4:
                    System.out.println("Digite o número:");
                    int n1Div = leitor.nextInt();
                    System.out.println("Digite o número:");
                    int n2Div = leitor.nextInt();
                    System.out.println("O resultado da divisão foi: "+ dividir(n1Div, n2Div));
                    break;
            
                default:
                    break;

            }
        }
        
    }  

    public static int somar(int n1, int n2){
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public static int dividir(int n1, int n2){
        return n1 / n2;
    }

}
