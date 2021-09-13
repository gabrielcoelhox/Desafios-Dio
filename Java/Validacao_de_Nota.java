/*DESAFIO:
Para ajudar a calcular as notas referentes �s duas avalia��es dos alunos, uma professora 
pediu para que voc� desenvolva um programa que calcule e imprima a m�dia semestral. 
Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao 
intervalo [0,10]). Cada nota deve ser validada separadamente.

ENTRADA:
A entrada cont�m v�rios valores reais, positivos ou negativos. O programa deve ser 
encerrado quando forem lidas duas notas v�lidas.

SA�DA:
Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido 
do valor do c�lculo. O valor deve ser apresentado com duas casas ap�s o ponto decimal.
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notaSoma[] = new double[2];
		double nota;
		int contador = 0;

		while (contador <= 1) {
			nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("nota invalida");
			} else {
				notaSoma[contador++] = nota;
			}
		}

		double media = (notaSoma[0] + notaSoma[1]) / 2;

		System.out.println("media = " + String.format("%.2f", media));
	}
}