import matematicas.Varias;

public class Ejercicio {
    public static void main(String[] args) {

        /****************** Ejercicio 2 ES PRIMO ******************/

        if(Varias.esPrimo(7)){
            System.out.println("El 7 es primo");
        }

        /****************** Ejercicio 5 DIGITOS ******************/

        System.out.println("El 5 volteado es "+ Varias.voltea(5));
        System.out.println("El 4872 volteado es "+ Varias.voltea(4872));
        System.out.println("El -18947 volteado es "+ Varias.voltea(-18947));


        
    }
}
