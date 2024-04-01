/*
2. Entrar via teclado com dez valores positivos. Consistir a digitacao e enviar mensagem de
erro, se necessario. Apos a digitacao, exibir:
a. O maior valor;
b. A soma dos valores;
c. A media aritmetica dos valores.
*/
//Cesar Beda
//Caua Barros

import java.util.Scanner;

public class TP02Ex02 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double[] array2c;
array2c = new double[10];
double maiorVal = 0;
double somaArray2c = 0;
double mediaArray2c = 0;

for(int c = 0 ; c < array2c.length ; ++c){
System.out.print("Digite a posicao " + c + " do array: ");
array2c[c] = sc.nextDouble();

}

for(int i = 0; i < array2c.length ; ++i){
if(maiorVal < array2c[i]){
maiorVal = array2c[i];
}
somaArray2c += array2c[i];
}

mediaArray2c = somaArray2c/array2c.length;

System.out.println("Maior valor do array e: " + maiorVal);
System.out.println("Soma dos valores do array dos 2 c e: " + somaArray2c);
System.out.println("A media do array e: " + mediaArray2c);

sc.close();
}
}