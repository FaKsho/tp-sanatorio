package Departamentos;

import Pacientes.Paciente;

public class DepAdministracion {

    public static String getDatos(Paciente p) {

        return "Paciente:" + p.getNombre() + "Obra social: " + p.getObraSocial() +
                " | Descuento: " + p.getDescuento() + "% | " +
                "Vademecum: " + p.getVademecum();
    }
}
