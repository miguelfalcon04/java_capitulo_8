package matematicas;

public class Varias{


/****************** Ejercicio 9 QUITA POR DETRÁS ******************/
public static long quitaPorDetras(long x, int n){
    return x/(long)potencia(10,n);
}

public static int quitaPorDetras(int x, int n){
    return (int)quitaPorDetras((long)x, n);
}

/****************** Ejercicio 14 JUNTA NUMEROS ******************/
public static long juntaNumeros(long x, long y){
    return x*(long) potencia(10,digitos(y))+y;

}

public static int juntaNumeros(int x, int y){
    return (int) juntaNumeros((long)x, (long)y);
}
}