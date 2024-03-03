import java.util.Scanner;

public class TP1_NO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Perpustakaan DAVID!");
        System.out.println("Jenis buku yang tersedia: ");
        System.out.println("1. Pelajaran");
        System.out.println("2. Novel");
        System.out.println("3. Skripsi");

        System.out.print("Masukkan jenis buku (1/2/3): ");
        int bookType = scanner.nextInt();

        System.out.print("Masukkan jumlah hari keterlambatan pengembalian: ");
        int daysLate = scanner.nextInt();

        double fine = calculateFine(bookType, daysLate);
        if (fine > 0) {
            System.out.println("Denda yang harus dibayarkan: Rp" + fine);
        } else {
            System.out.println("Tidak ada denda yang harus dibayarkan. Terima kasih sudah mengembalikan tepat waktu!");
        }

        scanner.close();
    }

    public static double calculateFine(int bookType, int daysLate) {
        double fine = 0;
        switch (bookType) {
            case 1: // Pelajaran
                fine = daysLate * 2000; // Rp2 ribu per hari
                break;
            case 2: // Novel
                fine = daysLate * 5000; // Rp5 ribu per hari
                break;
            case 3: // Skripsi
                fine = daysLate * 10000; // Rp10 ribu per hari
                break;
            default:
                System.out.println("Jenis buku tidak valid.");
        }
        return fine;
    }
}
