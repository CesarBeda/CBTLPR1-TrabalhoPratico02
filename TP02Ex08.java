
/*
Entrar via teclado com doze valores e armazena-los em uma matriz de ordem 3x4. 
Apos a digitacao dos valores solicitar uma constante multiplicativa, 
que devera multiplicar cada valor matriz e armazenar o resultado em outra matriz
de mesma ordem, nas posições correspondentes. 
Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.
*/

//Caua Barros da Costa
//Cesar Beda



import java.util.Scanner;


public class TP02Ex08{

    // Metodo para exibir a matriz matriarcal
    public static void exibirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }
    }


    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[][] matrizOriginal = new double[3][4];
        double[][] matrizResultado = new double[3][4];

        // Preenchendo a matriz original com valores digitados pelo usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextDouble();
            }
        }

        
        System.out.print("Digite a constante multiplicativa: ");
        double constante = scanner.nextDouble();

        // Multiplicando cada valor da matriz original pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matrizOriginal[i][j] * constante;
            }
        }

        // Exibindo as matrizes na forma matricial
        System.out.println("Matriz Original:");
        exibirMatriz(matrizOriginal);

        System.out.println("Matriz Resultado - valores multiplicados pela constante: " + constante);
        exibirMatriz(matrizResultado);

        scanner.close();
    }

    
}
