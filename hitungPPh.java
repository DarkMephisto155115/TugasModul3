/**
 * Kelas untuk menghitung PPh
 */
public class hitungPPh {
    /**
     * Gaji total yang didapatkan setiap 1 bulan
     */
    private double penghasilanKotor;
    /**
     * Beban yang harus dibayarkan setiap 1 bulan
     */
    private double bebanTanggungan;
    /**
     * Apakah sudah menikah ("true" jika iya dan "false" jika tidak)
     */
    private boolean sudahMenikah;
    /**
     * Jumlah anak/tanggungan yang dimiliki (0 misalkan tidak punya)
     */
    private int anak;
    /**
     * Gaji dikurangi dengan beban
     */
    private double penghasilanBersih;
    /**
     * Penghasilan yang tidak dikenakan pajak, umumnya 54 jt setiap orang dan akan bertambah apabila punya istri dan anak
     */
    private double penghasilanTidakKenaPajak = 54;
    /**
     * Penghasilan yang akan dikenakan pajak PPh
     */
    private double penghasilanKenaPajak;
    /**
     * Pajak PPh yang harus dibayarkan
     */
    private double totalPajakPPh;

    /**
     * Kalkulasi pajak PPh serta mengisi variabel yang dibutuhkan
     */
    public void pajakPPh(){


        setPenghasilanBersih((getPenghasilanKotor()*12)-(getBebanTanggungan()*12));
        double totalPajakPPh = 0;
        if(isSudahMenikah()){
            setPenghasilanTidakKenaPajak( (getPenghasilanTidakKenaPajak() + 4.5));
        }


        if (getAnak() > 0) {
            if (getAnak() >3){
                setAnak(3);
            }
            setPenghasilanTidakKenaPajak((getPenghasilanTidakKenaPajak() + (getAnak()*4.5)));
        }

        setPenghasilanKenaPajak((getPenghasilanBersih() - getPenghasilanTidakKenaPajak()));//PKP
        if (getPenghasilanKenaPajak() < 0){
            setPenghasilanKenaPajak(0);
        }

        if(getPenghasilanKenaPajak() <= 60){
            totalPajakPPh = (getPenghasilanKenaPajak()*0.05);
        } else if (getPenghasilanKenaPajak() <= 250) {
            totalPajakPPh = (getPenghasilanKenaPajak()*0.15);
        } else if (getPenghasilanKenaPajak() <= 500) {
            totalPajakPPh = (getPenghasilanKenaPajak()*0.25);
        }else if (getPenghasilanKenaPajak() <= 5000) {
            totalPajakPPh = (getPenghasilanKenaPajak()*0.25);
        }else if (getPenghasilanKenaPajak() > 5000) {
            totalPajakPPh = (getPenghasilanKenaPajak()*0.25);
        }else{
            System.out.println("Terjadi kesalahan.");
        }
        if (totalPajakPPh < 0 ){
            setTotalPajakPPh(0);
        }else{
            setTotalPajakPPh(totalPajakPPh);
        }

    }

    /**
     * Persentase p ph int.
     *
     * @return Mengembalikan persentase PPh
     */
    public int persentasePPh(){
        int persentase = 0;
        if(getPenghasilanKenaPajak() <= 60){
            persentase = 5;
        } else if (getPenghasilanKenaPajak() <= 250) {
            persentase = 15;
        } else if (getPenghasilanKenaPajak() <= 500) {
            persentase = 25;
        }else if (getPenghasilanKenaPajak() <= 5000) {
            persentase = 30;
        }else if (getPenghasilanKenaPajak() > 5000) {
            persentase = 35;
        }else{
            System.out.println("Terjadi kesalahan");
        }
        return persentase;
    }


    /**
     * Display PPh dan semua kalkulasinya
     */
    public void DisplayPPh(){
        pajakPPh();
        System.out.println("Gaji Perbulan : " + getPenghasilanKotor() +" Juta");
        System.out.println("Tanggungan Perbulan : " + getBebanTanggungan() +" Juta");
        System.out.println("Gaji Pertahun : " + (getPenghasilanKotor()*12) +" Juta");
        System.out.println("Tanggungan Pertahun : " + (getBebanTanggungan()*12) +" Juta");
        System.out.println("Penghasilan bersih : "+(getPenghasilanKotor()*12)+" Juta"+" - "+ (getBebanTanggungan()*12)+" Juta"+ " = " +getPenghasilanBersih()+" Juta");
        if(isSudahMenikah()){
            if (getAnak() > 0){
                System.out.println("Penghasilan tidak kena pajak(PTKP) : Sudah menikah dan "+ getAnak() +" Anak ="+ getPenghasilanTidakKenaPajak()+" Juta");
            }else{
                System.out.println("Penghasilan tidak kena pajak(PTKP) : Sudah menikah = "+ getPenghasilanTidakKenaPajak()+" Juta");
            }

        }else {
            if (getAnak() > 0){
                System.out.println("Penghasilan tidak kena pajak(PTKP) : Belum menikah dan "+ getAnak() +" Anak = "+ getPenghasilanTidakKenaPajak()+" Juta");
            }else{
                System.out.println("Penghasilan tidak kena pajak(PTKP) : Belum menikah = "+ getPenghasilanTidakKenaPajak()+" Juta");
            }
        }

        System.out.println("Penghasilan kena pajak (PKP) : " +getPenghasilanBersih()+" Juta" +" - "+ getPenghasilanTidakKenaPajak()+" Juta" + " = " +getPenghasilanKenaPajak()+" Juta");
        System.out.println("Tarif PPh : " + persentasePPh());
        System.out.println("Pajak PPh : " + getTotalPajakPPh()+ " Juta");

        if(getTotalPajakPPh()>0){
            System.out.println("\nTotal pajak yang harus dibayarkan adalah Rp. " +getTotalPajakPPh());
        }else{
            System.out.println("\nKamu tidak punya pajak yang harus dibayarkan");
        }

    }

    /**
     * mendapatkan Penghasilan Kotor
     *
     * @return Penghasilan Kotor
     */
    public double getPenghasilanKotor() {
        return penghasilanKotor;
    }

    /**
     * mengisi Penghasilan Kotor
     *
     * @param penghasilanKotor Penghasilan Kotor
     */
    public void setPenghasilanKotor(double penghasilanKotor) {
        this.penghasilanKotor = penghasilanKotor;
    }

    /**
     * Mendapatkan Beban Tanggungan
     *
     * @return BebanTanggungan beban tanggungan
     */
    public double getBebanTanggungan() {
        return bebanTanggungan;
    }

    /**
     * mengisi Beban Tanggungan
     *
     * @param bebanTanggungan BebanTanggungan
     */
    public void setBebanTanggungan(double bebanTanggungan) {
        this.bebanTanggungan = bebanTanggungan;
    }

    /**
     * Mendapatkan status nikah
     *
     * @return status nikah
     */
    public boolean isSudahMenikah() {
        return sudahMenikah;
    }

    /**
     * Mengisi status nikah
     *
     * @param sudahMenikah boolean untuk mengetahui apakah sudah menikah atau belum
     */
    public void setSudahMenikah(boolean sudahMenikah) {
        this.sudahMenikah = sudahMenikah;
    }

    /**
     * Mendapatkan banyak anak
     *
     * @return banyak anak yang dimiliki
     */
    public int getAnak() {
        return anak;
    }

    /**
     * Mengisi banyak anak yang dimiliki
     *
     * @param anak Jumlah anak/tanggungan yang dimiliki (0 misalkan tidak punya)
     */
    public void setAnak(int anak) {
        this.anak = anak;
    }

    /**
     * Gets penghasilan bersih.
     *
     * @return the penghasilan bersih
     */
    public double getPenghasilanBersih() {
        return penghasilanBersih;
    }

    /**
     * Sets penghasilan bersih.
     *
     * @param penghasilanBersih the penghasilan bersih
     */
    public void setPenghasilanBersih(double penghasilanBersih) {
        this.penghasilanBersih = penghasilanBersih;
    }

    /**
     * Gets penghasilan tidak kena pajak.
     *
     * @return the penghasilan tidak kena pajak
     */
    public double getPenghasilanTidakKenaPajak() {
        return penghasilanTidakKenaPajak;
    }

    /**
     * Sets penghasilan tidak kena pajak.
     *
     * @param penghasilanTidakKenaPajak the penghasilan tidak kena pajak
     */
    public void setPenghasilanTidakKenaPajak(double penghasilanTidakKenaPajak) {
        this.penghasilanTidakKenaPajak = penghasilanTidakKenaPajak;
    }

    /**
     * Gets penghasilan kena pajak.
     *
     * @return the penghasilan kena pajak
     */
    public double getPenghasilanKenaPajak() {
        return penghasilanKenaPajak;
    }

    /**
     * Sets penghasilan kena pajak.
     *
     * @param penghasilanKenaPajak the penghasilan kena pajak
     */
    public void setPenghasilanKenaPajak(double penghasilanKenaPajak) {
        this.penghasilanKenaPajak = penghasilanKenaPajak;
    }

    /**
     * Gets total pajak p ph.
     *
     * @return the total pajak p ph
     */
    public double getTotalPajakPPh() {
        return totalPajakPPh;
    }

    /**
     * Sets total pajak p ph.
     *
     * @param totalPajakPPh the total pajak p ph
     */
    public void setTotalPajakPPh(double totalPajakPPh) {
        this.totalPajakPPh = totalPajakPPh;
    }
}
