package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrado");
	}

	@Override
	public double calcula(double peso, double raio) {
		raio *= Math.pow(10.0, -7.0);
		double massa = peso * 2.0 / (6.023 * Math.pow(10.0, 23.0));
		double volume = Math.pow(4.0 * raio / Math.pow(3.0, 0.5), 3.0);
		double densidade = massa/volume;
		return densidade;
	}
}