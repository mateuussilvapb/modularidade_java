import br.com.mateuussilvapb.app.Calculadora;
import br.com.mateuussilvapb.modularidade.calculo.CalculadoraImpl;

module app.calculo {
	
	/*
	 * transitive serve para informar que essa dependência deve ser
	 * passada também para os demais projetos que dependam desse.
	 */
	requires transitive app.logging;
	exports br.com.mateuussilvapb.modularidade.calculo;
	
	/*
	 * É possivel exportar um pacote para um projeto específico utilizando
	 * o exports to.
	 */
	exports br.com.mateuussilvapb.modularidade.calculo.interno 
		to app.financeiro, java.logging;
	
	requires app.api;
	
	/*
	 * Na utilização de interfaces, o trecho abaixo significa que a interface
	 * Calculadora está sendo provida pela implementação CalculadoraImpl.
	 */
	provides Calculadora with CalculadoraImpl;
}
