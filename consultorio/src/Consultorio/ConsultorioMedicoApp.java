package Consultorio;

import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nombre;
    private int edad;
    private String historialMedico;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHistorialMedico() {
		return historialMedico;
	}
	public void setHistorialMedico(String historialMedico) {
		this.historialMedico = historialMedico;
	}

    // Constructor, getters y setters
}

class Medico {
    private String nombre;
    private String especialidad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

    // Constructor, getters y setters
}

class ExpedienteMedico {
    private Paciente paciente;
    private Medico medico;
    private List<String> notas;

    public ExpedienteMedico(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(String nota) {
        notas.add(nota);
    }

    public void mostrarExpediente() {
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Edad: " + paciente.getEdad());
        System.out.println("Médico: " + medico.getNombre());
        System.out.println("Especialidad: " + medico.getEspecialidad());
        System.out.println("Historial Médico: " + paciente.getHistorialMedico());
        System.out.println("Notas: ");
        for (String nota : notas) {
            System.out.println("- " + nota);
        }
    }
}

public class ConsultorioMedicoApp {
    public static void main(String[] args) {
        // Crear instancias de Paciente y Medico
        Paciente paciente1 = new Paciente();
        Medico medico1 = new Medico();

        // Crear expediente médico
        ExpedienteMedico expediente1 = new ExpedienteMedico(paciente1, medico1);

        // Agregar notas al expediente
        expediente1.agregarNota("Primera consulta - Presión arterial normal");
        expediente1.agregarNota("Recomendar ejercicio regular y dieta equilibrada");

        // Mostrar expediente médico
        expediente1.mostrarExpediente();
    }
}
