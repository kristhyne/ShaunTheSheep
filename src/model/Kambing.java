package model;

import controller.Database;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;  

public class Kambing implements Animal {
    private Database database = new Database();
    private static int counter = 0;
    private static long hargaPasar = 80000;
    private String kode;
    private String jenis;
    private String jenis_kelamin;
    private LocalDateTime tanggalDaftar;
    private String asal;
    private int berat;
    private int usia;
    private long harga;
    private String noKamar;
    private String noKandang;
    private boolean statusTerjual;
    private boolean statusKesehatan;
    private boolean statusVaksin;
    private boolean statusMakan;

    public Kambing(LocalDateTime tanggalDaftar, String jenisKelamin, String asal, int berat, int usia) {
        this.kode = generateKode();
        this.jenis = "Kambing";
        this.jenis_kelamin = jenisKelamin;
        this.tanggalDaftar = tanggalDaftar;
        this.usia = usia + hitungUsia(tanggalDaftar);
        this.asal = asal;
        this.berat = berat;
        this.harga = hitungHarga();
        this.noKamar = null;
        this.statusTerjual = false;
        this.statusKesehatan = false;
        this.statusVaksin = false;
        this.statusMakan = false;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        System.out.println("kode            : " + this.kode);
        System.out.println("jenis           : " + this.jenis);
        System.out.println("tanggal daftar  : " + tanggalDaftarToString(tanggalDaftar));
        System.out.println("usia            : " + this.usia + " hari");
        System.out.println("berat           : " + this.berat + "kg");
        System.out.println("asal            : " + this.asal);
        System.out.println("statusTerjual   : " + this.statusTerjual);
        System.out.println("statusKesehatan : " + this.statusKesehatan);
        System.out.println("statusVaksin    : " + this.statusVaksin);
        System.out.println("statusMakan     : " + this.statusMakan);
        System.out.println();
    }

    @Override
    public int hitungUsia(LocalDateTime tanggalDaftar) {
        // TODO Auto-generated method stub
        LocalDateTime now = LocalDateTime.now();
        long months = ChronoUnit.MONTHS.between(tanggalDaftar, now);
        return (int) months;
    }
    
    public long hitungHarga(){
        long tmp = (long) this.berat * this.hargaPasar;
        return tmp;
    }

    @Override
    public String generateKode() {
        // TODO Auto-generated method stub
        counter++;
        String id = database.getIdTerbaruKambing();
        
        if (id.length() == 3) {
            id = "2" + id;
        } else {
            id = "2" + id.substring(1);
        }
        return id;
    }

    public String tanggalDaftarToString(LocalDateTime tanggalDaftar) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDateTime = tanggalDaftar.format(format);
        return formatDateTime;
    }

    /* GETTER AND SETTER */
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Kambing.counter = counter;
    }

    public static long getHargaPasar() {
        return hargaPasar;
    }

    public static void setHargaPasar(long hargaPasar) {
        Kambing.hargaPasar = hargaPasar;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public void setNoKamar(String nomor) {
        // TODO Auto-generated method stub
        this.noKamar = nomor;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public LocalDateTime getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(LocalDateTime tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getNoKamar() {
        return noKamar;
    }

    public String getNoKandang() {
        return noKandang;
    }

    public void setNoKandang(String noKandang) {
        this.noKandang = noKandang;
    }

    public boolean isStatusTerjual() {
        return statusTerjual;
    }

    public void setStatusTerjual(boolean statusTerjual) {
        this.statusTerjual = statusTerjual;
    }

    public boolean isStatusKesehatan() {
        return statusKesehatan;
    }

    public void setStatusKesehatan(boolean statusKesehatan) {
        this.statusKesehatan = statusKesehatan;
    }

    public boolean isStatusVaksin() {
        return statusVaksin;
    }

    public void setStatusVaksin(boolean statusVaksin) {
        this.statusVaksin = statusVaksin;
    }

    public boolean isStatusMakan() {
        return statusMakan;
    }

    public void setStatusMakan(boolean statusMakan) {
        this.statusMakan = statusMakan;
    }
}
