/*
 * Copyright 2023 Jorge Román Artes - jorromart@alu.edu.gva.es.
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
package org.japo.java.libraries;

import static java.lang.Double.max;

/**
 *
 * @author Jorge Román Artes - jorromart@alu.edu.gva.es
 */
public class UtilesCaracter {

    private UtilesCaracter() {
    }

    public static final void nCaracter() {

        char[] caracter = {'@', 'Ç', '?', '}', '*'};

        for (int i = 0; i < caracter.length; i++) {
            char c = caracter[i];

            System.out.println("Símbolo" + i + "...:" + c);

        }

    }

    public static final void nNumero() {

        int[] aforo = {3, 4, 5, 8, 10, 40};

        for (int i = 0; i < aforo.length; i++) {
            int j = aforo[i];

            System.out.println("Aforo actual ...:" + j + "personas");

        }

    }

    public static final char nNumero(String p) {

        char c = 0;
        char[] pelele = {'+', '-', '*'};

        for (int i = 0; i < pelele.length; i++) {
            c = pelele[i];

        }

        return c;
    }

    public static final String pNumero(double a, double b) {

        return a == b ? "SI encontrado" : "NO encontrado";
    }

      public static final String sNumero(String a) {
    
           String[] nombres = {"Jorge", "Daniel", "Diego", "Perez", "Lucia"};
          
           String j;
        /*   
          for (int i = 0; i < nombres.length; i++) {
              String nombre = nombres[i];
              
                j = a.equals(nombres) ? "SI encontrado" : "NO encontrado";
          }

*/
        
          if (a.equals(nombres )) {
              
             j = "SI encontrado";
              
          } else {
              
              j = "NO encontrado";
          }
      
        return j;
     
    }
 
    
    public static final double ññNumero(int[] daniel) {

        double k = 0;

        for (int i = 0; i < daniel.length; i++) {
            k += daniel[i];

        }

        return k;
    }

    public static final double NumeroMayor(int[] daniel) {

        double max = daniel[0];

        for (int i = 0; i < daniel.length; i++) {
            if (daniel[i] >= max) {
                max = daniel[i];

            }

        }

        return max;
    }

    public static final double NumeroMenor(int[] daniel) {

        double min = daniel[0];

        for (int i = 0; i < daniel.length; i++) {
            if (daniel[i] < min) {
                min = daniel[i];

            }

        }

        return min;
    }

    public static final double NumeroPosicion(double[] daniel) {

        double min = daniel[0];

        for (int i = 0; i < daniel.length; i++) {
             daniel[i] = (int) min;
            
            System.out.println(""+ (i+1));
            
        }

        

        return min;
    }

}
