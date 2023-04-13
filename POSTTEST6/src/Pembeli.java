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

public class Pembeli{
    public String code, rasa;
    public int stok;
    
    ArrayList<Bakery> dataBkr = new ArrayList<>();
    
//    public Admin (String username, String pass){
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr); 
    
    public Pembeli(String a,String b, int c){
        this.code = a;
        this.rasa = b;
        this.stok = c;
    }
    
    public void Tampilkan(){
        System.out.println("====================================");
        System.out.println("Kode  : " + this.code);
        System.out.println("Rasa  : " + this.rasa);
        System.out.println("Stom  : " + this.stok);

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}