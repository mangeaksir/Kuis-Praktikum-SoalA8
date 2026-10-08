package kuis;

public class Proyek {
    private String nama;
    private Tugas[] daftarTugas;
    private int jumlahTugas;

    public Proyek(String nama, int kapasitas) {
        this.nama = nama;
        this.daftarTugas = new Tugas[kapasitas];
        this.jumlahTugas = 0;
    }

    public void tambahTugas(String judul, int bobot) {
        if (jumlahTugas >= daftarTugas.length) {
            System.out.println("Kapasitas tugas penuh.");
            return;
        }

        daftarTugas[jumlahTugas] = new Tugas(judul, bobot);
        jumlahTugas++;
    }

    public void tugaskan(int nomor, Programmer p) {
        if (nomor < 1 || nomor > jumlahTugas) {
            System.out.println("Tugas tidak ditemukan.");
            return;
        }

        daftarTugas[nomor - 1].setProgrammer(p);
    }

    public void selesaikan(int nomor) {
        if (nomor < 1 || nomor > jumlahTugas) {
            System.out.println("Tugas tidak ditemukan.");
            return;
        }

        daftarTugas[nomor - 1].tandaiSelesai();
    }

    public double hitungProgres() {
        int totalBobot = 0;
        int bobotSelesai = 0;

        for (int i = 0; i < jumlahTugas; i++) {
            totalBobot += daftarTugas[i].getBobot();

            if (daftarTugas[i].isSelesai()) {
                bobotSelesai += daftarTugas[i].getBobot();
            }
        }

        if (totalBobot == 0) {
            return 0;
        }

        return (double) bobotSelesai / totalBobot * 100;
    }

    public String info() {
        String hasil = "";

        for (int i = 0; i < jumlahTugas; i++) {
            hasil += (i + 1) + ". " + daftarTugas[i].info() + "\n";
        }

        return hasil;
    }

    public String getNama() {
        return nama;
    }
}