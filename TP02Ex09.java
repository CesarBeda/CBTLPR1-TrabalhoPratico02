/*
Entrar com uma matriz de ordem MxN, onde a ordem tambem sera escolhida pelo usuario,
sendo que no maximo 10x10. A matriz nao precisa ser quadratica. Apos a digitacao dos
elementos, calcular e exibir a matriz transposta.

Alunos:
Cesar Beda
Caua Barros
*/

import java.util.Scanner;

public class TP02Ex09 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int lin;
        int col;
        double[][] matriz2C; // 2c pq eh o duo Cesar e Caua
        int linValido = 0;
        int colValido = 0;
        
        System.out.print("Digite o numero de linha(s) da sua matriz, (max: 10): ");
        do{
            lin = scanner.nextInt();
            if(lin > 10 || lin < 1){
                System.out.print("Numero invalido, por favor digite novamente o numero de linhas: ");
                linValido = 0;
            }else{
                //numero de linhas valido
                linValido = 1;
            }
        }while(linValido == 0);
        
        System.out.print("Digite o numero de coluna(s) da sua matriz, (max: 10): ");
        do{
            col = scanner.nextInt();
            if(col > 10 ||  col < 1){
                System.out.print("Numero invalido, por favor digite novamente o numero de colunas: ");
                colValido = 0;
            }else{
                //numero de linhas valido
                colValido = 1;
            }
        }while(colValido == 0);

       //criando matriz com suas dimensoes
       matriz2C = new double[lin][col];

       //adicionando valores
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ": ");
                matriz2C[i][j] = scanner.nextDouble();
            }
        }

        //exibir matriz2C
        System.out.println("\n matriz " + lin + "X" + col);
        for(int i = 0; i < lin; i++){
            System.out.print("| ");
            for(int j = 0; j < col; j++){
                System.out.print(matriz2C[i][j] + ", ");
            }
            System.out.println("|"); //pular linha
        }

        System.out.println("");

        //exibir matriz2C transposta invertendo linhas por coluna e vice versa
        System.out.println("matriz transposta " + col + "X" + lin);
        for(int i = 0; i < col; i++){
            System.out.print("| ");
            for(int j = 0; j < lin; j++){
                System.out.print(matriz2C[j][i] + ", ");
            }
            System.out.println("|"); //pular linha
        }
        System.out.print("\n");
        scanner.close();
    }
}