package kuis;

public class Manajer {
    private String nama;

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void review(Proyek p) {
        System.out.println("Review oleh: " + nama);
        System.out.print(p.info());
        System.out.println("Progres: " + p.hitungProgres() + "%");
    }
}