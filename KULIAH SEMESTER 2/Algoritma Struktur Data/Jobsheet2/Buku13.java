package Jobsheet2;
public class Buku13 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, hargaBayar, hargaDiskon;
    double diskon;

        void tampilInformasi(){
            System.out.println("Judul: "+ judul);
            System.out.println("Pengarang: "+ pengarang);
            System.out.println("Jumlah Halaman: "+ halaman);
            System.out.println("Sisa stock: "+ stok);
            System.out.println("Harga: "+ harga);
            System.out.println("Harga total: "+ hargaTotal);
            System.out.println("Diskon: "+ diskon);
            System.out.println("Harga yang harus dibayarkan: "+ hargaBayar);
        }

        void terjual(int jml){
            stok -= jml;
            hitungHargaTotal(jml);
        } 

        void restock(int jml){
            stok+=jml;
        }
        
        void gantiHarga(int hrg){
            harga = hrg;
        }

        void hitungHargaTotal(int jml){
            hargaTotal = harga * jml;
            hitungDiskon();
        }

        void hitungDiskon(){
            if (hargaTotal > 150000) {
                diskon =  hargaTotal * 0.12;
            } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
                diskon = hargaTotal * 0.5;
            } hitungHargaBayar();
        }

        void hitungHargaBayar(){
            hargaBayar = (int) (hargaTotal - diskon);
        }

        public Buku13() {

        }
        
        public Buku13(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }

    public static void main(String[] args) {

    }
}