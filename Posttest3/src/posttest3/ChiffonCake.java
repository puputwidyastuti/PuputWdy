/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author acer
 */
public class ChiffonCake extends Bakery {
        private int harga, jumlah;
        
        public ChiffonCake(int jumlah, int harga){
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

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }
}
 
