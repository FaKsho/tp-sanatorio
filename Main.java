/* 
 * Crear un sistema de un sanatorio, el mismo posee 3 tipos de PACIENTES, 
 * los que son: PEDIATRICOS, ADULTOS e INTERNADOS. Todos los pacientes deben poseer DNI, 
 * Nombre y Obra Social. pero a parte los pediátricos deben tener Peso, Celular y Tutor. 
 * Los Adultos P.A, Altura y Peso y los Internados Habitación, P.A y Rh,
 * 
 * Por otra parte el Departamento de Administración desea poder obtener de todos: 
 * cobertura de la OS, Descuento y Vademecum.
 * 
 * El Departamento de Nutrición desea poder obtener de los Internados y pediátricos:
 * el tipo de Dieta.
 * 
 * El Departamento de Clínica Medica desea poder recetar estudios a los Adultos e Internados de : Rx. y Sangre,
 *
 *
 */

import Departamentos.DepAdministracion;
import Departamentos.DepClinicaMedica;
import Departamentos.DepNutricion;
import Pacientes.Adulto;
import Pacientes.Internado;
import Pacientes.Pediatrico;

public class Main {

    public static void main(String [] args) {

        Adulto pacienteAdulto = new Adulto("Jose Da Silva", "29547589", "IPS", "120/60", 75.5, 175);
        Pediatrico pacientePediatrico = new Pediatrico("Marta González", "49124879", "Swiss Medical", "Jorge González", 9.7, "3764996633");
        pacientePediatrico.setDieta("Prohibición completa de bebidas sintéticas");
        Internado pacienteInternado = new Internado("Mario Lopez", "25365978", "IPS", "O+", "110/45", 55);

        System.out.println(DepNutricion.getDietaDe(pacienteAdulto));
        System.out.println(DepNutricion.getDietaDe(pacientePediatrico));

        System.out.println(DepAdministracion.getDatos(pacienteInternado));

        DepClinicaMedica.recetarEstudio(pacienteInternado, 2);

    }
}