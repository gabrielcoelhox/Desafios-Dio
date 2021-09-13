/*DESAFIO:
Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante 
de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h. Em uma hora (60 minutos) 
a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar 
um quilômetro a cada 2 minutos.

O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para 
a moto Y tomar essa distância da outra moto.

ENTRADA:
O arquivo de entrada contém um número inteiro K que representa a quantidade de quil�metro 
que que a moto Y deve estar da moto X.

SAÍDA:
Imprima o tempo necessário para a moto Y ficar com a quantidade K de quilômetro da moto X, 
seguido da mensagem " minutos".
 */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		  
    	Scanner sc = new Scanner(System.in);
    	
    	int min, km;
    	min = sc.nextInt();   	

    	System.out.printf("%d minutos\n", 2 * min);
	}

}