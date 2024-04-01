/*
Entrar via teclado com "N" valores quaisquer. O valor "N" (que representa a quantidade de
numeros) sera digitado, devera ser positivo, porem menor que vinte. Caso a quantidade nao
satisfaca a restricao, enviar mensagem de erro e solicitar o valor novamente. Apos a
digitacao dos "N" valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A media aritmetica dos valores;
e. A porcentagem de valores que sao positivos;
f. A porcentagem de valores negativos;
Apos exibir os dados, perguntar ao usuario de deseja ou nao uma nova execucao do
programa. Consistir a resposta no sentido de aceitar somente "S" ou "N" e encerrar o
programa em funcao dessa resposta.
*/
//Cesar Beda
//Caua Barros

import java.util.Scanner;

public class TP02Ex03 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char rodar = 'S';

do {
    double[] array2c;
    double maiorVal = 0;
    double somaArray2c = 0;
    double mediaArray2c = 0;
    double percValP= 0;
    double percValN = 0;
    double quantValP = 0;
    double quantValN = 0;
    int caracterValido;

        System.out.print("Digite a quantidade de valores que serao adicionados: ");
        int tamArray = sc.nextInt();
        array2c = new double[tamArray];

        for(int c = 0 ; c < array2c.length ; ++c){
            System.out.print("Digite a posicao " + c + " do array: ");
            array2c[c] = sc.nextDouble();
        }
        double menorVal = array2c[0];

        for(int i = 0; i < array2c.length ; ++i){
            if(maiorVal <= array2c[i]){
                maiorVal = array2c[i];
            }
            if (menorVal >= array2c[i]){
                menorVal = array2c[i];
            }
            if(array2c[i] >= 0){
                quantValP += 1;
            }else{
                quantValN += 1;
            }

            somaArray2c += array2c[i];
        }

        mediaArray2c = somaArray2c/array2c.length;
        percValP = (quantValP / array2c.length)*100;
        percValN = (quantValN / array2c.length)*100;

        System.out.println("Maior valor do array e: " + maiorVal);
        System.out.println("Menor valor do array e: " + menorVal);
        System.out.println("Soma dos valores do array 2c e: " + somaArray2c);
        System.out.println("A media do array e: " + mediaArray2c);
        System.out.println("Porcentagem numeros positivos: " + percValP + "%");
        System.out.println("Porcentagem numeros negativos: " + percValN + "%");

        System.out.println("Programa finalizado! Se deseja uma nova execucao digite 'S', se nao digte 'N'.");

        do{
            rodar = sc.next().charAt(0);   
            rodar = Character.toUpperCase(rodar);
            if(rodar == 'N'|| rodar == 'S'){
                //caracter valido
                caracterValido = 1;
            }else{
                //caracter invalido digte novamente
                System.out.println("Caracter Invalido, digite Novamente. Se deseja uma nova execucao digite 'S', se nao digte 'N'.");
                caracterValido = 0;
            }
        }while (caracterValido == 0);


} while (rodar == 'S');
System.out.println("Programa Encerrado! Obrigado, volte sempre x_x");
sc.close();
}
}