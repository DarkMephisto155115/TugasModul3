import java.util.Scanner;

public class Main {
    /**
     * Kalkulasi untuk mendapatkan PPh
     *
     * @param penghasilanKotor Penghasilan kotor yaitu gaji selama 1 tahun sebelum dikurangi tanggungan
     * @param bebanTanggungan Tanggungan yang harus dikeluarkan selama 1 tahun
     * @param menikah Apakah sudah menikah ("true" jika iya dan "false" jika tidak)
     * @param anak Jumlah anak/tanggungan yang dimiliki (0 misalkan tidak punya)
     * @return mengembalikan pajak PPh yang harus dibayarkan
     */
    public double pajakPPh(double penghasilanKotor, double bebanTanggungan, boolean menikah, int anak){
            double penghasilanBersih = penghasilanKotor - bebanTanggungan;
            double penghasilanTidakKenaPajak = 54;
            double totalPajakPPh = 0;
            if(menikah){
                penghasilanTidakKenaPajak+= 4.5;
            }

            if (anak > 0) {
                if (anak >3){
                    anak = 3;
                }
                penghasilanTidakKenaPajak += anak*4.5;
            }

            double penghasilanKenaPajak = penghasilanBersih - penghasilanTidakKenaPajak;
            if (penghasilanKenaPajak < 0){
                penghasilanKenaPajak = 0;
            }

            if(penghasilanKenaPajak <= 60){
                totalPajakPPh = (penghasilanKenaPajak*0.05);
            } else if (penghasilanKenaPajak <= 250) {
                totalPajakPPh = (penghasilanKenaPajak*0.15);
            } else if (penghasilanKenaPajak <= 500) {
                totalPajakPPh = (penghasilanKenaPajak*0.25);
            }else if (penghasilanKenaPajak <= 5000) {
                totalPajakPPh = (penghasilanKenaPajak*0.25);
            }else if (penghasilanKenaPajak > 5000) {
                totalPajakPPh = (penghasilanKenaPajak*0.25);
            }else{
                System.out.println("Terjadi kesalahan");
            }
            return totalPajakPPh;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hitungPPh hitungPPh = new hitungPPh();
        System.out.println("==================================");
        System.out.println("\t\t   Kalkulator");
        System.out.println("\t PPh (Pajak Penghasilan)");
        System.out.println("==================================");
        System.out.print("Masukkan Penghasilan per-bulan (Juta) : ");
        hitungPPh.setPenghasilanKotor(sc.nextDouble());
        System.out.print("Masukkan Tanggungan per-bulan (Juta) : ");
        hitungPPh.setBebanTanggungan(sc.nextDouble());
        System.out.println("Sudah menikah?");
        System.out.println("1. Sudah");
        System.out.println("2. Belum");
        System.out.println("===========");
        int pilihan = sc.nextInt();
        hitungPPh.setSudahMenikah(pilihan == 1);
        System.out.println("Punya anak?");
        System.out.println("1. Punya");
        System.out.println("2. Tidak punya");
        System.out.println("===========");
        pilihan = sc.nextInt();
        if(pilihan == 1){
            System.out.println("Berapa jumlah anak");
            hitungPPh.setAnak(sc.nextInt());
        }else{
            hitungPPh.setAnak(0);
        }
        hitungPPh.DisplayPPh();


    }
}