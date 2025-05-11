package Pacientes;

import Pacientes.Paciente;

public class Adulto extends Paciente implements Estudiable{

    public Adulto(String nombre, String dni, String obraSocial) {
        super(nombre, dni, obraSocial);
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
