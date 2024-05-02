package Responsi;

// inherit dari Person
public class Student extends Person
{ 
    String nim;

    public Student(String name, String address, String nim)
    {
        super(name,address);
        this.nim = nim;
    }

    // method baru di subclass 
    public String getNim() 
    { 
        return nim;
    }

    public void hitungPembayaran(int SPP, int SKS, int Modul)
    {
        int totalPembayaran;
        totalPembayaran = SPP + SKS*250000 + Modul;
        System.out.println("Total Pembayaran = "+totalPembayaran);
    }

    @Override
    public void identity()
    {
        super.identity();
        System.out.println("NIM : "+getNim());
    }

    public void hobi()
    {
        System.out.println("Hobi : Tidur");
    }
}