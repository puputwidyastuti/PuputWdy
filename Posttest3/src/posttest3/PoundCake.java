/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author acer
 */
public class PoundCake extends Bakery {
        private String nama;
        private int harga, jumlah;
           
        public PoundCake(String nama, int jumlah, int harga){
            super(nama);
            this.harga = harga;
            this.jumlah = jumlah;
        }
        
        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        public int getJumlah() {
            return jumlah;
        }

    @Override
    public void setBakeryInformation() {
        super.setBakeryInformation(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
        
    }       
//        public int getCost(){
//            double hargaPerPoundCake = (double) harga / 12.0;
//            int cost = (int) Math.round(hargaPerPoundCake * jumlah);
//            return cost;
//        }

