package br.com.mateuussilvapb.modularidade.calculo;

import br.com.mateuussilvapb.app.Calculadora;
import br.com.mateuussilvapb.modularidade.calculo.interno.OperacoesAritmeticas;
import br.com.mateuussilvapb.modularidade.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

//
//	public Class<Logger> getLoggerClass() {
//		return Logger.class;
//	}
}
