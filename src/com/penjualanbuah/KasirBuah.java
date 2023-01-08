package com.penjualanbuah;

import java.util.Scanner;
public class KasirBuah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Penjualan Parcel Buah");

        int harga = 0;
        int jual = 0;
        int jumlah = 0;

        String kode_brg = null;
        String nama_brg = null;
        String satuan = null;
        String jenis = null;
        String stok = null;
        String kode_p = null;
        String nama_p = null;
        String alamat = null;
        String no_wa = null;


        double total_hrg = 0;
        double diskon = 0;
        double pajak = 0;
        double total_p = 0;
        double kembalian = 0;
        double uang = 0;


        System.out.println("Selamat Datang Di Toko Parcel Buah Arboy ");
        System.out.println("   Penjualan Buah  ");

        System.out.println("kode barang : ");

        kode_brg= input.next();
        switch (kode_brg){
            case "KB01":
                nama_brg = "Parcel Buah Kecil";
                harga    = Integer.parseInt("150000");
                satuan   = "perbuah";
                jenis    = "kecil";
                stok     = "tersedia";
                break;

            case "KB02":
                nama_brg = "Parcel Buah Sedang";
                harga    = Integer.parseInt("120000");
                satuan   = "perbuah";
                jenis    = "sedang";
                stok     = "tersedia";
                break;

            case "KB03":
                nama_brg = "Parcel Buah Besar";
                harga    = Integer.parseInt("100000");
                satuan   = "perbuah";
                jenis    = "jumbo";
                stok     = "tersedia";
                break;
        }
        System.out.println("Kode Pelanggan :");

        kode_p = input.next();
        switch (kode_p){
            case "KP01":
                nama_p   = "Pak Ambon";
                alamat    = "Bantul";
                no_wa    = "08235674297";
                break;

            case "KP02":
                nama_p    = "Bu Anik";
                alamat    = "Sleman";
                no_wa    = "082356753497";
                break;
        }
        System.out.println("nominal uang   :");
        uang=input.nextInt();

        System.out.println("jumlah barang   :");
        jumlah= input.nextInt();
        total_hrg = harga + jumlah;
        System.out.println("Total Harga  :"+total_hrg);

        if (total_hrg >=100000){
            diskon = total_hrg*0.03;
        }

        System.out.println("Nama Barang            : "+nama_brg);
        System.out.println("Harga Satuan           : "+harga);
        System.out.println("Satuan Barang          : "+jenis);
        System.out.println("Stok Barang            : "+stok);

        System.out.println("Nama Pelanggan         : "+nama_p);
        System.out.println("Alamat                 : "+alamat);
        System.out.println("Nomor Wassap           : "+no_wa);
        System.out.println("Nominal Uang           : "+uang);

        System.out.println("Diskon      : "+diskon);
        pajak = 0.2 * total_hrg;
        total_p = total_hrg + pajak - diskon;
        kembalian = uang - total_p;
        System.out.println("Total Kembalian    : "+kembalian);
        System.out.println("Pajak              : "+pajak);
    }
}
