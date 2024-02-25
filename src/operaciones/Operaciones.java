package operaciones;

public class Operaciones {
    
    //Ejercicio 1

    public static int suma(int n){
            if(n==0){
                return 0;
            }
            else{
                return n + suma(n-1);
            }

    }
    
    public static int sumaMemoria(int n, int i, int acumulado){
        if (i>n){
            return acumulado;
        }
        else{
            return sumaMemoria(n, i++, acumulado+i);
        }
    }

    public static int sumav2(int n){
        return sumaMemoria(n,1,0);
    }

    //Ejercicio2

    public static int factorial(int n){
        if (n==0){
            return 0; 
        }
        else{
            return n * factorial(n-1);
        }
    }

    //Ejercicio3

    public static int potencia(int base, int exponente){
        if(exponente==1){
            return base;
        }
        else{
            return base*potencia(base, exponente-1);
        }
    }

    //Ejercicio4

    public static double sumaLista(double[] lista, double suma, int i){
        int n = lista.length;
        suma += lista[i];
        i++;
        if(i==n){
            return suma;
        }
        else{
            return sumaLista(lista, suma, i);
        }

    }

    public static double sumaLista(double[] lista){
        return sumaLista(lista,0,0);
    }

    //Ejercicio5

    public static double mediaAritmetica(double[] lista, int suma, int i){
        int n = lista.length;
        suma += lista[i];
        i++;

        if(i==n){
            return suma/n;
        }
        else{
            return mediaAritmetica(lista,suma,i);
        }
    }

    //Ejercicio6

    public static double desviacionTipica(double[] lista, int iteraciones, double media){
        lista[iteraciones] = Math.pow(lista[iteraciones] - media, 2);
        if (iteraciones==0){
            return Math.sqrt(sumaLista(lista)/lista.length);
        }
        else{
            return desviacionTipica(lista, iteraciones - 1 , media);
        }
    }

    //Ejercicio7

    public static int sumaPares(int n){
        if (n<=2){
            return 0;
        }
        else{
            return n + sumaPares(n-2);
        }
    }

    //Ejercicio8

    public static double sumaPares(double [] lista, double suma, int i){
        if(i==0){
            return suma;
        }
        else{
            i--;
            if(lista[i]%2==0){
                return sumaPares(lista, suma + lista[i], i);
            }
            else{
                return sumaPares(lista, suma, i);
            }
        }
    }
}
