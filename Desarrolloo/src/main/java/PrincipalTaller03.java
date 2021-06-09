import java.util.Scanner;

public class PrincipalTaller03 {
    public static void main(String[] args) {
        mensaje();
    }

    public static void mensaje (){
        System.out.println("bienvenido desea ver un computador? 1. Sí 0. No");
        mensajeAccion();
    }

    public static void mensajeAccion(){
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

    public static void menuAccion(){
        Scanner teclado = new Scanner(System.in);
        int elegir= teclado.nextInt();

        MemoriaRam mr1= new MemoriaRam(8,600,"Tridentz");

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
                String marca= teclado.next();
                mr1.setMarca(marca);
                System.out.println("¿cuántos GB quiere que tenga la ram?");
                int gb= teclado.nextInt();
                mr1.setGB(gb);
                System.out.println("¿de cuántos Mhz quiere que sea la ram?");
                int mhz= teclado.nextInt();
                mr1.setMhz(mhz);

                System.out.println(mr1);

        }
    }
}
