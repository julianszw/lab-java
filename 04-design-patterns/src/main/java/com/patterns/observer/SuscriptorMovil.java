package com.patterns.observer;

/**
 * SuscriptorMovil - Observador Concreto #2.
 *
 * Simula un suscriptor que recibe las noticias como notificación push
 * en su dispositivo móvil. A diferencia del SuscriptorEmail, este
 * observador reacciona mostrando una alerta tipo "push notification".
 *
 * Esto demuestra que cada observador concreto puede manejar la misma
 * notificación de forma completamente distinta.
 */
public class SuscriptorMovil implements Observer {

    private final String nombreUsuario;

    public SuscriptorMovil(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Reacción ante la notificación: simula una notificación push móvil.
     */
    @Override
    public void actualizar(String noticia) {
        System.out.printf("      📱 [Push → %s] ¡Alerta! Noticia de última hora: \"%s\"%n",
                nombreUsuario, noticia);
    }

    @Override
    public String toString() {
        return "SuscriptorMovil{" + nombreUsuario + "}";
    }
}
