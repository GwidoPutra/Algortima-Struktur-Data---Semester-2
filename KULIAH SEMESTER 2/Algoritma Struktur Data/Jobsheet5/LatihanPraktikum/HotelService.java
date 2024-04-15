package Jobsheet5.LatihanPraktikum;

public class HotelService {
    Hotel [] rooms;
    int idx;

    public HotelService() {
        rooms = new Hotel[5];
        idx = 0;
    }
   
    void tambah (Hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampilAll() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Nama: "+ rooms[i].nama +", Kota: " + rooms[i].kota + ", Harga: " + rooms[i].harga + ", Bintang: " + rooms[i].bintang);
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSortRating() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (rooms[j].bintang > rooms[maxIndex].bintang) {
                    maxIndex = j;
                }
            }
            Hotel temp = rooms[maxIndex];
            rooms[maxIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
