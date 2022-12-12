package matematicas;

import javax.swing.text.Position;

public class Varias{

/****************** Ejercicio 1 ES CAPICUA ******************/

    public static Boolean esCapicua(long n){

        if(Varias.voltea(n)==n){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean esCapicua(int n){
        return esCapicua((long)n);
    }

/****************** Ejercicio 2 ES PRIMO ******************/

    public static Boolean esPrimo(long n){

        if(n<2){
            return false;
        }else{

            for(int i=2; i<(n/2)+1;i++){
                if(n%i==0){
                    return false;
                }
            }
        }

        return true;
    }

    public static Boolean esPrimo(int n){
        return esPrimo((long)n);
    }

/****************** Ejercicio 3 SIGUIENTE PRIMO ******************/

    public static long siguientePrimo(long n){

        while(!esPrimo(++n));

        return n;

    }

    public static int siguientePrimo(int n){
        return (int)siguientePrimo((long)n);
    }

/****************** Ejercicio 4 POTENCIA ******************/

    public static double potencia(long base, int exponente){

        if(exponente==0){
            return 1;
        }

        if(exponente<0){
            return 1/potencia(base, -exponente);
        }

        double resul=1;

        for(int i=0; i< Math.abs(exponente);i++){
            resul=resul*base;
        }

        return resul;
    }

/****************** Ejercicio 5 DIGITOS ******************/

    public static long digitos(long n){

        if(n<0){
            n=-n;
        }

        if(n==0){
            return 1;
        }

        int cont=0;

        while(n>0){
            n=n/10;
            cont++;
        }

        return cont;

    }

    public static int digitos(int n){
        return (int)digitos((long)n);
    }

/****************** Ejercicio 6 VOLTEA ******************/

    public static long voltea(long n){

        if (n<0){
            return -voltea(-n);
        }

        long volteado=0;

        do{
            volteado=volteado*10+(n%10);
            n=n/10;
        }while(n>0);

        return volteado;
    }

    public static int voltea(int n){
        return (int)voltea((long)n);
    }

/****************** Ejercicio 7 DIGITO POSICION ******************/

    public static long digitoN(long n, int pos){

        n=Varias.voltea(n);
        long digito=0;

        for(int i=0; i<pos;i++){
            digito=n%10;
            n=n/10;
        }

        return digito;

    }

    public static int digitoN(int n, int pos){
        return (int)digitoN((long)n, pos);
    }

/****************** Ejercicio 8 POSICION DE DIGITO ******************/

    public static long posicionDeDigito(long n, long x){

    }

    public static int posicionDeDigito(int n, int x){
        return (int)posicionDeDigito((long)n, (long)x);
    }

/****************** Ejercicio 9 QUITA POR DETRÁS ******************/
    public static long quitaPorDetras(long x, int n){
        return x/(long)potencia(10,n);
    }

    public static int quitaPorDetras(int x, int n){
        return (int)quitaPorDetras((long)x, n);
    }

/****************** Ejercicio 10 QUITA POR DELANTE ******************/

    public static long quitaPorDelante(long n, long x){

    }

    public static int quitaPorDelante(int n, int x){
        return (int)quitaPorDelante((long)n, (long)x);
    }

/****************** Ejercicio 11 PEGA POR DETRÁS ******************/

    public static long pegaPorDetras(long n, long x){

    }

    public static int pegaPorDetras(int n, int x){
        return (int)pegaPorDetras((long)n,(long) x);
    }

/****************** Ejercicio 12 PEGA POR DELANTE ******************/

    public static long pegaPorDelante(long x, int d){
        x=pegaPorDetras(x,1);
        x= voltea;
    }

/****************** Ejercicio 13 TROZO DE NUMERO ******************/

    public static long trozoDeNumero(long n, long x){

    }

    public static int trozoDeNumero(int n, int x){
        return (int)trozoDeNumero((long)n,(long) x);
    }

/****************** Ejercicio 14 JUNTA NUMEROS ******************/
    public static long juntaNumeros(long x, long y){
        return x*(long) potencia(10,digitos(y))+y;

    }

    public static int juntaNumeros(int x, int y){
        return (int) juntaNumeros((long)x, (long)y);
    }

}