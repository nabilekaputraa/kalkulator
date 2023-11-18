package prak4.latihan1dan2;

import java.util.Scanner;
public class kalkulator {

    public static double Faktorial(double angka){
        if (angka == 1 || angka == 0) {
            return 1.0;
        } else {
            return angka * Faktorial(angka - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilih;
        double angka, pangkat;

        do {

            System.out.println("");
            System.out.println("== Calculator ==");
            System.out.println("1. Akar Kuadrat ");
            System.out.println("2. Pangkat ");
            System.out.println("3. Logaritma ");
            System.out.println("4. faktorial ");
            System.out.println("5. keluar ");
            System.out.print("Pilih operasi (1/2/3/4/5) : ");

            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.println("Hasil akar kuadrat dari "+angka+" adalah : "+Math.sqrt(angka));
            } else if(pilih == 2) {
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.print("Masukan pangkat : ");
                pangkat = input.nextDouble();
                System.out.println(angka+" pangkat "+pangkat+" adalah : "+Math.pow(angka, pangkat));
            } else if (pilih == 3){
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.println("logaritma natural dari "+angka+" adalah : "+Math.log(angka));
            } else if (pilih == 4){
                System.out.print("Masukan angka : ");
                angka = input.nextDouble();
                System.out.println("Faktorial dari "+angka+" Adalah : "+Faktorial(angka));
            } else if (pilih == 5){
                System.out.println("terimakasih sudah menggunakan kalkulator ini");
                System.out.println("Dante : Jackpott\n");
            } else {
                System.out.println("pilihan tidak tersedia :)");
            }

        } while (pilih != 5);
        input.close();
    }

}

