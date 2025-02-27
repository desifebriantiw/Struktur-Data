public class PencarianArray2 {//Pendeklarasian nama kelas yang akan di publiknya diberi nama Latihan array2
    public static void main(String[] args) {//Pendeklarasian main metode atau awal mula proram dijalankan/masuk
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};//Pendeklarasian []dan meninisialisasi [] dengan elemen/data bilangan bulat
        int cari = 90;//Pendeklarasian dengan variabel "cari" dengan bilangan 90 int atau nilai yang akn dicari dlm array
        boolean ketemu = false;//pendklarasian dengan menggunakan variabel "ketemu" menggunakan boolean,dan diawali dengan pencarian awal false,guna memberikan pernyataan apakah nilai ditemukan atau tidak
        int indeks = -1;//pendklarasian yang diunakan untuk menyimpan indek pada elemen yang sudah ditemukan

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {//loop ini dugunakan untuk mengiterasi atau mengulang dalam setiap pencarian elemen array nilai dengan menggunakan var i sebagai indeksnya yang akan berulang hingga panjang array dikurai 1  
            if (nilai[i] == cari) {//Berfungsi memeriksa apakah elemen i sama dengan nilai yang dicari
                ketemu = true;//menyatakan jika ketemu maka dinyatakan true 
                indeks = i;//menyatakan jika indek diubah menjadi i
                break;//loop berhenti dengan menybeutkan break pada program
            }
        }

        // Menampilkan hasil
        if (ketemu) {//Pernyaaan if digunakan untuk memeriksa apakah kondisi nya menyatakan ketemu maka akan bernilai true
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);//Mencetak output pada terminal jika ketemu bernilai true yang akan menampilkan pesan "Nilai 90 ditemukan pada indeks 3"
        } else {//Pernyataab else digunakan untuk memeriksa jika kondisi ketemu berniai false,maka program akan menjalakan ke program selanjutnya 
            System.out.println("Nilai " + cari + " tidak ditemukan");//Jika bernilai false maka program akan mncetak output pada terminal "nilai 90 tidak ditemukan".
        }
    }
}
