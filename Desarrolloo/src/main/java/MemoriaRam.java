import java.util.Scanner;

public class MemoriaRam {
    private int GB, Mhz;
    private String marca;


    public MemoriaRam(int GB, int mhz, String marca) {
        this.GB = GB;
        Mhz = mhz;
        this.marca = marca;
    }


    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        Scanner teclado= new Scanner(System.in);
        GB= teclado.nextInt();
        this.GB = GB;
    }

    public int getMhz() {
        return Mhz;
    }

    public void setMhz(int mhz) {
        Scanner teclado= new Scanner(System.in);
        mhz= teclado.nextInt();
        Mhz = mhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        Scanner teclado= new Scanner(System.in);
        marca= teclado.next();
        this.marca = marca;
    }

    public String toString(){
        return "las caracteristicas de la memoria ram son GB: "+GB+"\n"+"Mhz: "+Mhz+"\n"+"Marca: "+marca;
    }
}
