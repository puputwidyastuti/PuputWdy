/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author acer
 */
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;

public class Action {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
 
    ArrayList<Bakery> dataBkr = new ArrayList<>();
    
    void tambahCake() throws IOException{
        System.out.print("\n>>> Masukkan Jumlah Data Yang Ingin di masukkan : ");
        int jmlh = Integer.parseInt(br.readLine());
        
        System.out.println("|================================================");
        for(int i = 0; i < jmlh; i++){
            System.out.println("|Data ke : " + (i + 1)+"|");
            System.out.println("------------");
            System.out.print(" Masukkan Code cake :");
            String cd = br.readLine();
            System.out.print(" Masukkan rasa cake : ");
            String rsa = br.readLine();
            System.out.print(" Masukkan jumlah stok barang: ");
            int stk = Integer.parseInt(br.readLine());
            System.out.println("|============================================");
            
            Bakery newBakery = new Bakery(cd, rsa, stk);
            dataBkr.add(newBakery);
            
        } 
    }
    
    void tampil() throws IOException{
        System.out.println("=====================================");
        System.out.println("                 MENU                ");
        System.out.println("       LIHAT DATA MENU BAKERY        ");
        System.out.println("=====================================");
        System.out.print("\n\nMasukkan data ke berapa yang ingin dilihat : ");
        int menuLihat = Integer.parseInt(br.readLine());
        if(menuLihat ==1){
            System.out.println(" Data di Ice Bakery ");
            for (int i = 0; i < dataBkr.size(); i ++){
                System.out.println("Code         : " + dataBkr.get(i).getCode());
                System.out.println("Rasa         : " + dataBkr.get(i).getRasa());
                System.out.println("Stok         : " + dataBkr.get(i).getStok());
                }
        }else{
        System.out.println("Data tiakk ditemukan");
    }
    }
    void ubah() throws IOException{
        System.out.println("=====================================");
        System.out.println("                 MENU                ");
        System.out.println("       LIHAT DATA MENU BAKERY        ");
        System.out.println("=====================================");
        System.out.print("\n\nMasukkan data keberapa yang ingin diedit : ");
        int menuEdit = Integer.parseInt(br.readLine());
                    
        if(menuEdit == 1){
            System.out.println("Masukkan code data Bakery : ");
            String findBkr = br.readLine();
 
            for(Bakery bkr : dataBkr){
            if(bkr.getCode().equals(findBkr)){
                System.out.println("Code      : "); bkr.setCode(br.readLine());
                System.out.println("Rasa      : "); bkr.setRasa(br.readLine());
                System.out.println("Stok      : "); bkr.setStok(Integer.parseInt(br.readLine()));
//              System.out.println("Harga      : "); bkr.setHarga(Integer.parseInt(br.readLine()));
                }
            }
            }else{
            System.out.println("Data tidak ditemukan ");
        }

    }
    
    void hapus() throws IOException{
        System.out.println("====================================");
        System.out.println("                 MENU               ");
        System.out.println("       LIHAT DATA MENU BAKERY       ");
        System.out.println("====================================");
        System.out.print("\n\nMasukkan data keberapa yang ingin dihapus : ");
        int menuHapus = Integer.parseInt(br.readLine());
        if(menuHapus == 1){
            System.out.println("Masukan Code Data Ice Bakery "); String findBkr1 = br.readLine();
 
            for(int i = 0; i < dataBkr.size(); i++){
            if(dataBkr.get(i).getCode().equals(findBkr1)){
            dataBkr.remove(i);
            System.out.println(" Data berhasil dihapus\n");
            }
        }
        }
    }
  
}

