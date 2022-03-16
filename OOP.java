class Barang{
    //data
    String barang;
    String harga;

    //constructor
    Barang(String barang, String harga){
       this.barang = barang; //ini adalah constructor
       this.harga = harga;
    }

    //method tanpa return tanpa parameter
    void show(){
        System.out.println("Nama Barang: " + this.barang);
        System.out.println("Harga Barang : " + this.barang);
    }

    //method tanpa return dengan parameter
    //setter
    void setBarang(String barang){
        this.barang = barang;
    }

    //method dengan return tanpa parameter
    //getter
    String getBarang(){
        return this.barang;
    }
    String getHarga(){
        return this.harga;
    }

    //method dengan return dengan paramater
    String warung(String pesan){
        return pesan + "Ini adalah " + this.barang + "dengan harga" + this.harga;
    }
}

public class oop {

    public static void main(String[] args) {
        Barang barang1 = new Barang("Sampoo", 20000);
        Barang barang2 = new Barang("Sabun", 15000);
        Barang barang3 = new Barang("Permen", 10500);
        barang1.show();
        barang2.show();
        barang3.show();
        System.out.println("--------------");

        barang3.show();
        barang3.setBarang("Pillows");
        barang3.show();
        System.out.println("--------------");

        System.out.println(barang1.getBarang());
        System.out.println(barang3.getHarga());
        System.out.println("--------------");

        String data = barang2.warung("Ini barang apa ? ");
        System.out.println(data);
    }
}
