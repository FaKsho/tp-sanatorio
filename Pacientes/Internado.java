package Pacientes;

public class Internado extends Paciente implements Dietable, Estudiable{

    private String dieta;
    private int numeroHabitacion;
    private String presionArterial;
    private String tipoSangre;

    public Internado() {
    }

    public Internado(String nombre, String dni, String obraSocial, String tipoSangre, String presionArterial, int numeroHabitacion) {
        super(nombre, dni, obraSocial);
        this.tipoSangre = tipoSangre;
        this.presionArterial = presionArterial;
        this.numeroHabitacion = numeroHabitacion;
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

