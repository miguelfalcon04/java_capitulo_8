import matematicas.Varias;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println(Varias.voltea(123456789));
        int x =1234321;
        if (Varias.esCapicua(x)){
            System.out.println(x+ " es capicua ");
            
        }else{
            System.out.print(x + " no es capicua ");
        }
        
    }
}
