package Responsi;

class Person 
{
    // atribut dan method super class 
    protected String name;
    protected String address;

    public Person (String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public void identity()
    {
        System.out.println("Nama : "+getName()); 
        System.out.println("Alamat : "+getAddress());
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void Hobi(String hobi)
    {
        System.out.println("Hobi : "+hobi);
    }
}
   

