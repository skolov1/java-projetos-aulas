package br.edu.fatecpg.encapsulamento.model;

public class Carro {
	public String marca;
    private String modelo;
    private double capacidadeTanque;
    
    public String getMarca() {
    	return marca;
    }
    
    public void setMarca(String marcaCarro) {
    	this.marca = marcaCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double calcularValorParaEncher(double valorGasolina) {
        return this.capacidadeTanque * valorGasolina;
    }
}
