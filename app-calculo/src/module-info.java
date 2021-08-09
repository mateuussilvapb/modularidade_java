import br.com.mateuussilvapb.app.Calculadora;
import br.com.mateuussilvapb.modularidade.calculo.CalculadoraImpl;

module app.calculo {
	
	/*
	 * transitive serve para informar que essa depend�ncia deve ser
	 * passada tamb�m para os demais projetos que dependam desse.
	 */
	requires transitive app.logging;
	exports br.com.mateuussilvapb.modularidade.calculo;
	
	/*
	 * � possivel exportar um pacote para um projeto espec�fico utilizando
	 * o exports to.
	 */
	exports br.com.mateuussilvapb.modularidade.calculo.interno 
		to app.financeiro, java.logging;
	
	requires app.api;
	
	/*
	 * Na utiliza��o de interfaces, o trecho abaixo significa que a interface
	 * Calculadora est� sendo provida pela implementa��o CalculadoraImpl.
	 */
	provides Calculadora with CalculadoraImpl;
}
