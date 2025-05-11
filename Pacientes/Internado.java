package Pacientes;

public class Internado extends Paciente implements Dietable, Estudiable{

    private String dieta;

    public Internado(String dieta) {
        this.dieta = dieta;
    }

    public Internado(String nombre, String dni, String obraSocial, String dieta) {
        super(nombre, dni, obraSocial);
        this.dieta = dieta;
    }

    @Override
    public String getCoberturaOS() {
        return "Cobertura realizada por " + super.getObraSocial();
    }

    @Override
    public int getDescuento() {
        return 30;
    }

    @Override
    public String getDieta() {
        return dieta;
    }

    @Override
    public void setDieta(String dieta) {
        this.dieta = dieta;
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

