package com.patterns.observer;

/**
 * Main - Punto de entrada de la aplicación.
 *
 * Demuestra el flujo completo del patrón Observer:
 *   1. Se crea el Sujeto (CanalDeNoticias).
 *   2. Se crean los Observadores concretos (SuscriptorEmail, SuscriptorMovil).
 *   3. Los observadores se suscriben al canal.
 *   4. El canal publica noticias → todos los suscritos son notificados.
 *   5. Un observador se desuscribe.
 *   6. Se publica otra noticia → solo los suscritos restantes son notificados.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("══════════════════════════════════════════════════════");
        System.out.println("   PATRÓN OBSERVER - Canal de Noticias");
        System.out.println("══════════════════════════════════════════════════════");

        // ─── Paso 1: Crear el Sujeto (Canal de Noticias) ─────────────
        System.out.println("\n▶ Paso 1: Creando el canal de noticias...");
        CanalDeNoticias canal = new CanalDeNoticias("Noticias Tech");

        // ─── Paso 2: Crear los Observadores ──────────────────────────
        System.out.println("\n▶ Paso 2: Creando suscriptores...");
        SuscriptorEmail suscriptorEmail = new SuscriptorEmail("julian@email.com");
        SuscriptorMovil suscriptorMovil1 = new SuscriptorMovil("Carlos_M");
        SuscriptorMovil suscriptorMovil2 = new SuscriptorMovil("Ana_G");

        System.out.printf("   Creados: %s, %s, %s%n",
                suscriptorEmail, suscriptorMovil1, suscriptorMovil2);

        // ─── Paso 3: Suscribir los observadores al canal ─────────────
        System.out.println("\n▶ Paso 3: Suscribiendo observadores al canal...");
        canal.suscribir(suscriptorEmail);
        canal.suscribir(suscriptorMovil1);
        canal.suscribir(suscriptorMovil2);

        // ─── Paso 4: Publicar una noticia (todos son notificados) ────
        System.out.println("\n▶ Paso 4: Publicando primera noticia (3 suscriptores activos)...");
        canal.publicarNoticia("Java 25 ha sido lanzado con nuevas características!");

        // ─── Paso 5: Un observador se desuscribe ─────────────────────
        System.out.println("\n▶ Paso 5: Carlos_M se desuscribe del canal...");
        canal.desuscribir(suscriptorMovil1);

        // ─── Paso 6: Publicar otra noticia (solo 2 son notificados) ──
        System.out.println("\n▶ Paso 6: Publicando segunda noticia (2 suscriptores activos)...");
        canal.publicarNoticia("El patrón Observer es clave en programación reactiva.");

        System.out.println("\n══════════════════════════════════════════════════════");
        System.out.println("   Fin de la demostración");
        System.out.println("══════════════════════════════════════════════════════");
    }
}
