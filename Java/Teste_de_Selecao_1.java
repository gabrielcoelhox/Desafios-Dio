/*DESAFIO:
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do 
que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B 
e se tanto C quanto D forem positivos e, ainda, se a vari�vel A for par, escreva a 
mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".

ENTRADA:
Quatro n�meros inteiros A, B, C e D.

SA�DA:
Imprima a mensagem corretamente esperada pela valida��o dos valores.
*/

import java.io.IOException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos"); 
        } else { 
            System.out.println("Valores nao aceitos");
        }
    }
}