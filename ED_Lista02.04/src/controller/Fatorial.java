package controller;

public class Fatorial {

	public Fatorial() {
		super();
	}
	
	public boolean verificar(int num) {
		
		if(num%2==0) return false;
		
		return true;
	}
	
	public int duplo(int num) {
		
		// A condição de parada é quando o fatorial atinge o último número da mútiplicação
		// Como estamos realizando o processo inverso, começando em num e indo até 1
		// Logo a parada é em 1
		
		if(num<=1) return 1;
		
		int fat=num;
		
		// O fatorial duplo aceita só os números ímpares, como já recebemos um ímpar
		// Logo o próximo a entrar na multiplicação é num-2
		return fat*duplo(num-2);
	}

}
