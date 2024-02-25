package aplicacion;

import operaciones.Operaciones;

public class Principal{

    public static void main(String[] args) {
        System.out.println("La suma de los 10 primeros números naturales es " + Operaciones.suma(10));
        System.out.println("El factorial de 10 es " + Operaciones.factorial(10));
        System.out.println("2 elevado a 3 es " + Operaciones.potencia(2, 3));
        double[] lista = {1,2,3,4,5};
        System.out.println("La suma de los elementos de la lista 1 es " + Operaciones.sumaLista(lista, 0, 0));
        System.out.println("La media aritmética de la lista es " + Operaciones.mediaAritmetica(lista,0,0));
        System.out.println("La desviación tipica de la lista es " + Operaciones.desviacionTipica(lista,0,0));
        System.out.println("La suma de los 10 primeros números pares es " + Operaciones.sumaPares(2));
        System.out.println("La suma de los elementos pares de la lista de enteros es " + Operaciones.sumaPares(lista,0,0));
    }
}