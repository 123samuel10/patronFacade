package org.example;

import org.example.facade.CentroDeControlFacade;

public class Main {
    public static void main(String[] args) {
        // Crear la fachada de control central
        CentroDeControlFacade centroDeControl = new CentroDeControlFacade();

        // Preparar la casa para la noche de película
        centroDeControl.prepararNocheDePelicula();
    }
}
