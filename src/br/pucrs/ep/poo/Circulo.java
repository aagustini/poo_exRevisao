package br.pucrs.ep.poo;

public class Circulo {
	private Ponto centro;
	//private double centroX;
	//private double centroY;
	private double raio;
	
	
	public Circulo() {
		this(0,0,1);
		//centroX = 0;
		//centroY = 0;
		//raio = 1;
	}
	
	public Circulo(double x, double y, double r) {
		//centroX = x;
		//centroY =y;
		centro = new Ponto(x,y);
		raio = r;
	}

	public double getCentroX() {
		return centro.getCoordX();
	}

	public double getCentroY() {
		return centro.getCoordY();
	}

	public double getRaio() {
		return raio;
	}

	public void move(double newX, double newY) {
		//centroX = newX;
		//centroY = newY;
		centro.move(newX, newY);
	}
	
	public void zoom(double fator) {

		raio = raio * fator;
	}
	
	public double area() {

		return Math.PI * Math.pow(raio,2);
	}
	
	public String toString(){

		return String.format("%s \tr: %.2f",
				centro.toString(), raio);
	}
}
