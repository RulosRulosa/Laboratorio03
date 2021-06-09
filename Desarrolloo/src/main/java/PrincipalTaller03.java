import java.util.Scanner;

public class PrincipalTaller03 {
    public static void main(String[] args) {
        System.out.println("hola profe este es mi tercer commit");
    }

    public void mensaje (){
        System.out.println("bienvenido desea ver un computador? 1. Sí 0. No");
    }

    public void mensajeAccion(){
        Scanner teclado= new Scanner(System.in);
        int eleccion= teclado.nextInt();
        switch (eleccion){
            case 1:
                menu();
                menuAccion();

            case 0:
                System.out.println("adiós");
                break;
        }
    }
    public static void menu(){
        System.out.println("1. Ver computador 2. Editar Computador 3. Ver Ram 4. Editar Ram");
    }

    public void menuAccion(){
        Scanner teclado = new Scanner(System.in);

        int elegir= teclado.nextInt();

        switch (elegir){
            case 1:
                System.out.println("Su computador es:");
            case 2:
                System.out.println("¿De qué marca de sea que sea el computador?");
                System.out.println("¿Qué modelo quiere que sea?");
            case 3:
                System.out.println("su ram es:");

            case 4:
                System.out.println("¿de qué marca quiere la ram?");
                System.out.println("¿cuántos GB quiere que tenga la ram?");
                System.out.println("¿de cuántos Mhz quiere que sea la ram?");

        }
    }
}
