import java.util.Scanner;

public class Nasabah { //konstruktor
public String nama;
public int norek;
public int saldo;

public Nasabah (String x, int y, int z){ //atribut
    this.nama=x;
    this.norek=y;
    this.saldo=z;
    }

public void ceksaldo(){
    System.out.println("Nama pemilik rekening : "+nama);
    System.out.println("Nomor rekening : "+norek);
    System.out.println("Saldo rekening saat ini : "+saldo);
    }

public int setoruang(int a){ //method
    saldo=saldo-a;
    return saldo;
}

public int terimauang(int a){ //method
    saldo=saldo+a;
    return saldo;
}

public static void main(String args[]){
    Nasabah Nasabah1 = new Nasabah("Akram",212,500000000);
    Nasabah Nasabah2 = new Nasabah("Doi",789,300000000);
    Scanner input1=new Scanner(System.in);
    Scanner input2=new Scanner(System.in);
    
    do{
    Nasabah1.ceksaldo();
    Nasabah2.ceksaldo();
    
    System.out.println("Anda ingin melakukan  : ");
    System.out.println("1. Kirim gaji dari Nasabah 1 ke Nasabah 2");
    System.out.println("2. Kirim gaji dari Nasabah 2 ke Nasabah 1");
    System.out.println("Masukkan pilihan anda : ");
    int pil=input1.nextInt();
    
    System.out.println("Masukkan jumlah uang yang ingin anda transfer : ");
    int x1=input2.nextInt();
    
    System.out.println("=====Saldo Nasabah setelah transfer sejumlah : "+x1+"=====");
    
    if(pil==1){
        Nasabah1.setoruang(x1);
        Nasabah2.terimauang(x1);
    }
    else if (pil==2){
        Nasabah2.setoruang(x1);
        Nasabah1.terimauang(x1);
    }
    else System.out.println("Maaf, pilihan tidak ada");
    
    Nasabah1.ceksaldo();
    Nasabah2.ceksaldo();
}
    while(Nasabah1.saldo>0&&Nasabah2.saldo>0);
    System.out.println("Maaf, anda tidak bisa melakukan transaksi karena saldo tlah habis");
}
    
}
