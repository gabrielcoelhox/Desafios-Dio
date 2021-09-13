/*DESAFIO:
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de 
um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

ENTRADA:
O arquivo de entrada contém um valor inteiro N.

SAÍDA:
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.
*/

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
       
 	  Scanner sc = new Scanner(System.in);
 	  
		int N, hrs, min, sec;

		N = sc.nextInt();

		hrs = N / 3600;
		min = (N % 3600) / 60;
		sec = (N % 3600) % 60;
		
		System.out.println(hrs + ":" + min + ":" + sec);
    }
}