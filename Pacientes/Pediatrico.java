package Pacientes;

import Pacientes.Paciente;

public class Pediatrico extends Paciente implements Dietable{

    private String dieta;
    private String tutor;
    private double peso;
    private String celular;

    public Pediatrico() {
    }

    public Pediatrico(String nombre, String dni, String obraSocial, String tutor, double peso, String celular) {
        super(nombre, dni, obraSocial);
        this.tutor = tutor;
        this.peso = peso;
        this.celular = celular;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
