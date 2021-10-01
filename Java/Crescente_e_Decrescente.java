/*
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Para cada 
X e Y, escreva uma mensagem para indicar se tais valores foram digitados em ordem 
crescente ou decrescente.
 
ENTRADA:
A entrada é composta por vários casos de teste. Cada caso contém dois valores 
inteiros: X e Y. A leitura deve ser encerrada caso sejam fornecidos os mesmos 
valores para X e Y.

SAÍDA:
Caso os valores tenham sido digitados na ordem crescente, imprima “Crescente”. 
No contrário, “Decrescente”.
*/

package application;

import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	
    	while (X != Y) {
    		if (X < Y) System.out.println("Crescente"); //implemente sua lógica aqui
    		else System.out.println("Decrescente");     // implemente sua lógica aqui
        	X = sc.nextInt();
        	Y = sc.nextInt();
    	}
    	sc.close();
    }
}