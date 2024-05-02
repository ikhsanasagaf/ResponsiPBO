package Responsi;
import java.util.*;

class InheritMain 
{
    public static void main(String[] args) 
    { 
        String name;
        String address;
        String nim;
        int spp;
        int sks;
        int modul;

        Scanner inp = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        name = inp.next();
        System.out.println("Masukkan Alamat : ");
        address = inp.next();
        System.out.println("Masukkan NIM : ");
        nim = inp.next();
        System.out.println("");

        System.out.println("Masukkan SPP : ");
        spp = inp.nextInt();
        System.out.println("Masukkan SKS : ");
        sks = inp.nextInt();
        System.out.println("Masukkan Modul : ");
        modul = inp.nextInt();
        System.out.println("");

        Student mahasiswa = new Student(name,address,nim);

        mahasiswa.identity();
        mahasiswa.hobi();
        mahasiswa.hitungPembayaran(spp, sks, modul);
    }
}