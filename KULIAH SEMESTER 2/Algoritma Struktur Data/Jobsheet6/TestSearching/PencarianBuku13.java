package Jobsheet6.TestSearching;

public class PencarianBuku13 {
    Buku13 listBk[] = new Buku13[5];
    int idx;

    void tambahBuku(Buku13 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku13 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int count = 0;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Anda menginput judul yang sama lebih dari 1 kali");
        }
        return posisi;
    }
            

    public int findSequentialSearch(String cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                return j; 
            }
        }
        return -1;
    }

    public void tampilPosisi(String cari, int pos) {
        if (pos!= -1) {
            System.out.println("data: "+ cari +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("data: "+ cari +" tidak ditemukan");
        }
    }

    public void tampilData(String cari, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku\t: " + cari);
            System.out.println("Judul\t: "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: "+listBk[pos].tahunTerbit); 
            System.out.println("Pengarang\t: "+listBk[pos].pengarang);
            System.out.println("Stock\t: "+listBk[pos].stock);
        } else {
            System.out.println("data" + cari + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int hasilCasting = cari.compareTo(listBk[mid].judulBuku);
            if (hasilCasting == 0) {
                return mid;
            } else if (hasilCasting < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
            
    //     int mid;
    //     if (right >= left) {
    //         mid = left + (right - left) / 2;
    //         if (listBk[mid].kodeBuku.equals(cari)) {
    //             return mid;
    //         } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) { 
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }
    
    void bubbleSort() {
        int n = listBk.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku13 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public Buku13 findBuku(String cari) {
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return listBk[posisi];
    }
}
