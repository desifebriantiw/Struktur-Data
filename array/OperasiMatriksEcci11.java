import java.util.Scanner;
public class OperasiMatriksEcci11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input ukuran matriks (n x n)
        System.out.print("Masukkan ukuran matriks (A x B): ");
        int n = input.nextInt();
        // Deklarasi matriks
        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];
        int[][] hasilPerkalian = new int[n][n];
        int[][] hasilTranspose = new int[n][n];
        // Input matriks A
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksA[i][j] = input.nextInt();
            }
        }
        // Input matriks B
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksB[i][j] = input.nextInt();
            }
        }
        // Perkalian Matriks A x B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasilPerkalian[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        // Transpose Matriks A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasilTranspose[j][i] = matriksA[i][j];
            }
        }
        // Menentukan diagonal utama dan diagonal samping
        int sumDiagonalUtama = 0, sumDiagonalSamping = 0;
        System.out.print("Diagonal Utama: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriksA[i][i] + " ");
            sumDiagonalUtama += matriksA[i][i];
        }
        System.out.println("\nJumlah Diagonal Utama: " + sumDiagonalUtama);
        System.out.print("Diagonal Samping: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriksA[i][n - 1 - i] + " ");
            sumDiagonalSamping += matriksA[i][n - 1 - i];
        }
        System.out.println("\nJumlah Diagonal Samping: " + sumDiagonalSamping);
        // Menampilkan hasil perkalian matriks
        System.out.println("\nHasil Perkalian Matriks A x B:");
        cetakMatriks(hasilPerkalian, n);
        // Menampilkan hasil transpose
        System.out.println("\nTranspose Matriks A:");
        cetakMatriks(hasilTranspose, n);
        input.close();
    }
    // Fungsi untuk mencetak matriks
    public static void cetakMatriks(int[][] matriks, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}