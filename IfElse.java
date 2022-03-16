import java.util.Scanner;

public class DasarJava {
    public static void main(String args[]){
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);
        int ulang=0; //variable lokal
        
        do{ //titik looping
        System.out.print("Masukkan sebuah angka : ");
        int a=input1.nextInt();
        System.out.print("Masukkan angka ke dua : ");
        int b=input2.nextInt();
        int c=0;
        
        System.out.println("Menu yang tersedia : ");
        System.out.println("1)Penjumlahan 2)Pengurangan 3)Pembagian 4)Perkalian");
        System.out.print("Pilih operasi yang anda lakukan : ");
        int pil=input3.nextInt();
        
        if(pil==1){
            c=a+b;
            System.out.print("Hasil penjumlahan kedua bilangan = ");
        }
        else if(pil==2){
            c=a-b;
            System.out.print("Hasil pengurangan kedua bilangan = ");
        }
        else if(pil==3){
            c=a/b;
            System.out.print("Hasil pembagian kedua bilangan = ");
        }
        else if(pil==4){
            c=a*b;
            System.out.print("Hasil perkalian kedua bilangan = ");
        }
        System.out.println(c);
        System.out.print("Tekan angka 1 jika anda ingin mengulang");
        ulang=input4.nextInt();
        }
        while(ulang==1);
        
    }
    
}
