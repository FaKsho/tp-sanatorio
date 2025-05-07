package Pacientes;
public abstract class Paciente {
    public String nombre;
    public String dni;
    public String obraSocial;

    public Paciente() {
    }

    public Paciente(String nombre, String dni, String obraSocial) {
        this.nombre = nombre;
        this.dni = dni;
        this.obraSocial = obraSocial;
    }

    public abstract String getCoberturaOS();
    public abstract int getDescuento();
    public abstract String getVademecum();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }


}
