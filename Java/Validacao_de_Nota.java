/*DESAFIO:
Para ajudar a calcular as notas referentes às duas avaliações dos alunos, uma professora 
pediu para que você desenvolva um programa que calcule e imprima a média semestral. 
Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao 
intervalo [0,10]). Cada nota deve ser validada separadamente.

ENTRADA:
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser 
encerrado quando forem lidas duas notas válidas.

SAÍDA:
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido 
do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
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