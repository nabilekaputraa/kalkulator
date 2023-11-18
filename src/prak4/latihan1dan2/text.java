package prak4.latihan1dan2;
import java.util.Scanner;
public class textanalyzer {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputText(scanner);
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
