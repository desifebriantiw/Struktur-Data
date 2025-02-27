public class LatihanPraktikum2 {//Pendeklarasian kelas sebagai kelas public
    public static void main(String[] args) {//Pendeklarasian main metode yang akan dieksekusi saat program dijalankan.
        char[][] papan = new char[3][3];//Pembuatan array 2 dimensi dengan papan [3][3] ukuran 3x3 unuk digunakan sebagai menyimpai karakter
        
        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) {//Penginisialisaian variabel i menggunakan loop for yang  akan digunakan sebagai penghitung iterasi loop,dan pernyatan kondisi 
            for (int j = 0; j < 3; j++) {//Loop for mengiterasi variabel j dari 0 hingga 2 (total 3 iterasi)dan mengisi elemen [i][j]dengan "-"
                papan[i][j] = '-';//Penginisialisasian yang akan menghasilkan output "-"
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X';//Mengisi nilai elemen pada array 2 dimensi bahwa papan dibaris pertama dinyatakan dengan karakter "x"
        papan[1][1] = 'o';//Mengisi nilai elemen pada array 2 dimensi bahwa papan dibaris kedua dinyatakan dengan karakter "o"
        papan[2][2] = 'X';//Mengisi nilai elemen pada array 2 dimensi bahwa papan dibaris ketiga dinyatakan dengan karakter "x"

        // Tampilkan papan
        System.out.println("Status Papan:");//Mencetak teks Status papan di output/layar terminal
        tampilkanPapan(papan);//Menampilkan untuk keterangan unuk menunjukkan bahwa status papan permainan dalam terminal
    }

    public static void tampilkanPapan(char[][] papan) {//Mendeklarasikan main metode dengan  memanggil nama tampilkan pesanan,dengan menerima satu parameter berupa array 2 dimensi yang bertipe char yang digunakan untuk menampilkan isi papan permainan
        for (int i = 0; i < 3; i++) {//Penggunaan loop for digunakan untuk penyebutan kode berulang kali(berjalan sebanyak 3 kali)
            for (int j = 0; j < 3; j++) {///Loop for mengiterasi variabel j dari 0 hingga 2 (total 3 iterasi)dan mengisi elemen [i][j]dengan "-"
                System.out.print(papan[i][j] + " ");// Mencetak elemen papan pada posisi [i][j] diikuti dengan spasi
            }
            System.out.println();// Mencetak baris berikutnya setelah mencetak satu baris elemen pada terminal
        }
    }
}
