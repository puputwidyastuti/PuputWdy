/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author acer
 */
public class Bakery {
    
    protected String Code;
    protected String Varian;
    protected int Stok;

    public String getCode() {
        return Code;
    }

    public String getVarian() {
        return Varian;
    }

    public int getStok() {
        return Stok;
    }
    
    public Bakery (String Code, String Varian, int Stok){
        this.Code = Code;
        this.Varian = Varian;
        this.Stok = Stok;
    }
    
    public void display(){
        System.out.println("Code        : " + this.Code);
        System.out.println("Varian      : " + this.Varian);
        System.out.println("Stok        : " + this.Stok);
    }
    
    public void setCode(String Code){
        this.Code = Code;
    }
    
    public void setVarian(String Varian ){
        this.Varian = Varian;
    }
    
    public void setStok(int Stok){
        this.Stok = Stok;
    }
}
