package pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Error Handling
        try{
            //IO Sederhana
            Scanner scanner = new Scanner(System.in);

            //Array
            BukuInfo[] buku = new BukuInfo[2];

            //Perulangan (Looping)
            for(int i=0; i<buku.length; i++){
                System.out.println("|Buku "+(i+1)+"|");
                System.out.print("Masukkan Judul Buku\t: ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan Kode Buku\t: ");
                String kode = scanner.nextLine();
                System.out.print("Masukkan Banyak Halaman\t: ");
                int halaman = scanner.nextInt();
                scanner.nextLine();

                //Object
                buku[i] = new BukuInfo(judul, kode, halaman);
            }

            //Perulangan (Looping)
            for (BukuInfo data: buku){
                System.out.println("\n▸ Buku Info");
                System.out.println(data.tampil());
            }
        } catch (NumberFormatException e){
            System.out.println("\nKode Yang Dimasukkan Salah: "+e.getMessage());
            
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("\nKode Yang Dimasukkan Kurang: "+e.getMessage());
        
        }  catch (Exception e){
            System.out.println("\nKesalahan Umum: "+e.getMessage());
        }
    }
}
