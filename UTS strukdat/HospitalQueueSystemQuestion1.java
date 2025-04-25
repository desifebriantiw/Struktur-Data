import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalQueueSystemQuestion1 {
    private static PriorityQueue<Pasien> antrianPasien = new PriorityQueue<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean berjalan = true;

        System.out.println("Selamat datang di Sistem Manajemen Antrian Rumah Sakit");

        while (berjalan) {
            tampilkanMenu();
            int pilihan = inputAngkaValid("Masukkan pilihan Anda: ");

            switch (pilihan) {
                case 1 -> tambahPasien();
                case 2 -> layaniPasienBerikutnya();
                case 3 -> tampilkanAntrian();
                case 4 -> perbaruiPrioritas();
                case 5 -> cariPasien();
                case 6 -> {
                    System.out.println("Terima kasih telah menggunakan sistem ini. Sampai jumpa!");
                    berjalan = false;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n===== SISTEM ANTRIAN RUMAH SAKIT =====");
        System.out.println("1. Tambah pasien baru ke antrian");
        System.out.println("2. Layani pasien berikutnya");
        System.out.println("3. Tampilkan antrian saat ini");
        System.out.println("4. Perbarui prioritas pasien");
        System.out.println("5. Cari pasien berdasarkan nama");
        System.out.println("6. Keluar");
        System.out.println("======================================");
    }

    private static void tambahPasien() {
        String nama = inputStringValid("Masukkan nama pasien: ");
        int umur = inputAngkaValid("Masukkan umur pasien: ");
        String kondisi = inputStringValid("Masukkan kondisi pasien: ");
        int prioritas = inputAngkaDalamRentang("Masukkan prioritas pasien (1-Kritis sampai 5-Tidak Mendesak): ", 1, 5);

        Pasien pasienBaru = new Pasien(nama, umur, kondisi, prioritas);
        antrianPasien.offer(pasienBaru);
        System.out.println("Pasien berhasil ditambahkan ke antrian.");
    }

    private static void layaniPasienBerikutnya() {
        if (antrianPasien.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            Pasien berikutnya = antrianPasien.poll();
            System.out.println("Melayani pasien berikutnya:");
            System.out.println("Nama     : " + berikutnya.getNama());
            System.out.println("Umur     : " + berikutnya.getUmur());
            System.out.println("Kondisi  : " + berikutnya.getKondisi());
            System.out.println("Prioritas: " + teksPrioritas(berikutnya.getPrioritas()));
        }
    }

    private static void tampilkanAntrian() {
        if (antrianPasien.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar pasien dalam antrian:");
            for (Pasien p : antrianPasien) {
                System.out.printf("- %s (Umur: %d, Kondisi: %s, Prioritas: %s)%n",
                        p.getNama(), p.getUmur(), p.getKondisi(), teksPrioritas(p.getPrioritas()));
            }
        }
    }

    private static void perbaruiPrioritas() {
        System.out.println("Perbarui prioritas pasien (akan dihapus dan ditambahkan ulang).");

        String nama = inputStringValid("Masukkan nama pasien: ");
        boolean ditemukan = false;
        PriorityQueue<Pasien> antrianSementara = new PriorityQueue<>();

        while (!antrianPasien.isEmpty()) {
            Pasien p = antrianPasien.poll();
            if (p.getNama().equalsIgnoreCase(nama)) {
                int prioritasBaru = inputAngkaDalamRentang("Masukkan prioritas baru (1-Kritis sampai 5-Tidak Mendesak): ", 1, 5);
                p.setPrioritas(prioritasBaru);
                antrianSementara.offer(p);
                ditemukan = true;
            } else {
                antrianSementara.offer(p);
            }
        }

        antrianPasien = antrianSementara;

        if (ditemukan) {
            System.out.println("Prioritas pasien berhasil diperbarui.");
        } else {
            System.out.println("Pasien tidak ditemukan.");
        }
    }

    private static void cariPasien() {
        String nama = inputStringValid("Masukkan nama pasien yang dicari: ");
        boolean ditemukan = false;

        for (Pasien p : antrianPasien) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan:");
                System.out.println("Nama     : " + p.getNama());
                System.out.println("Umur     : " + p.getUmur());
                System.out.println("Kondisi  : " + p.getKondisi());
                System.out.println("Prioritas: " + teksPrioritas(p.getPrioritas()));
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Pasien tidak ditemukan.");
        }
    }

    private static String teksPrioritas(int prioritas) {
        return switch (prioritas) {
            case 1 -> "1-Kritis";
            case 2 -> "2-Urgent";
            case 3 -> "3-Tinggi";
            case 4 -> "4-Sedang";
            case 5 -> "5-Tidak Mendesak";
            default -> "Tidak Diketahui";
        };
    }

    private static int inputAngkaValid(String prompt) {
        int nilai;
        while (true) {
            System.out.print(prompt);
            try {
                nilai = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Masukkan tidak valid. Silakan masukkan angka.");
            }
        }
        return nilai;
    }

    private static int inputAngkaDalamRentang(String prompt, int min, int max) {
        int nilai;
        while (true) {
            nilai = inputAngkaValid(prompt);
            if (nilai >= min && nilai <= max) {
                break;
            }
            System.out.println("Masukkan angka antara " + min + " sampai " + max + ".");
        }
        return nilai;
    }

    private static String inputStringValid(String prompt) {
        String nilai;
        while (true) {
            System.out.print(prompt);
            nilai = scanner.nextLine().trim();
            if (!nilai.isEmpty()) {
                break;
            }
            System.out.println("Input tidak boleh kosong. Silakan coba lagi.");
        }
        return nilai;
    }
}

// Kelas Pasien (harus Comparable)
class Pasien implements Comparable<Pasien> {
    private String nama;
    private int umur;
    private String kondisi;
    private int prioritas;

    public Pasien(String nama, int umur, String kondisi, int prioritas) {
        this.nama = nama;
        this.umur = umur;
        this.kondisi = kondisi;
        this.prioritas = prioritas;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKondisi() {
        return kondisi;
    }

    public int getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;
    }

    @Override
    public int compareTo(Pasien lain) {
        return Integer.compare(this.prioritas, lain.prioritas);
    }
}
