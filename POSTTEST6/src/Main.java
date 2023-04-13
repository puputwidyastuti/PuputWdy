
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws IOException{
         // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        ArrayList<Bakery> dataBkr = new ArrayList<>();
        boolean loop = true;
        while (loop){
            System.out.println("=====================================");
            System.out.println("        Toko Kue Ice Bakery          ");
            System.out.println("=====================================");
            System.out.println("1.\tTambah");
            System.out.println("2.\tTampilkan");
            System.out.println("3.\tUbah");
            System.out.println("4.\tHapus");
            System.out.println("=====================================");

            System.out.print("\n\nMasukkan Pilihan : ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println("                 MENU                ");
                    System.out.println("     TAMBAHKAN DATA MENU BAKERY      ");
                    System.out.println("=====================================");

                            System.out.print("Masukkan code   : ");
                            String cd = br.readLine();
                            System.out.print("Masukkan rasa : ");
                            String rsa = br.readLine();
                            System.out.print("Masukkan stok   : ");
                            int stk = Integer.parseInt(br.readLine());
//                            System.out.print("Masukkan harga   : ");
//                            int hrg = Integer.parseInt(br.readLine());
                            Bakery newBakery = new Bakery(cd, rsa, stk);
                            dataBkr.add(newBakery);
                            break;
                        default:
                            break;
                    
//                    break;
                    
                case 2:
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
                    break;
                case 3:
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
                                System.out.println("Rasa    : "); bkr.setRasa(br.readLine());
                                System.out.println("Stok      : "); bkr.setStok(Integer.parseInt(br.readLine()));
//                                System.out.println("Harga      : "); bkr.setHarga(Integer.parseInt(br.readLine()));
                            }
                        }
                    }else{
                        System.out.println("Data tidak ditemukan ");
                    }
                    break;
                case 4:
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
                    break;
                case 5:
                    loop = false;
                    break;
 
            }
                               
        }
        
    }
    
    }


