package com.patterns.observer;

/**
 * Interfaz Observer (Observador).
 *
 * Define el contrato que deben cumplir todos los observadores concretos.
 * Cada observador será notificado cuando el Sujeto al que está suscrito
 * cambie de estado (en este caso, cuando se publique una noticia).
 */
public interface Observer {

    /**
     * Método invocado por el Sujeto cuando ocurre un cambio.
     *
     * @param noticia la noticia publicada por el canal
     */
    void actualizar(String noticia);
}
