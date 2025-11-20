package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" EJERCICIO 1");
        ejercicio1();

        System.out.println("q EJERCICIO 2 ");
        ejercicio2();

        System.out.println(" EJERCICIO 3 ");
        ejercicio3();

        System.out.println(" EJERCICIO 4 ");
        ejercicio4();

        System.out.println(" EJERCICIO 5 ");
        ejercicio5();

        System.out.println(" EJERCICIO 6 ");
        ejercicio6();

        System.out.println(" EJERCICIO 7");
        ejercicio7();

        System.out.println(" EJERCICIO 8 ");
        ejercicio8();

        System.out.println(" EJERCICIO 9");
        ejercicio9();

        System.out.println(" EJERCICIO 10 ");
        ejercicio10();

    }
        public static void ejercicio1() {
            ArrayList<String> frutas = new ArrayList<>();

            frutas.add("Manzana");
            frutas.add("Banana");
            frutas.add("Naranja");
            frutas.add("Pera");

            frutas.add(2, "Uva");

            System.out.println("Primera fruta: " + frutas.get(0));

            frutas.set(3, "Kiwi");

            System.out.println("Tamaño de la lista: " + frutas.size());

            System.out.println("Lista completa: " + frutas);
        }

        public static void ejercicio2() {
            ArrayList<Integer> numeros = new ArrayList<>(
                    Arrays.asList(10, 20, 30, 40, 50, 20)
            );

            numeros.remove(2);

            numeros.remove(Integer.valueOf(20));

            boolean contiene40 = numeros.contains(40);

            System.out.println("¿Contiene 40?: " + contiene40);
            System.out.println("Tamaño final: " + numeros.size());
            System.out.println("Lista resultante: " + numeros);
        }

        public static void ejercicio3() {
            ArrayList<String> nombres = new ArrayList<>(
                    Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena")
            );

            int contador = 0;

            for (int i = 0; i < nombres.size(); i++) {
                System.out.println("Posición " + i + ": " + nombres.get(i));
                if (nombres.get(i).length() > 4) contador++;
            }

            System.out.println("Nombres con más de 4 caracteres: " + contador);
        }

        public static void ejercicio4() {
            ArrayList<Double> valores = new ArrayList<>(
                    Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4)
            );

            double suma = 0;
            double max = valores.get(0);
            double min = valores.get(0);

            for (double v : valores) {
                suma += v;
                if (v > max) max = v;
                if (v < min) min = v;
            }

            double promedio = suma / valores.size();

            System.out.println("Suma: " + suma);
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
            System.out.println("Promedio: " + promedio);
        }

        public static void ejercicio5() {
            ArrayList<Integer> numeros = new ArrayList<>();

            for (int i = 1; i <= 10; i++) numeros.add(i);

            System.out.println("Antes de eliminar: " + numeros);

            Iterator<Integer> it = numeros.iterator();
            int eliminados = 0;

            while (it.hasNext()) {
                int n = it.next();
                if (n % 2 == 0) {
                    it.remove();
                    eliminados++;
                }
            }

            System.out.println("Después de eliminar: " + numeros);
            System.out.println("Eliminados: " + eliminados);
        }

        public static void ejercicio6() {
            ArrayList<String> lenguajes = new ArrayList<>();
            lenguajes.add("Java");
            lenguajes.add("Python");
            lenguajes.add("C++");
            lenguajes.add("JavaScript");
            lenguajes.add("Python");
            lenguajes.add("Go");

            int primeraPython = lenguajes.indexOf("Python");
            int ultimaPython = lenguajes.lastIndexOf("Python");
            boolean contieneRuby = lenguajes.contains("Ruby");

            List<String> sublista = lenguajes.subList(1, 4);

            System.out.println("Primera aparición de Python: " + primeraPython);
            System.out.println("Última aparición de Python: " + ultimaPython);
            System.out.println("¿Contiene Ruby?: " + contieneRuby);
            System.out.println("Sublista (1 a 4): " + sublista);
        }

        public static void ejercicio7() {
            ArrayList<Integer> numeros = new ArrayList<>(
                    Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56)
            );

            Collections.sort(numeros);
            System.out.println("Ascendente: " + numeros);

            numeros.sort(Collections.reverseOrder());
            System.out.println("Descendente: " + numeros);

            ArrayList<String> nombres = new ArrayList<>(
                    Arrays.asList("Ana", "Luis", "Carlos", "Elena", "María")
            );

            Collections.sort(nombres);
            System.out.println("Alfabético: " + nombres);

            nombres.sort(Comparator.comparingInt(String::length));
            System.out.println("Por longitud: " + nombres);
        }

        public static void ejercicio8() {
            ArrayList<String> palabras = new ArrayList<>(
                    Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren")
            );

            palabras.removeIf(p -> p.length() < 5);
            System.out.println("Palabras (>=5 letras): " + palabras);

            ArrayList<Integer> numeros = new ArrayList<>();
            for (int i = 1; i <= 20; i++) numeros.add(i);

            numeros.removeIf(n -> n % 3 == 0);
            System.out.println("Números NO divisibles por 3: " + numeros);
        }

        public static void ejercicio9() {
            ArrayList<String> dias = new ArrayList<>(
                    Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
            );

            Object[] arregloObject = dias.toArray();
            String[] arregloString = dias.toArray(new String[0]);

            System.out.println("Longitud arreglo Object: " + arregloObject.length);
            System.out.println("Longitud arreglo String: " + arregloString.length);

            System.out.println("Elementos Object:");
            for (Object o : arregloObject) System.out.println(o);

            System.out.println("Elementos String:");
            for (String s : arregloString) System.out.println(s);

            String[] nombres = {"Ana", "Luis", "Carlos"};
            ArrayList<String> listaDesdeArreglo = new ArrayList<>(Arrays.asList(nombres));

            System.out.println("Lista creada desde arreglo: " + listaDesdeArreglo);
        }

        public static void ejercicio10() {
            ArrayList<String> nombres = new ArrayList<>();
            ArrayList<Double> notas = new ArrayList<>();

            agregarEstudiante(nombres, notas, "Ana", 4.5);
            agregarEstudiante(nombres, notas, "Luis", 2.8);
            agregarEstudiante(nombres, notas, "María", 3.7);
            agregarEstudiante(nombres, notas, "Carlos", 4.2);
            agregarEstudiante(nombres, notas, "Elena", 2.5);

            listarEstudiantes(nombres, notas);

            System.out.println("Promedio: " + calcularPromedio(notas));

            System.out.println("Aprobados:");
            estudiantesAprobados(nombres, notas);

            eliminarEstudiante(nombres, notas, 1);

            int pos = buscarEstudiante(nombres, "María");
            System.out.println("María está en posición: " + pos);

            listarEstudiantes(nombres, notas);
        }

        public static void agregarEstudiante(ArrayList<String> n, ArrayList<Double> c, String nombre, double nota){
            n.add(nombre);
            c.add(nota);
        }

        public static void eliminarEstudiante(ArrayList<String> n, ArrayList<Double> c, int indice){
            n.remove(indice);
            c.remove(indice);
        }

        public static int buscarEstudiante(ArrayList<String> n, String nombre){
            return n.indexOf(nombre);
        }

        public static double calcularPromedio(ArrayList<Double> notas){
            double suma = 0;
            for(double d : notas) suma += d;
            return suma / notas.size();
        }

        public static void listarEstudiantes(ArrayList<String> n, ArrayList<Double> c){
            for(int i = 0; i < n.size(); i++){
                System.out.println(n.get(i) + " - " + c.get(i));
            }
        }

        public static void estudiantesAprobados(ArrayList<String> n, ArrayList<Double> c){
            for(int i = 0; i < n.size(); i++){
                if(c.get(i) >= 3.0)
                    System.out.println(n.get(i) + " - " + c.get(i));
            }
        }

} 
