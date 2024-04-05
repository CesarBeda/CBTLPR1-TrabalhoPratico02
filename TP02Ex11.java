/*
Entrar com uma matriz de ordem MxM, onde a ordem tambem sera escolhida pelo usuario,
sendo que no maximo sera de ordem 10 e quadratica. Apos a digitacao dos elementos,
calcular e exibir determinante da matriz.

Alunos:
Cesar Beda 
Caua Barros
 */

import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz2C;
        int ordem;
        int ordemValido;
        System.out.print("Digite a Ordem de sua Mariz Quadarada, (max:10): ");

        //validando valor
        do{
            ordem = scanner.nextInt();
            if(ordem > 10 || ordem < 1){
                System.out.print("Numero Invalido, digite novamnete a ordem de sua Matriz Quadrada: ");
                ordemValido = 0;
            }else{
                ordemValido = 1;
            }  
        }while (ordemValido == 0);
        
        //criando Matriz2C
        matriz2C = new double[ordem][ordem];
        
        //recebendo valores
        for(int i = 0; i < ordem; i++){
            for(int j = 0; j < ordem; j++){
                System.out.print("Digite o valor para linha " + (i+1) + ", coluna " + (j+1) + ": ");
                matriz2C[i][j] = scanner.nextDouble();
            }
        }

        //exibindo matriz
        System.out.println("\nMatriz Original");
        for(int i = 0; i < ordem; i++){
            System.out.print("| ");
            for(int j = 0; j < ordem; j++){
                System.out.print(matriz2C[i][j] + ", ");
            }
            System.out.println("|");
        }

        double determinante = calcularDeterminante(matriz2C);

        System.out.println("\nO determinante da matriz é: " + determinante +"\n");

        scanner.close();
    }

    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;
        
        if (n == 1) {
            return matriz[0][0];
        }
        
        double determinante = 0;
        for (int j = 0; j < n; j++) {
            determinante += matriz[0][j] * cofator(matriz, 0, j);
        }
        
        return determinante;
    }
    
    public static double cofator(double[][] matriz, int linha, int coluna) {
        return Math.pow(-1, linha + coluna) * determinanteMenor(matriz, linha, coluna);
    }
    
    public static double determinanteMenor(double[][] matriz, int linha, int coluna) {
        int n = matriz.length;
        double[][] menor = new double[n - 1][n - 1];
        
        for (int i = 0, p = 0; i < n; i++) {
            if (i == linha) continue;
            for (int j = 0, q = 0; j < n; j++) {
                if (j == coluna) continue;
                menor[p][q] = matriz[i][j];
                q++;
            }
            p++;
        }
        
        return calcularDeterminante(menor);
    }
}
