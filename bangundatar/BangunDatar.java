package bangundatar;

public interface BangunDatar {
    public double luas(int s1, int s2);
    public double keliling(int s1, int s2);
}
package com.dicoding.javafundamental.bangundatar;

 

import java.util.Scanner;

 

public class Main {

 

    private static char pilihan;

    private static Scanner scanner = new Scanner(System.in);

    

    public static void main(String[] args) {

        /*Kamus*/

        PersegiPanjang opersegi;

        SegitigaSiku osegitiga;

        Lingkaran olingkaran;

        int s1, s2, r;

 

        opersegi = new PersegiPanjang();

        osegitiga = new SegitigaSiku();

        olingkaran = new Lingkaran();

 

        /*Program*/

        //panggil metode

        mainMenu();

        //kondisional untuk pilihan menu yang dimasukan

        switch(pilihan){

            case '1':{

                System.out.print("Masukan panjang persegi: ");

                s1 = scanner.nextInt();

                System.out.print("Masukan lebar persegi: ");

                s2 = scanner.nextInt();

                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));

                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));

                break;

            }

            case '2':{

                System.out.print("Masukan alas segitiga siku: ");

                s1 = scanner.nextInt();

                System.out.print("Masukan tinggi segitiga siku: ");

                s2 = scanner.nextInt();

                System.out.println("Luas segitiga: " + osegitiga.luas(s1,s2));

                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1,s2));

                break;

            }

            case '3':{

                System.out.print("Masukan jari-jari lingkaran: ");

                r = scanner.nextInt();

                System.out.println("Luas lingkaran: " + olingkaran.luas(r));

                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));

                break;

            }

            default :{

                System.out.println("tidak ada pilihan");

                break;

            }

        }

    }

 

    private static void mainMenu(){

        //pilihan menu

        System.out.println("====================");

        System.out.println("Hitung Luas dan Keliling :");

        System.out.println("1. Persegi Panjang");

        System.out.println("2. Segitiga Siku");

        System.out.println("3. Lingkaran");

        System.out.print("Masukan Menu : ");

        pilihan = scanner.next().charAt(0);

    }

}

Untuk menjalankan program yang telah dibuat, klik tombol run. Setelah menalankan program tersebut, console akan menampilkan seperti berikut ini. Pertama akan muncul pilihan menu bangun datar yang akan kita hitung luas dan kelilingnya. Untuk mencoba, bisa pilih antara 1-3. Misalnya Anda bisa pilih menu 1, yaitu menghitung luas dan keliling persegi panjang. Maka Anda akan diminta untuk memasukkan panjang dan lebar. Setelah itu, akan keluar hasil perhitungan dari luas dan keliling persegi panjang. Outputnya akan jadi seperti ini:

====================

Hitung Luas dan Keliling :

1. Persegi Panjang

2. Segitiga Siku

3. Lingkaran

Masukan Menu : 1

Masukan panjang persegi: 10

Masukan lebar persegi: 20

Luas persegi panjang: 200.0

Untuk mencoba memilih menu lain, jalankan lagi programnya dan pilih menghitung luas dan keliling pada bangun datar yang lain. Selain itu Anda juga bisa membuat bangun datar yang lain, misalnya trapesium, layang-layang, belah ketupat, dll. Untuk tambahan menghitung luas dan kelilingnya. Selamat mencoba dan berkreasi.

Silakan unduh kode kasus di atas pada tautan berikut ini https://github.com/dicodingacademy/BelajarJava/tree/Bangun-Datar.

