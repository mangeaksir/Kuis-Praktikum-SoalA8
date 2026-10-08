package kuis;

public class Programmer {
    private String nama;
    private String keahlian;

    public Programmer(String nama, String keahlian) {
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public String getNama() {
        return nama;
    }

    public String getKeahlian() {
        return keahlian;
    }
}