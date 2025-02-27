public class StatistikArray3 {//Pendeklarasian nama kelas yang akan di publiknya diberi nama StatistikArray3
    public static void main(String[] args) {//Pendeklarasian main metode atau awal mula proram dijalankan/masuk
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};//Pendeklarasian []dan meninisialisasi [] dengan elemen/data bilangan bulat

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];//Pendeklarasian nilai tertinggi dengan inisialisai elemen pertama array
        int terendah = nilai[0];//Pendeklarasian nilai terendah dengan inisialisai elemen pertama array
        int total = nilai[0];//Pendeklarasian total nilai dengan inisialisai elemen pertama array

        for (int i = 1; i < nilai.length; i++) {//Loop ini mengulang nilai array mulai dari elemen kedua hingga terakhir
            if (nilai[i] > tertinggi) tertinggi = nilai[i];//memperbarui nilai tertinggi dalam array nilai dan memeriksa terlebih dahulu sebelum memperbarui nilai tertinggi dalam array 
            if (nilai[i] < terendah) terendah = nilai[i];//memperbarui nilai terendah dalam array nilai dan memeriksa terlebih dahulu sebelum memperbarui nilai terendah dalam array
            total += nilai[i];//menjumlahkan semua elemen dalam array nilai dan menyimpan hasil penjumlahan tersebut dalam variabel total.
        }

        double rataRata = (double) total / nilai.length;//digunakan untuk menghitung rata-rata nilai dari semua elemen dalam array nilai dan menyimpan hasilnya dalam variabel rataRata bertipe double.

        System.out.println("Nilai tertinggi: " + tertinggi);//Mencetak output nilai tertinggi dari total keseluruhan nilai 
        System.out.println("Nilai terendah: " + terendah);//Mencetak output nilai terendah dari total keseluruhan nilai 
        System.out.println("Rata-rata: " + rataRata);////Mencetak output nilai rata-rata  dari total keseluruhan nilai 
    }
}
