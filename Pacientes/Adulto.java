package Pacientes;

import Pacientes.Paciente;

public class Adulto extends Paciente implements Estudiable{

    private String PresionArterial;
    private double peso;
    private double altura;

    public Adulto() {

    }

    public Adulto(String nombre, String dni, String obraSocial, String presionArterial, double peso, double altura) {
        super(nombre, dni, obraSocial);
        PresionArterial = presionArterial;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String getCoberturaOS() {
        return "Cobertura realizada por " + super.getObraSocial();
    }

    @Override
    public int getDescuento() {
        return 25;
    }

    @Override
    public void solicitarAnalisisSangre() {
        System.out.println("Análisis de sangre solicitado a " + getNombre());
    }

    @Override
    public void solicitarRadiografia() {
        System.out.println("Radiografía solicitada a " + getNombre());
    }
}
