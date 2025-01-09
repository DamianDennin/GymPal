/*package gympal;
import gympal.models.Socio;

import java.util.Date;

import gympal.controller.SocioController;
import gympal.dto.EjercicioDTO;
import gympal.dto.EntrenamientoDTO;
import gympal.dto.ObjetivoDTO;
import gympal.dto.RutinaDTO;
import gympal.dto.SocioDTO;
import gympal.interfaces.AdapterMedicion;
import gympal.models.Objetivo;
import gympal.models.Rutina;
import gympal.models.BajarPeso;
import gympal.models.Ejercicio;
import gympal.models.Entrenamiento;
import gympal.models.MantenerFigura;
import gympal.models.Medicion;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello GymPal!\n");

        // Obtener la instancia del controlador
        SocioController socioController = SocioController.getInstance();

        // TEST BAJAR DE PESO

        // Crear un DTO para el socio y pasarlo al controlador para crear el Socio
        SocioDTO socioDTO1 = new SocioDTO("Juan Pérez", 30, "Masculino", 80.0, 1.75, null, null, null, "juancho", "1234", null, null);
        socioController.crearSocio(socioDTO1);

        // Obtener el socio creado (ahora en forma de SocioDTO)
        Socio socioObtenido1 = socioController.obtenerSocioPorUsuario(socioDTO1.getUsuario());

        if (socioObtenido1 != null) {
            System.out.println("Socio creado exitosamente.");
            System.out.println("Nombre: " + socioDTO1.getNombre());

            // Crear el objetivo de tipo Bajar Peso y asignarle este objetivo al socio
            Objetivo bajarPeso = new BajarPeso("Bajar Peso", "Reducir grasa corporal", 45);
            socioObtenido1.editarObjetivo(bajarPeso);

            // Crear una rutina basada en el objetivo y asignarsela al socio
            Rutina rutina = bajarPeso.crearRutina(bajarPeso);
            socioObtenido1.editarRutina(rutina);

            // Imprimir objetivo y rutina del socio
            socioDTO1 = socioObtenido1.toDTO();
            ObjetivoDTO objetivoSocioDTO = socioDTO1.getObjetivo().toDTO();
            System.out.println("Objetivo del socio: " + objetivoSocioDTO.getNombre());
            RutinaDTO rutinaSocioDTO = socioDTO1.getRutina().toDTO();
            System.out.println("Rutina del socio:");
            // Contador de entrenamiento
            int contadorEntrenamiento = 1;
            for (Entrenamiento entrenamiento : rutinaSocioDTO.getEntrenamientos()) {
                EntrenamientoDTO entrenamientoDTO = entrenamiento.toDTO();
                System.out.println("Entrenamiento " + contadorEntrenamiento + ":");
                for (Ejercicio ejercicio : entrenamientoDTO.getEjercicios()) {
                    EjercicioDTO ejercicioDTO = ejercicio.toDTO();
                    System.out.println(ejercicioDTO.getNombre());
                }
                contadorEntrenamiento++;
            }
        } else {
            System.out.println("No se pudo encontrar el socio con usuario: " + socioDTO1.getUsuario());
        }

        // TEST MANTENER FIGURA
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

        // Crear un DTO para el socio y pasarlo al controlador para crear el Socio
        SocioDTO socioDTO2 = new SocioDTO("Martina Antonieta", 20, "Femenino", 60.0, 1.6, null, null, null, "martux", "5678", null, null);
        socioController.crearSocio(socioDTO2);

        // Obtener el socio creado (ahora en forma de SocioDTO)
        Socio socioObtenido2 = socioController.obtenerSocioPorUsuario(socioDTO2.getUsuario());

        if (socioObtenido2 != null) {
            System.out.println("Socio creado exitosamente.");
            System.out.println("Nombre: " + socioDTO2.getNombre());

            // Crear el objetivo de tipo Bajar Peso y asignarle este objetivo al socio
            Objetivo mantenerFigura = new MantenerFigura("Mantener Figura", "Reducir grasa corporal", 45);
            socioObtenido2.editarObjetivo(mantenerFigura);

            // Crear una rutina basada en el objetivo y asignarsela al socio
            Rutina rutina = mantenerFigura.crearRutina(mantenerFigura);
            socioObtenido2.editarRutina(rutina);

            // Imprimir objetivo y rutina del socio
            socioDTO2 = socioObtenido2.toDTO();
            ObjetivoDTO objetivoSocioDTO = socioDTO2.getObjetivo().toDTO();
            System.out.println("Objetivo del socio: " + objetivoSocioDTO.getNombre());
            RutinaDTO rutinaSocioDTO = socioDTO2.getRutina().toDTO();
            System.out.println("Rutina del socio:");
            // Contador de entrenamiento
            int contadorEntrenamiento = 1;
            for (Entrenamiento entrenamiento : rutinaSocioDTO.getEntrenamientos()) {
                EntrenamientoDTO entrenamientoDTO = entrenamiento.toDTO();
                System.out.println("Entrenamiento " + contadorEntrenamiento + ":");
                for (Ejercicio ejercicio : entrenamientoDTO.getEjercicios()) {
                    EjercicioDTO ejercicioDTO = ejercicio.toDTO();
                    System.out.println(ejercicioDTO.getNombre());
                }
                contadorEntrenamiento++;
            }
        } else {
            System.out.println("No se pudo encontrar el socio con usuario: " + socioDTO2.getUsuario());
        }

        // TEST TONIFICAR CUERPO
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

        // Crear un DTO para el socio y pasarlo al controlador para crear el Socio
        SocioDTO socioDTO3 = new SocioDTO("Carlos Martinez", 35, "Masculino", 90.0, 1.8, null, null, null, "marto", "6699", null, null);
        socioController.crearSocio(socioDTO3);

        // Obtener el socio creado (ahora en forma de SocioDTO)
        Socio socioObtenido3 = socioController.obtenerSocioPorUsuario(socioDTO3.getUsuario());

        if (socioObtenido3 != null) {
            System.out.println("Socio creado exitosamente.");
            System.out.println("Nombre: " + socioDTO3.getNombre());

            // Crear el objetivo de tipo Bajar Peso y asignarle este objetivo al socio
            Objetivo tonificarCuerpo = new TonificarCuerpo("Tonificar Cuerpo", "Reducir grasa corporal", 45);
            socioObtenido3.editarObjetivo(tonificarCuerpo);

            // Crear una rutina basada en el objetivo y asignarsela al socio
            Rutina rutina = tonificarCuerpo.crearRutina(tonificarCuerpo);
            socioObtenido3.editarRutina(rutina);

            // Imprimir objetivo y rutina del socio
            socioDTO3 = socioObtenido3.toDTO();
            ObjetivoDTO objetivoSocioDTO = socioDTO3.getObjetivo().toDTO();
            System.out.println("Objetivo del socio: " + objetivoSocioDTO.getNombre());
            RutinaDTO rutinaSocioDTO = socioDTO3.getRutina().toDTO();
            System.out.println("Rutina del socio:");
            // Contador de entrenamiento
            int contadorEntrenamiento = 1;
            for (Entrenamiento entrenamiento : rutinaSocioDTO.getEntrenamientos()) {
                EntrenamientoDTO entrenamientoDTO = entrenamiento.toDTO();
                System.out.println("Entrenamiento " + contadorEntrenamiento + ":");
                for (Ejercicio ejercicio : entrenamientoDTO.getEjercicios()) {
                    EjercicioDTO ejercicioDTO = ejercicio.toDTO();
                    System.out.println(ejercicioDTO.getNombre());
                }
                contadorEntrenamiento++;
            }
        } else {
            System.out.println("No se pudo encontrar el socio con usuario: " + socioDTO3.getUsuario());
        }

        AdapterMedicion adapter = new AdapterMedicion();
        Medicion medicion = adapter.crearMedicion(0.2, 0.5, new Date());
        socioObtenido1.agregarMedicion(medicion);

    }
}
*/