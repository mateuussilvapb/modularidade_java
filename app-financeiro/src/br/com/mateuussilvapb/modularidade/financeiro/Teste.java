package br.com.mateuussilvapb.modularidade.financeiro;

import java.util.ServiceLoader;
import br.com.mateuussilvapb.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Repare que agora a aplica��o n�o est� dependendo de um m�dulo implementado,
		 * mas sim de uma interface.
		 * 
		 * Em interfaces, os m�todos s�o apenas escritos como refer�ncia, ou seja, n�o
		 * s�o implementados em si. Dessa forma, outras classes ou projetos implementam
		 * os m�todos de uma interface.
		 * 
		 * Em m�dulos, o m�todo ServiceLoader -> load -> findFirst serve para localizar
		 * uma implementa��o da interface informada. Mais espeficicamente, a primeira
		 * implementa��o encontrada.
		 */
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();

		System.out.println(calc.soma(2, 3, 4));
	}
}
