/*
 * Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial 
duplo desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é 
definido como o produto de todos os números naturais ímpares de 1 até algum número natural ímpar N.
Assim, o fatorial duplo de 5 é:
 
                             5!! = 5*3*1
 */

package view;

import controller.Fatorial;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da Classe Fatorial
		Fatorial metodo = new Fatorial();
		
		// Criando o método de leitura com Scanner
		Scanner ler = new Scanner(System.in);
		
		boolean verif = false;
		int num;
		
		do {
			
			System.out.print("Digite um número Ímpar: ");
			num = Integer.parseInt(ler.nextLine());
			verif = metodo.verificar(num);
			
			if(verif==false) System.out.println("\nDesculpe, apenas aceito números ímpares."+
												"\nTente Noavamente!\n");
			
		}while(verif==false);
		
		System.out.println("\nO fatorial duplo de "+num+" é: "+metodo.duplo(num));
		
		ler.close();
	}

}
