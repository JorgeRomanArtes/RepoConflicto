/*
 * Copyright 2022 José A. Pacheco Ondoño - japolabs@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;
import org.japo.java.libraries.UtilesApp;
import org.japo.java.libraries.UtilesCaracter;
import org.japo.java.libraries.UtilesConfig;

/**
 *
 * @author José A. Pacheco Ondoño - japolabs@gmail.com
 */
public final class App {

    // Propiedades del Sistema
    private final Properties prp;

    public App(Properties prp) {
        this.prp = prp;
    }

    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    // Logica de Negocio
    public final void launchApp() {

        System.out.println("ELECCIÓN DE DELEGADO/A");
        System.out.println("======================");

        Properties m = UtilesApp.importarPropiedades("app.properties");

        String n = m.getProperty("candidatos");

        String[] z = n.split(",");

        // String[] h = {"Gumersinda Peláez Patata","Perfecto Redondo Cuadrado","Risotto Nientro Nisalgo"};
        //String[] n = {m};
        int[] e = {7, 2, 4};

        int a = 0;
        int o = 2;

        double a2 = (a * 100) / 5;
        double o2 = (o * 100) / 5;

        for (int i = 0; i < z.length; i++) {
            String string = z[i];

            System.out.println("[" + (i + 1) + "] " + string + "- 0" + i + " Votos/s -");

        }
/*
        for (int j = 0; j < e.length; j++) {
            int k = e[j];

        }
*/
        System.out.println("---");
        System.out.printf("[B] Votos en BLANCO  -%d Votos/s - %.2f%% %n", a, a2);
        System.out.printf("[N] Votos NULOS      -%d Votos/s - %.2f%%%n", o, o2);
        System.out.println("---");
        // System.out.println("[i] %s - %d Voto/s - %d %% %n");

        int j = (int) UtilesCaracter.ññNumero(e);
        System.out.println("---");
        System.out.printf("Votos EMITIDOS       -%d%n", j);
        System.out.println("---");
        System.out.println("Nuevo VOTO (S: SALIR) ............:");
        System.out.println("---");

        System.out.println("----------------------------------------------------------------------");

        System.out.println("RESULTADO DE LA ELECCIÓN");
        System.out.println("========================");

        //System.out.println("[i] %s - %d Voto/s - %d %% %n");
        int v = (int) UtilesCaracter.NumeroMayor(e);
        System.out.printf(" %d Voto/s %n", v);

        System.out.println("");

    }
}
