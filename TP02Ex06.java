/*
Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

Caua Barros da Costa
Cesar Beda

nome da matriz nomes2c e poque a dupla e caua e cesar -_-
*/




import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[][] nomes2c = new String[2][3];

        // Preenchendo a matriz com nomes digitados pelo usuario
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um nome para a posicao [" + i + "][" + j + "]: ");
                nomes2c[i][j] = scanner.nextLine();
            }
        }

        // Exibindo os nomes armazenados na matriz
        System.out.println("Nomes armazenados na matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nomes2c[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
