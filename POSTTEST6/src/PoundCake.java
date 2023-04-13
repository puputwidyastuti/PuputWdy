/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class PoundCake extends Bakery {
    
    public PoundCake(String code, String rasa, int stok){
        super(code, rasa, stok);
    }

    @Override
    public void getBakeryInformation() {
        super.getBakeryInformation(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        System.out.println("Code Cake               : "+ Code);
        System.out.println("Rasa Cake               : "+ Rasa);
        System.out.println("Stok yang tersedia      : "+ Stok);
    }
       
        public String getCode() {
            return Code;
        }

        public void setCode(String Code) {
            this.Code = Code;
        }

        public String getRasa() {
            return Rasa;
        }

        public void setRasa(String Rasa) {
            this.Rasa = Rasa;
        }

        public int getStok() {
            return Stok;
        }

        public void setStok(int Stok) {
            this.Stok = Stok;
        }
        
        public void getBakeryInformation(boolean showCode){ //overloading
        if (showCode) getBakeryInformation();
        else super.getBakeryInformation();
    }


}       


