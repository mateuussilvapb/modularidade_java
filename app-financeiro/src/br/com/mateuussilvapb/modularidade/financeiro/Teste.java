package br.com.mateuussilvapb.modularidade.financeiro;

import java.util.ServiceLoader;
import br.com.mateuussilvapb.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Repare que agora a aplicação não está dependendo de um módulo implementado,
		 * mas sim de uma interface.
		 * 
		 * Em interfaces, os métodos são apenas escritos como referência, ou seja, não
		 * são implementados em si. Dessa forma, outras classes ou projetos implementam
		 * os métodos de uma interface.
		 * 
		 * Em módulos, o método ServiceLoader -> load -> findFirst serve para localizar
		 * uma implementação da interface informada. Mais espeficicamente, a primeira
		 * implementação encontrada.
		 */
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();

		System.out.println(calc.soma(2, 3, 4));
	}
}
