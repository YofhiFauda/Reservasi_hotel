import java.util.Scanner;
public class Perhotelan {
    static Scanner input = new Scanner(System.in);
    static int pilih;
    static int totalKamar,julkam, pesan, ktp, noHp, totalPembayaran;
    static String nama, alamat;
    static int kembalian , inap;
    static int single = 175000, doublle = 225000, suite = 300000;
    static int kamarSingle,kamarDouble, kamarSuite;
    static int jumSingle = 0, jumDouble = 0, jumSuite = 0;
    static String Single = "Single", Duoble = "Double", Suite = "Suite";

    public static void main(String[] args) {
        //membuat perulangan untuk method menu
        do {
            menu();
        } while (pilih != 4);
    }
    public static void menu() {
        System.out.println(" ________________________________ ");
        System.out.println("|          MENU UTAMA            |");
        System.out.println("|--------------------------------|");
        System.out.println("| (1) Data Kamar                 |");
        System.out.println("| (2) Data Penyewa               |");
        System.out.println("| (3) Data Transaksi             |");
        System.out.println("| (4) keluar dari Program        |");
        System.out.println(" -------------------------------- ");
        System.out.print("Masukan Pilihan : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1 -> dataKamar();
            case 2 -> dataPenyewa();
            case 3 -> dataTransaksi();
            default -> System.out.println("Terima Kasih Telah Berkunjung");
        }
    }

    //MEMBUAT METHOD DATA KAMAR
   public static void dataKamar() {
        do {
            System.out.println(" ________________________________ ");
            System.out.println("|          DATA KAMAR            |");
            System.out.println("|--------------------------------|");
            System.out.println("| (1) Pengecekan Semua Kamar     |");
            System.out.println("| (2) Inputkan Total Semua Kamar |");
            System.out.println("| (3) Pesan Kamar                |");
            System.out.println("| (4) Kembali                    |");
            System.out.println("|________________________________|");
            System.out.print("Masukan Pilihan : ");
            pilih = input.nextInt();
            switch (pilih){
                case 1 -> cekKamar();
                case 2 -> inputKamar();
                case 3 -> pesanKamar();
            }
        }while (pilih!= 4);
                 menu();
    }

    //Membuat Method pada Menu DATA KAMAR
    public static void cekKamar() {
        totalKamar = (kamarSingle + kamarDouble + kamarSuite);

        if(julkam == 0){
            System.out.println(" _____________________________________________________ ");
            System.out.println("| Semua Kamar Masih Kosong Kakak                      |");
            System.out.println("| Silahkan Lakukan input Jumlah Kamar Terlebih dahulu |");
            System.out.println("|_____________________________________________________|");
        } else {
            System.out.println("------------------------------");
            System.out.println("          CEK KAMAR           ");
            System.out.println("------------------------------");
            System.out.println("Total Semua Kamar      : "+ julkam);
            System.out.println("Total Kamar Kosong     : " + totalKamar);
            System.out.println("Total Kamar di Pesan   : " + pesan);
            System.out.print("DATA KAMAR KOSONG : ");
            //membuat percabangan Apakah Data pada Masing"  kamar sudah terisi atau kosong
            if (jumSingle == 0){
            System.out.println("Single : "+kamarSingle);//jika kamar belum di pesan maka kamar kosong akan sesuai dengan inputan
            }else {
            System.out.println("Single : "+kamarSingle); //jika kamar sudah di pesan maka kamar kosong akan sesuai dengan kamar yang di pesan
            }
            if (jumDouble == 0){
            System.out.println("                    Double : "+kamarDouble);
            }else {
            System.out.println("                    Double : "+kamarDouble);
            }
            if (jumSuite == 0){
            System.out.println("                    Suite  : "+kamarSuite);
            }else {
            System.out.println("                    Suite  : "+kamarSuite);
            }
            System.out.println("-----------------------------------------");
        }
    }

    public static void inputKamar(){
        int total;
        System.out.print("Masukan Total Semua Kamar  : ");
        julkam = input.nextInt();
        System.out.print("Masukan Total Kamar Single : ");
        kamarSingle = input.nextInt();
        System.out.print("Masukan Total Kamar Double : ");
        kamarDouble = input.nextInt();
        System.out.print("Masukan Total Kamar Suite  : ");
        kamarSuite = input.nextInt();
        total = kamarSingle + kamarDouble + kamarSuite;
        if (total > julkam){
            System.out.println(" --------------------------------------------- ");
            System.out.println("| Kamar yang anda Masukan Melebihi batas      |");
            System.out.println("| Silahkan Melakukan Input Kamar dengan benar |");
            System.out.println(" --------------------------------------------- ");
        }


    }

    public static void pesanKamar(){ //pembuatan pada Menu Kamar
        System.out.println("-------------------------------------------------- ");
        System.out.println("|                *** MENU KAMAR ***               |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| NO | TYPE   | ISI | KOSONG |       HARGA        |");
        System.out.println("|----|--------|-----|--------|--------------------|");
        System.out.println("| 1  | SINGLE |  -  |   -    | Rp. 175.000 / Hari |");
        System.out.println("| 2  | DOUBLE |  -  |   -    | Rp. 225.000 / Hari |");
        System.out.println("| 3  | SUITE  |  -  |   -    | Rp. 300.000 / Hari |");
        System.out.println(" ----|--------|-----|--------|-------------------- ");
        System.out.print("Pilih Kamar yang ingin anda pesan : ");
        pesan = input.nextInt();
        switch (pesan){
            case 1 -> Single();
            case 2 -> Doublle();
            case 3 -> Suite();
        }
    }

    //PEMBUATAN METHOD SINGLE DARI MENU PESAN KAMAR
    //UNTUK PEMESANAN KAMAR SINGLE
        static void Single(){
            System.out.println("Jumlah Kamar Yang Tersedia : "+kamarSingle+" Kamar");
            System.out.println("........................................");
            //jka pesan lebih kecil dari total Kamar Single Maka Akan Melanjutkan Proses Registrasi
        if (pesan < kamarSingle){
             kamarSingle = kamarSingle -  1;
            System.out.println("Kamar yang di pesan : Single");
            System.out.println("Harga Sewa          : Rp. "+single+" per Hari");
            System.out.print("Lama Sewa             : ");
            inap = input.nextInt();
            totalPembayaran = inap * single;
            System.out.println("\n*** Silahkan Isi Data Diri ***");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Nama Anda Sesuai KTP : ");
            nama = input.next();
            System.out.print("Alamat Anda sesuai KTP       : ");
            alamat = input.next();
            System.out.print("Masukan No KTP anda          : ");
            ktp = input.nextInt();
            System.out.print("Masukan No Hp yang aktif     : ");
            noHp = input.nextInt();

            System.out.println("\n*** Melakukan Pembayaran Sewa Kamar ***");
            System.out.println("---------------------------------------");
            System.out.println("Kamar yang anda pesan : Single");
            System.out.println("Lama Menginap         : "+inap);
            System.out.println("Total Bayar           : Rp. "+totalPembayaran);
            System.out.print("Bayar                   : Rp. ");
            int bayar = input.nextInt();
            kembalian = bayar - totalPembayaran;
            System.out.println("Kembalian              : Rp. "+kembalian);
        }
        else { //jika pesan lebih besar dari Kapasitas Kamar Single Maka akan mengeluarkan Output
            System.out.println("Mohon Maaf Kamar Sudah Penuh");
        }
    }

    //PEMBUATAN METHOD DOUBLLE DARI MENU PESAN KAMAR
    //UNTUK PEMESANAN KAMAR DOUBLE
    static void Doublle(){
        System.out.println("Jumlah Kamar Yang Tersedia : "+kamarDouble+" Kamar");
        System.out.println("........................................");
        if (pesan < kamarDouble){ //jka pesan lebih kecil dari total Kamar Double Maka Akan Melanjutkan Proses Registrasi
            kamarDouble = kamarDouble -  1;
            System.out.println("Kamar yang di pesan : Double");
            System.out.println("Harga Sewa          : Rp. "+doublle+" per Hari");
            System.out.print("Lama Sewa             : ");
            inap = input.nextInt();
            totalPembayaran = inap * doublle;
            System.out.println("\n*** Silahkan Isi Data Diri ***");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Nama Anda Sesuai KTP : ");
            nama = input.next();
            System.out.print("Alamat Anda sesuai KTP       : ");
            alamat = input.next();
            System.out.print("Masukan No KTP anda          : ");
            ktp = input.nextInt();
            System.out.print("Masukan No Hp yang aktif     : ");
            noHp = input.nextInt();

            System.out.println("\n*** Melakukan Pembayaran Sewa Kamar ***");
            System.out.println("---------------------------------------");
            System.out.println("Kamar yang anda pesan : Double");
            System.out.println("Lama Menginap         : "+inap);
            System.out.println("Total Bayar           : Rp. "+totalPembayaran);
            System.out.print("Bayar                   : Rp. ");
            int bayar = input.nextInt();
            kembalian = bayar - totalPembayaran;
            System.out.println("Kembalian             : Rp. "+kembalian);
        }
        else { //Jika pesan Lebih besar dari Kapasitas Kamar Double Maka Akan mengeluarkan Outputan
            System.out.println("Mohon Maaf Kamar Sudah Penuh");
        }
    }

    //PEMBUATAN METHOD SUITE DARI MENU PESAN KAMAR
    //UNTUK PEMESANAN KAMAR SUITE
    static void Suite(){
        System.out.println("Jumlah Kamar Yang Tersedia : "+kamarSuite+" Kamar");
        System.out.println("........................................");
        if (pesan < kamarSuite){
            kamarSuite = kamarSuite - 1;
            System.out.println("Kamar yang di pesan : Suite");
            System.out.println("Harga Sewa          : Rp. "+suite+" per Hari");
            System.out.print("Lama Sewa             : ");
            inap = input.nextInt();
            totalPembayaran = inap * suite;
            System.out.println("\n*** Silahkan Isi Data Diri ***");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Nama Anda Sesuai KTP : ");
            nama = input.next();
            System.out.print("Alamat Anda sesuai KTP       : ");
            alamat = input.next();
            System.out.print("Masukan No KTP anda          : ");
            ktp = input.nextInt();
            System.out.print("Masukan No Hp yang aktif     : ");
            noHp = input.nextInt();

            System.out.println("\n*** Melakukan Pembayaran Sewa Kamar ***");
            System.out.println("---------------------------------------");
            System.out.println("Kamar yang anda pesan : Suite");
            System.out.println("Lama Menginap         : "+inap);
            System.out.println("Total Bayar           : Rp. "+totalPembayaran);
            System.out.print("Bayar                   : Rp. ");
           int bayar = input.nextInt();
           kembalian = bayar - totalPembayaran;
           System.out.println("Kembalian              : Rp. "+kembalian);
        }
        else {
            System.out.println("Maaf Kamar Single Sudah Penuh");
        }
    }

    //MEMBUAT METHOD DATA PENYEWA KAMAR
    public static void dataPenyewa() {
        System.out.println("=======================================================================================");
        System.out.println("            *** DATA PENYEWA ***              ");
        System.out.println("----------------------------------------------");
//        System.out.println("=======================================================================================");
//        System.out.println("| "+" NO"+" | "+ " NAMA "+ " | "+" ALAMAT "+ " | "+" NO KTP "+" | "+ " NO HP "+" | "+" KAMAR YANG DI PESAN "+" | ");
//        System.out.println("=======================================================================================");

        for (int i = 0; i<pesan; i++) {
            if (pesan == 1) {
                pesan = kamarSingle;
                System.out.println("    NAMA      : " + nama);
                System.out.println("    ALAMAT    : " + alamat);
                System.out.println("    NO KTP    : " + ktp);
                System.out.println("    NO HP     : " + noHp);
                System.out.println("    KAMAR YANG DI PESAN : " + Single);
                System.out.println("=======================================================================================");
                break;
            }
            if (pesan == 2) {
                pesan = kamarDouble;
                System.out.println("    NAMA      : " + nama);
                System.out.println("    ALAMAT    : " + alamat);
                System.out.println("    NO KTP    : " + ktp);
                System.out.println("    NO HP     : " + noHp);
                System.out.println("    KAMAR YANG DI PESAN : "+ Duoble);
                System.out.println("=======================================================================================");
                break;
            }

            if (pesan == 3) {
                pesan = kamarSuite;
                System.out.println("    NAMA      : " + nama);
                System.out.println("    ALAMAT    : " + alamat);
                System.out.println("    NO KTP    : " + ktp);
                System.out.println("    NO HP     : " + noHp);
                System.out.println("    KAMAR YANG DI PESAN : "+ Suite);
                System.out.println("=======================================================================================");
                break;

            }
        }
    }


    //MEMBUAT METHOD DATA TRANSAKSI PENYEWA KAMAR
   public static void dataTransaksi() {
               System.out.println("=======================================================================================");
               System.out.println("             *** DATA TRANSAKSI ***           ");
               System.out.println("----------------------------------------------");
               System.out.println(" NAMA      : " + nama);
               System.out.println(" ALAMAT    : " + alamat);
               System.out.println(" NO KTP    : " + ktp);
               System.out.println(" NO HP     : " + noHp);
               System.out.println(" KAMAR YANG DI PESAN : "+ Single);
               System.out.println(" LAMA SEWA : "+inap+" Hari");
               System.out.println(" TOTAL UANG YANG HARUS DI BAYARKAN : "+totalPembayaran);
               System.out.println(" KEMBALIAN  : "+kembalian);
               System.out.println("=======================================================================================");
   }
}