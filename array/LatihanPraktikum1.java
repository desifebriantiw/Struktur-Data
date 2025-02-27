public class LatihanPraktikum1 { //Mendeklarasi class yang diberi nama oleh user
    public static void main(String[] args) { //pendeklarasian main metode utama pada kode program yang akan diajalankan
        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};//Pendklarasian array dnegan menggunakan nama
        int[][] nilai = {// [][] deklarasi array 2 dimensi yang akan digunakan,dalam penginputan data dan nilai siswa untuk beberapa mata pelajaran yang akan diinput.
            {80, 85, 90}, // Nilai Ani,nilai disamping adalah nilai yang berurutan untuk mtk,bahasa inggris dan ipo.
            {75, 70, 85}, // Nilai Budi ,nilai disamping adalah nilai yang berurutan untuk mtk,bahasa inggris dan ipo
            {85, 80, 88}, // Nilai Cici,nilai disamping adalah nilai yang berurutan untuk mtk,bahasa inggris dan ipo
            {90, 85, 95}, // Nilai Dodi,nilai disamping adalah nilai yang berurutan untuk mtk,bahasa inggris dan ipo
            {70, 75, 80}  // Nilai Edi,nilai disamping adalah nilai yang berurutan untuk mtk,bahasa inggris dan ipo
        };//digunakan untuk pernyataan pendeklarasian  array 2 dimensi untuk data yang akan diinput sudah lengkap.
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};//pendeklarasian array berisi data nama mata pelajaran siswa

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:");//Mencetak output "rata-rata nilai persiswa"
        for (int i = 0; i < nilai.length; i++) { //Perulangan atau for loop untuk nilai pada setiap siswa
            double total = 0;//Penginisialisasian variabel total untuk menghitung jumlah nilai masing-masing siswa.
            for (int n : nilai[i]) {//Perulangan yang digunakn untuk nilai setiap siswa
                total += n;//Digunkan untuk menambahkan nilai ke variabel total
            }
            double rataSiswa = total / nilai[i].length;//Menghitung rata-rata nilai per siswa
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa);//Mencetak output nama siswa dan rata-ratanya
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:");//Mencetak output " Rata-rata nilai per mata pelajaran"
        for (int j = 0; j < nilai[0].length; j++) {//Perulangan atau for loop yang digunakan untuk nilai pada setiap mata pelajaran
            double total = 0;//Penginisialisasian variabel total untuk menghitung jumlan nilai pada masing-masing mata pelajaran
            for (int i = 0; i < nilai.length; i++) {//Perulangan untuk setiap nilai
                total += nilai[i][j];//Menambahkan nilai mata pelajaran ke variabel total
            }
            double rataMapel = total / nilai.length;//Menghitung rata-rata nilai per mata pelajaran
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);//Mencetak nama mata pelajaran daan rata-rata nilainya
        }
    }
}
