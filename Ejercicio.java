import matematicas.Varias;

public class Ejercicio {
    public static void main(String[] args) {

        /****************** Ejercicio 1 ES CAPICUA ******************/

        if(Varias.esCapicua(131)){
            System.out.println("131 es capicua");
        }

        /****************** Ejercicio 2 ES PRIMO ******************/

        if(Varias.esPrimo(7)){
            System.out.println("El 7 es primo");
        }

        /****************** Ejercicio 3 SIGUIENTE PRIMO ******************/

        System.out.println("El siguiente primo mayor a 100 es " +Varias.siguientePrimo(100));

        /****************** Ejercicio 4 POTENCIA ******************/

        System.out.println("Base 2 Exponente 3 "+Varias.potencia(2, 3));

        /****************** Ejercicio 5 DIGITOS ******************/

        System.out.println("El numero 123456789 tine "+Varias.digitos(123456789)+" digitos");

        /****************** Ejercicio 6 VOLTEA ******************/

        System.out.println("El 5 volteado es "+ Varias.voltea(5));
        System.out.println("El 4872 volteado es "+ Varias.voltea(4872));
        System.out.println("El -18947 volteado es "+ Varias.voltea(-18947));

        /****************** Ejercicio 7 DIGITO POSICION ******************/

        System.out.println("En la posicion 2 de 13412 está "+Varias.digitoN(13412,2));

        /****************** Ejercicio 9 QUITA POR DETRÁS ******************/

        System.out.println("Quita por detrás 3 numeros de 123456789: "+Varias.quitaPorDetras(123456789, 3));

        
    }
}
