package Pacientes;

import Pacientes.Paciente;

public class Adulto extends Paciente {

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

}
