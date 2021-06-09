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

        this.GB = GB;
    }

    public int getMhz() {
        return Mhz;
    }

    public void setMhz(int mhz) {
        Mhz = mhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
