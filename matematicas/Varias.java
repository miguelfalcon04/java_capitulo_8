package matematicas;
/*  */

public class Varias{

    public static boolean esCapicua(int x){
        return capicua((long)x);
    }

    public static boolean esCapicua(long x){
        return x==voltea(x);
    }

    public static long voltea(int x){
        return voltea((long)x);

        
    }

    public static boolean esPrimo(long x){
        if(x<0){

        }
        if()

        int divisor=2;
        while(divisor++<=x/2){
            if(x%divisor==0){
                return false;
            }
        }
        return true;
    }

    public static boolean esPrimo(int x){
        return esPrimo((long)x);
    }

    public static long siguientePrimo(long x){
        while(!esPrimo(0))
    }

    public static long siguientePrimo(int x){
        return siguientePrimo((long)x);
    }
}
