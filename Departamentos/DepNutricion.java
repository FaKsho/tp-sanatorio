package Departamentos;

import Pacientes.*;

public class DepNutricion {

    public static String getDietaDe(Paciente p) {

        // Si el pacente no implementa Dietable esta accion se descarta
        if(!(p instanceof Dietable)) {
            return "Este paciente no posee una dieta.";
        }

        // Se castea el pacienta a Dietable, para recibir la dieta que use.
        String dieta = ((Dietable)p).getDieta();

        return "La dieta del paciente " + p.getNombre() + " consta de: " + dieta;



    }
}
