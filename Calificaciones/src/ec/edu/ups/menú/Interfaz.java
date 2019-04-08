/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.menú;

import ec.edu.ups.universidad.Carrera;
import ec.edu.ups.universidad.Estudiante;
import ec.edu.ups.universidad.Grupo;
import ec.edu.ups.universidad.HistorialCalificacion;
import ec.edu.ups.universidad.Materia;
import ec.edu.ups.universidad.Profesor;
import ec.edu.ups.universidad.Sede;

/**
 *
 * @author Byron PC
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ////////////////////////////////////////////////////////////////////////////////////////    
        //Carrera
        Carrera Computacion = new Carrera(1, "Computacion", 1, 12, "Ingeniero");
        Carrera Mecatronica = new Carrera(2, "Telematica", 1, 15, "Telematico");
        Carrera Electronica = new Carrera(3, "Mecatronica", 1, 44, "Ingeniero Mecatronico");

/////////////////////////////////////////////////////////////////////////////////////////       
        //Estudiante
        Estudiante Pepito = new Estudiante(1, "Pepito", "0123465789", "0965478235", "Luis Cordero", "pepito@ups.edu.ec");
        Estudiante Juanito = new Estudiante(2, "Juanito", "0129876543", "0986479215", "Remigio Crespo", "juanito@ups.edu.ec");
        Estudiante Marta = new Estudiante(3, "Marta", "0265478935", "0975698231", "Max. uhle", "pepito@ups.edu.ec");
////////////////////////////////////////////////////////////////////////////////////////////////////////     
        //Grupo
        Grupo grupo1 = new Grupo(96, "Grupo 1", 4);
        Grupo grupo2 = new Grupo(58, "Grupo 2", 6);

///////////////////////////////////////////////////////////////////////////////////////////////////
        //Historial Calificaciones
            
        HistorialCalificacion calificacionMatematicasPepito= new HistorialCalificacion(25, 15, 10, 20);
        HistorialCalificacion calificacionAlgebraPepito= new HistorialCalificacion(20, 10, 8, 15);
        HistorialCalificacion calificacionEticaJuanito = new HistorialCalificacion(30, 10, 12, 25);
        HistorialCalificacion calificacionProgramacionJuanito = new HistorialCalificacion(30, 8, 10, 25);
        HistorialCalificacion calificacionEstrucuturaMarta = new HistorialCalificacion(15, 2, 18, 10);
        HistorialCalificacion calificacionLogicaMarta = new HistorialCalificacion(10, 20, 15, 20);
        
//////////////////////////////////////////////////////////////////////////////////////////////
                    //Clase Persona es el Padre

//////////////////////////////////////////////////////////////////////////////////////////////
        //Profesor
        Profesor Juan = new Profesor("Ingeniero", 451.16, "Director de Carrera", 258, "Juan", "0302605874", "0987815884", "El Batán", "juanprofe.ups.edu.ec");
        Profesor Julio = new Profesor("Licenciado", 500.60, "Profesor", 965, "Julio", "0104589659", "0976594845", "12 de Octubre", "julioprofe.ups.edu.ec");
        Profesor Alberto = new Profesor("Abogado", 600.89, "Rector", 895, "Alberto", "010569815", "09568479536", "El Arenal", "albertano.ups.edu.ec");

//////////////////////////////////////////////////////////////////////////////////////////////    
  //Materia
        Materia matematicas = new Materia(1, "Matematicas Avanzadas", 2, 130, 4,Juan,grupo1);
        Materia etica = new Materia(2, "Etica", 3, 80, 5,Juan,grupo2);
        Materia algebra = new Materia(3, "Algebra", 6, 100, 4,Julio,grupo1);
        Materia programacion = new Materia(4, "Programacion", 6, 260, 6,Alberto,grupo2);
        Materia estructura = new Materia(5, "Estrutura de datos", 5, 200, 3,Julio,grupo1);
        Materia logica = new Materia(6, "Logica", 1, 80, 7,Alberto,grupo2);
////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //Sede
        Sede Cuenca = new Sede(1, "El Vecino", "Calle Vieja", "(+593) 72862213 ext.: 1700");
//////////////////////////////////////////////////////////////////////////////////////////////           
        Cuenca.agregarCarrera(Computacion);
        Cuenca.agregarCarrera(Mecatronica);
        Cuenca.agregarCarrera(Electronica);
//////////////////////////////////////////////////////////////////////////////////////////////
        
        Computacion.agregarMateria(matematicas);
        Computacion.agregarMateria(etica);
        Mecatronica.agregarMateria(algebra);
        Mecatronica.agregarMateria(programacion);
        Electronica.agregarMateria(estructura);
        Electronica.agregarMateria(logica);
        
////////////////////////////////////////////////////////////////////////////////////////////
        Pepito.agregarHistorialCalificacion(calificacionMatematicasPepito);
        Pepito.agregarHistorialCalificacion(calificacionAlgebraPepito);
        
        
        
        //Imprimir Valores//
       
    }
}
