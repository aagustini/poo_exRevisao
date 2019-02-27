package br.pucrs.ep.poo;

public class Ponto {
    private double coordX;
    private double coordY;

    public Ponto(double x, double y) {
        coordX = x;
        coordY = y;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void move(double newX, double newY) {
        coordX = newX;
        coordY = newY;
    }

    public String toString() {
        return String.format("(%.2f,%.2f)",
                coordX, coordY);

    }
}
