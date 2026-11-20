package com.patterns.observer;

/**
 * Interfaz Subject (Sujeto).
 *
 * Define el contrato para gestionar observadores y notificarlos
 * ante cambios de estado. En el patrón Observer, el Sujeto mantiene
 * una lista de observadores y les avisa cuando algo relevante ocurre.
 */
public interface Subject {

    /**
     * Registra un nuevo observador para recibir notificaciones.
     *
     * @param observador el observador a suscribir
     */
    void suscribir(Observer observador);

    /**
     * Elimina un observador de la lista de notificaciones.
     *
     * @param observador el observador a desuscribir
     */
    void desuscribir(Observer observador);

    /**
     * Notifica a todos los observadores registrados sobre un cambio.
     */
    void notificarObservadores();
}
