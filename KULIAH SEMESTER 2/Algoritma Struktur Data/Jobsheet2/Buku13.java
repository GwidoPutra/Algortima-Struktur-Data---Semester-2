package Jobsheet2;
public class Buku13 {
    String judul, pengarang;
    int halaman, stok, harga;

        void tampilInformasi(){
            System.out.println("Judul: "+ judul);
            System.out.println("Pengarang: "+ pengarang);
            System.out.println("Jumlah Halaman: "+ halaman);
            System.out.println("Sisa stock: "+ stok);
            System.out.println("Harga: "+ harga);
        }

        void terjual(int jml){
            stok -= jml;
        }

        void restock(int jml){
            stok+=jml;
        }
        
        void gantiHarga(int hrg){
            harga = hrg;
        }
    
    public static void main(String[] args) {

    }
}