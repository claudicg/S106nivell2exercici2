package n2exercici2.handlers;

import java.util.List;

import n2exercici2.beans.Persona;

public class GenericMethods {


	private <T> void imprimirPerPantalla(List<T> llistaGenerics) {
		
		for(T item: llistaGenerics) {
			System.out.print(item + " ");
		}
	}
	
	public void executarExercici() {
		
		Persona persona = new Persona("Josep", "Ruiz", 36);
		List<String> llistaStrings = List.of("Casa", "Finestra", "Porta");
		List<Integer> llistaIntegers = List.of(10, 20, 30);
		List<Object> llistaObjectes = List.of("Casa", 10, persona);
		
		imprimirPerPantalla(llistaStrings);
		System.out.println();
		imprimirPerPantalla(llistaIntegers);
		System.out.println();
		imprimirPerPantalla(llistaObjectes);
	}
}

