package Jobsheet5.LatihanPraktikum;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();

        Hotel h1 = new Hotel("Atria", "Malang", 175000, (byte) 2);
        Hotel h2 = new Hotel("Swiss belinn", "Surabaya", 250000, (byte) 4);
        Hotel h3 = new Hotel("Gunawangsa", "Surabaya", 300000, (byte) 5);
        Hotel h4 = new Hotel("Savanah", "Malang", 200000, (byte) 3);
        Hotel h5 = new Hotel("Amaris", "Malang", 150000, (byte) 1);

        list.tambah (h1);
        list.tambah (h2);
        list.tambah (h3);
        list.tambah (h4);
        list.tambah (h5);

        System.out.println("Data hotel sebelum di sorting: ");
        list.tampilAll();
        System.out.println();
        System.out.println("Data hotel setelah di sorting harganya secara ascending: ");
        list.bubbleSortHarga();
        list.tampilAll();
        System.out.println();
        System.out.println("Data hotel setelah di sorting ratingnya secara descending: ");
        list.selectionSortRating();
        list.tampilAll();
    }
}
