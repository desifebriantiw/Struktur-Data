public class OperasiMatriks4 {//Pendeklarasian nama kelas yang akan di publiknya diberi nama OperasiMatriks4
    public static void main(String[] args) {//Pendeklarasian main metode atau awal mula proram dijalankan/masuk
        // Program operasi matriks
        int[][] matriksA = {//Pendeklarasian matriksA 2D [][] denan elemen-elemen yang diberikan
            {1, 2, 3},//elemen/data yang akan di eksekusi
            {4, 5, 6}//elemen/data yang akan di eksekusi
        };

        int[][] matriksB = {//Pendeklarasian matriksA 2D [][] denan elemen-elemen yang diberikan
            {7, 8, 9},//elemen/data yang akan di eksekusi
            {10, 11, 12}//elemen/data yang akan di eksekusi
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3];//mendeklarasikan dan menginisialisasi matriks 2D hasil dengan ukuran 2x3 untuk menyimpan hasil penjumlahan matriksA dan matriksB

        for (int i = 0; i < matriksA.length; i++) {//loop akan mengiterasi setiap baris dalam matriks matriksA. Pada setiap iterasi, nilai i akan digunakan untuk mengakses elemen-elemen dalam baris tertentu dari matriks
            for (int j = 0; j < matriksA[0].length; j++) {//loop akan mengiterasi setiap kolom dalam baris tertentu dari matriks matriksA. Pada setiap iterasi, nilai j akan digunakan untuk mengakses elemen-elemen dalam kolom dari baris tertentu dalam matriks.
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];//digunakan untuk menjumlahkan elemen-elemen yang sesuai dari dua matriks matriksA dan matriksB, dan menyimpan hasil penjumlahan tersebut ke dalam matriks hasil
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:");//Mencetak output pada terminal dengan "Hasil penjumlahan matriks"
        for (int[] baris : hasil) {//Mengulangi setiap baris dalam matriks hasil
            for (int nilai : baris) {//Mengulangi setiap elemen dalam baris mencetak nilai elemen diikuti oleh spasi.
                System.out.print(nilai + " ");//mencetak nilai elemen diikuti oleh spasi.
            }
            System.out.println();//mencetak output paada terminal dengan baris baru setelah setiap baris matriks.
        }
    }
}
