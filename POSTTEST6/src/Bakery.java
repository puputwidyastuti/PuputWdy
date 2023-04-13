/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;

public class Bakery {
    protected String Code;
    protected String Rasa;
    protected int Stok;

    public Bakery (String Code, String Rasa, int Stok){
        this.Code = Code;
        this.Rasa = Rasa;
        this.Stok = Stok;
    }
    
    public void display(){
        System.out.println("Code        : " + this.Code);
        System.out.println("Rasa        : " + this.Rasa);
        System.out.println("Stok        : " + this.Stok);
    }
    
    public void setCode(String Code){
        this.Code = Code;
    }
    
    public void setRasa(String Rasa ){
        this.Rasa = Rasa;
    }
    
    public void setStok(int Stok){
        this.Stok = Stok;
    }
    
      public String getCode() {
        return Code;
    }

    public String getRasa() {
        return Rasa;
    }

    public int getStok() {
        return Stok;
    }
 
    public void setBakeryInformation(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Code Cake");
        Code = scanner.nextLine();
        
        System.out.println("Masukkan Rasa Cake");
        Rasa = scanner.nextLine();
        
        System.out.println("Masukkan Stok Cake");
        Stok = scanner.nextInt();
        
    }
    
    public void getBakeryInformation(){
        System.out.println("Code Cake               : "+ Code);
        System.out.println("Rasa Cake               : "+ Rasa);
        System.out.println("Stok yang tersedia      : "+ Stok);
        this.setBakeryInformation();
    }
}

  
