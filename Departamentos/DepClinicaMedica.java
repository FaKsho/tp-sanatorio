package Departamentos;

import Pacientes.Estudiable;
import Pacientes.Paciente;

public class DepClinicaMedica {

    // Se ingresa 1 para Rayos, y 2 para Sangre
    public static void recetarEstudio(Paciente p, int tipoEstudio) {
        switch (tipoEstudio) {
            case 1:
                ((Estudiable)p).solicitarRadiografia();
            case 2:
                ((Estudiable)p).solicitarAnalisisSangre();
            default:
                System.out.println("No se ingresó un tipo de estudio válido.");
        }
    }
}
