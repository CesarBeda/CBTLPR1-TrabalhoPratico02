/*
Entrar com uma matriz de ordem MxM, onde a ordem tambem sera escolhida pelo usuario,
sendo que no maximo sera de ordem 10 e quadratica. Apos a digitacao dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).

Alunos:
Cesar Beda
Caua Barros
 */

import java.util.Scanner;

public class TP02Ex10 {

     //Metodo para calcular Matriz Inversa
     public static double[][] calcularInversa(double[][] matriz) {
        int tamanho = matriz.length;
        double[][] identidade = new double[tamanho][tamanho];
        double[][] extendida = new double[tamanho][2 * tamanho];

        // Inicializar a matriz identidade
        for (int i = 0; i < tamanho; i++) {
            identidade[i][i] = 1;
        }

        // Criar a matriz estendida
        for (int i = 0; i < tamanho; i++) {
            System.arraycopy(matriz[i], 0, extendida[i], 0, tamanho);
            System.arraycopy(identidade[i], 0, extendida[i], tamanho, tamanho);
        }

        // Aplicar Gauss-Jordan
        for (int i = 0; i < tamanho; i++) {
            double pivot = extendida[i][i];
            for (int j = 0; j < 2 * tamanho; j++) {
                extendida[i][j] /= pivot;
            }
            for (int k = 0; k < tamanho; k++) {
                if (k != i) {
                    double fator = extendida[k][i];
                    for (int j = 0; j < 2 * tamanho; j++) {
                        extendida[k][j] -= fator * extendida[i][j];
                    }
                }
            }
        }
        // Extrair a matriz inversa
        double[][] inversa = new double[tamanho][tamanho]; //criando matriz
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                inversa[i][j] = extendida[i][j + tamanho];
            }
        }
        return inversa;
    }

    public static void main(String[] args){

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
        scanner.close();

        //exibindo matriz
        System.out.println("\nMatriz Original");
        for(int i = 0; i < ordem; i++){
            System.out.print("| ");
            for(int j = 0; j < ordem; j++){
                System.out.print(matriz2C[i][j] + ", ");
            }
            System.out.println("|");
        }

        //declarando Matriz Inversa e chamando metodo para calcular
        double[][] inversa = calcularInversa(matriz2C);

        //exibindo Matriz Inversa
        System.out.println("\nMatriz inversa:");
        for(int i = 0; i < ordem; i++){
            System.out.print("| ");
            for(int j = 0; j < ordem; j++){
                System.out.print(String.format("%.2f", inversa[i][j]) + ", "); //arredondando pois o metodo retorna dizimas
            }
            System.out.println("|");
        }
    }
}

