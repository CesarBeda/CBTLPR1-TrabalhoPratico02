/*
1. Entrar com dois valores via teclado, onde o segundo valor devera ser maior que o primeiro.
Caso contrario solicitar novamente apenas o segundo valor.

Alunos:
Cauã Barros da Costa
Cesar Beda
*/

import java.util.Scanner;

public class TP02Ex01 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite Seu Primeiro Valor: ");
double pV = sc.nextDouble();
System.out.println("Digite o Segundo Valor: ");
double sV = sc.nextDouble();

while(pV >= sV){
System.out.println("Segundo valor menor que o primeiro! , Digite Outro: ");
sV = sc.nextDouble();
}
System.out.println("Agora Sim Usuario, Parabens!");
System.out.println("Primeiro Valor: " + pV);
System.out.println("Segundo Valor: " + sV);

sc.close();
}
}