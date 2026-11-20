package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * CanalDeNoticias - Sujeto Concreto (Concrete Subject).
 *
 * Representa un canal de noticias al que los suscriptores pueden unirse.
 * Cuando se publica una nueva noticia, el canal notifica automáticamente
 * a todos los observadores suscritos.
 *
 * Responsabilidades:
 *  - Mantener la lista de observadores suscritos.
 *  - Almacenar el estado actual (la última noticia publicada).
 *  - Notificar a todos los observadores cuando el estado cambia.
 */
public class CanalDeNoticias implements Subject {

    private final String nombreCanal;
    private final List<Observer> observadores;
    private String ultimaNoticia;

    public CanalDeNoticias(String nombreCanal) {
        this.nombreCanal = nombreCanal;
        this.observadores = new ArrayList<>();
    }

    // ─────────────────────────────────────────────────────────────
    //  Implementación de Subject
    // ─────────────────────────────────────────────────────────────

    @Override
    public void suscribir(Observer observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
            System.out.printf("   [%s] Nuevo suscriptor registrado.%n", nombreCanal);
        }
    }

    @Override
    public void desuscribir(Observer observador) {
        if (observadores.remove(observador)) {
            System.out.printf("   [%s] Un suscriptor se ha dado de baja.%n", nombreCanal);
        }
    }

    @Override
    public void notificarObservadores() {
        System.out.printf("   [%s] Notificando a %d suscriptor(es)...%n",
                nombreCanal, observadores.size());
        for (Observer observador : observadores) {
            observador.actualizar(ultimaNoticia);
        }
    }

    // ─────────────────────────────────────────────────────────────
    //  Lógica del canal
    // ─────────────────────────────────────────────────────────────

    /**
     * Publica una nueva noticia en el canal.
     * Al cambiar el estado, se dispara la notificación a todos los observadores.
     *
     * @param noticia el texto de la noticia a publicar
     */
    public void publicarNoticia(String noticia) {
        System.out.println();
        System.out.printf("   [%s] Publicando: \"%s\"%n", nombreCanal, noticia);
        this.ultimaNoticia = noticia;
        notificarObservadores();
    }

    public String getNombreCanal() {
        return nombreCanal;
    }
}
