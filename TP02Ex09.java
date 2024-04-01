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
        int linValido = 0;

        do{
            System.out.print("Digite o numero de linhas da sua matriz, (max: 10): ");
            lin = scanner.nextInt();
            if(lin > 10){
                System.out.print("Numero acima do limite, por favor digite novamente");
                linValido = 0;
            }else{
                //numerovalido
                linValido = 1;
            }
        }while(linValido == 0);

        System.out.print("Digite o numero de coluna da sua matriz, (max: 10): ");
        col = scanner.nextInt();

        System.out.println(lin + "  "+ col);

        scanner.close();
    }
    
}
