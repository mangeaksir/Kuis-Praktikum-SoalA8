package kuis;

public class MainSoalA8 {

    public static void main(String[] args) {
        Proyek proyek = new Proyek("Aplikasi SIAKAD", 3);

        proyek.tambahTugas("Desain Database", 30);
        proyek.tambahTugas("Modul Login", 20);
        proyek.tambahTugas("Modul KRS", 50);

        proyek.tambahTugas("Modul Nilai", 40);

        Programmer dimas = new Programmer("Dimas", "Backend");
        Programmer laras = new Programmer("Laras", "Frontend");

        proyek.tugaskan(1, dimas);
        proyek.tugaskan(2, laras);

        proyek.tugaskan(5, dimas);

        proyek.selesaikan(1);
        proyek.selesaikan(2);

        Manajer manajer = new Manajer("Pak Rudi");
        manajer.review(proyek);
    }
}