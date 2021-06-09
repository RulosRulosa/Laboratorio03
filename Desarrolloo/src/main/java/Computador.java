public class Computador {
    private String ram;
    private int GBram, MhzRam;

    public Computador(String ram, int GBram, int mhzRam) {
        this.ram = ram;
        this.GBram = GBram;
        MhzRam = mhzRam;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getGBram() {
        return GBram;
    }

    public void setGBram(int GBram) {
        this.GBram = GBram;
    }

    public int getMhzRam() {
        return MhzRam;
    }

    public void setMhzRam(int mhzRam) {
        MhzRam = mhzRam;
    }
}
