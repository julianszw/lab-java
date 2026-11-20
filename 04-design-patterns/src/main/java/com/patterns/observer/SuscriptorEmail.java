package com.patterns.observer;

/**
 * SuscriptorEmail - Observador Concreto #1.
 *
 * Simula un suscriptor que recibe las noticias por correo electrónico.
 * Al ser notificado, "envía" un email con la noticia recibida.
 *
 * Este es uno de los dos observadores concretos que demuestran cómo
 * distintos observadores pueden reaccionar de forma diferente ante
 * la misma notificación del Sujeto.
 */
public class SuscriptorEmail implements Observer {

    private final String direccionEmail;

    public SuscriptorEmail(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }

    /**
     * Reacción ante la notificación: simula el envío de un email.
     */
    @Override
    public void actualizar(String noticia) {
        System.out.printf("      📧 [Email → %s] Nueva noticia recibida: \"%s\"%n",
                direccionEmail, noticia);
    }

    @Override
    public String toString() {
        return "SuscriptorEmail{" + direccionEmail + "}";
    }
}
