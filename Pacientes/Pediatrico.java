package Pacientes;

import Pacientes.Paciente;

public class Pediatrico extends Paciente implements Dietable{

    private String dieta;

    public Pediatrico(String nombre, String dni, String obraSocial, String dieta) {
        super(nombre, dni, obraSocial);
        this.dieta = dieta;
    }

    public Pediatrico(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String getCoberturaOS() {
        return "Cobertura realizada por " + super.getObraSocial();
    }

    @Override
    public int getDescuento() {
        return 33;
    }

    @Override
    public String getDieta() {
        return dieta;
    }

    @Override
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
