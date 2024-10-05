package org.example.facade;

import org.example.model.SistemaClimatizacion;
import org.example.model.SistemaEntretenimiento;
import org.example.model.SistemaIluminacion;
import org.example.model.SistemaSeguridad;

public class CentroDeControlFacade {
    private SistemaSeguridad sistemaSeguridad;
    private SistemaClimatizacion sistemaClimatizacion;
    private SistemaIluminacion sistemaIluminacion;
    private SistemaEntretenimiento sistemaEntretenimiento;

    // Constructor para inicializar todos los sistemas
    public CentroDeControlFacade() {
        this.sistemaSeguridad = new SistemaSeguridad();
        this.sistemaClimatizacion = new SistemaClimatizacion();
        this.sistemaIluminacion = new SistemaIluminacion();
        this.sistemaEntretenimiento = new SistemaEntretenimiento();
    }

    // Método para preparar la casa para una noche de película
    public void prepararNocheDePelicula() {
        System.out.println("Preparando la casa para una noche de película...");

        sistemaSeguridad.activarModoNocturno(); // Activa el modo nocturno
        sistemaClimatizacion.ajustarTemperatura(22);  // Temperatura confortable
        sistemaIluminacion.atenuarLuces();// Atenúa las luces
        sistemaEntretenimiento.encenderTV(); // Enciende la TV
        sistemaEntretenimiento.configurarSonido();// Configura el sonido
        sistemaEntretenimiento.reproducirPelicula();// Reproduce la película

        System.out.println("¡Listo! Todo está preparado para disfrutar la película.");
    }
}
