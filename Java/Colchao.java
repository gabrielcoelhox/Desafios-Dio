/* DESAFIO: Colchão
 
João está comprando móveis novos para sua casa. Agora é a vez de comprar um colchão 
novo, de molas, para substituir o colchão velho. As portas de sua casa têm altura H 
e largura L e existe um colchão que está em promoção com dimensões A × B × C.

O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue arrastá-lo 
através de uma porta com uma de suas faces paralelas ao chão, mas consegue virar 
e rotacionar o colchão antes de passar pela porta.

Entretanto, de nada adianta ele comprar o colchão se ele não passar através das 
portas de sua casa. Portanto ele quer saber se consegue passar o colchão pelas 
portas e para isso precisa de sua ajuda.
 
ENTRADA:
A primeira linha da entrada contém três números inteiros A, B e C (1 ≤ A, B, C ≤ 300), 
as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros H e L 
(1 ≤ H, L ≤ 250), respectivamente a altura e a largura das portas em centímetros.

SAÍDA:
Se programa deve escrever uma única linha, contendo apenas a letra ‘S’ se o colchão 
passa pelas portas e apenas a letra ‘N’ em caso contrário.
*/

package application;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		// Colchão
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// Porta
		int H = sc.nextInt();
		int L = sc.nextInt();
		
		if (B > 200) {
			System.out.println("N");
		} else {
			System.out.println("S");
		}
		sc.close();
    }
}