/*
Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.

Caua Barros da Costa
Cesar Beda

nome da matriz2c e poque a dupla e caua e cesar -_-
*/




import java.util.Scanner;

public class TP02Ex05	 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] matriz2c = new int[3][2];

        // Preenchendo a matriz com valores digitados pelo usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posicao [" + i + "][" + j + "]: ");
                matriz2c[i][j] = scanner.nextInt();
            }
        }

        // Exibe valores
        System.out.println("Valores armazenados na matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz2c[i][j] + " ");
            }
           System.out.println();
        }
        scanner.close();
    }
}
