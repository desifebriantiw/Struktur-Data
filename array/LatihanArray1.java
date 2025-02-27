public class LatihanArray1 {//Pendeklarasian nama kelas yang akan di publiknya diberi nama Latihan array1
    public static void main(String[] args) {//Pendeklarasian main metode atau awal mula proram dijalankan/masuk
        // Buat program untuk:
        // 1. Membuat array dengan 10 bilangan bulat
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        // 3. Menampilkan isi array
        // 4. Menghitung jumlah semua elemen array

        int[] bilanganGenap = new int[10];//Menginisialisasi array satu dimensi []dengan bilangan genap berjumlah 10 elemen 
        int jumlah = 0;//Menjelaskan bahwa jumlah  sama dengan nilai awal 0

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) {//Loop for mengisi array dengan menggunakan bilangan genap yang akan dimulai dari 2,dan var i akan terus terulang dari null hingga  panjang array dikurangi 1
            bilanganGenap[i] = (i + 1) * 2;//mengulang bilangan genap yang diberi var [i] diisi dengan var i + 1 dikalikan dengan 2
        }

        // Menampilkan array
        System.out.println("Isi array:");//Mencetak output pada terminal dengan "Isi array"
        for (int bilangan : bilanganGenap) {//mengulang setiap elemen dari array billangan genap secara berurutan hingga elemen paling akhir
            System.out.print(bilangan + " ");//Mencetak setiap elemen bilangan dari array billangan genap yang diikuti dengan spasi
            jumlah += bilangan;//Menambahkan setap elemen bilangan array kedalam variabel jumlah
        }

        System.out.println("Jumlah semua elemen: " + jumlah);//Mencetak output pada terminal dengan "Jumlah semua elemen" yang diikuti oleh variabel jumlah pada terminal,menambahkan baris senelum output print
    }
}