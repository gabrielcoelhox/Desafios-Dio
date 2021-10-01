/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso 
Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 
ENTRADA:
A entrada é composta por vários casos de testes contendo valores inteiros.

SAÍDA:
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

2200 = Senha Inválida
1020 = Senha Inválida
2022 = Senha Inválida
2020 = Acesso permitido
 */

package application;

import java.io.IOException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
      
    	Scanner sc = new Scanner(System.in);
    	
    	while (sc.hasNext()) {
    		int senha = sc.nextInt();
	    	if(senha != 2002){
	    	  System.out.println("Senha Invalida");
	    	} else {
	    	  System.out.println("Acesso Permitido");
	    	}
    	}
    	sc.close();
    }
}