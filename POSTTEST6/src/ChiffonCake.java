/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class ChiffonCake extends Bakery {

        public ChiffonCake (String code, String rasa, int stok){
            super(code, rasa, stok);
        }
        
    //Penggunaan override
    @Override
    public void getBakeryInformation() {
        super.getBakeryInformation(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Code Cake               : "+ Code);
        System.out.println("Rasa Cake               : "+ Rasa);
        System.out.println("Stok yang tersedia      : "+ Stok);
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setRasa(String Rasa) {
        this.Rasa = Rasa;
    }

    public void setStok(int Stok) {
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
    
    public void getBakeryInformation(boolean showCode){ //Penggunaan overloading
        if (showCode) getBakeryInformation();
        else super.getBakeryInformation();
    }
}



