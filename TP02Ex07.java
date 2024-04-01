/*
Entrar via teclado com doze valores e armazena-los em uma matriz de ordem 3x4. Apos a digitacao dos valores solicitar uma constante multiplicativa, 
que devera multiplicar cada valor matriz e armazenar o resultado na propria matriz, nas posicoes correspondentes.

nome da matriz2c e poque a dupla e caua e cesar -_-

Caua Barros da Costa
Cesar Beda
*/

import java.util.Scanner;

public class TP02Ex07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[][] matriz2c = new double[3][4];

        // Preenchendo a matriz com valores digitados pelo usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posicao [" + i + "][" + j + "]: ");
                matriz2c[i][j] = scanner.nextDouble();
            }
        }

        
        System.out.print("Digite a constante multiplicativa: ");
        double constante = scanner.nextDouble();
        
        // Exibindo a matriz antes de multiplicar
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz2c[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplicando cada valor da matriz pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2c[i][j] *= constante;
            }
        }

        // Exibindo a matriz resultante
        System.out.println("Matriz Final - multiplicados pela constante: " + constante);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz2c[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}



