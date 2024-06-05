package week9;

public class BangunRuang extends BangunDatar
{
    private int tinggi;

    public BangunRuang( double panjang, double lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi=tinggi;
    }

    // Konstruktor untuk inisialisasi atau memberi isi variabel sisi
    public BangunRuang(double sisi)
    {
        super(sisi);
    }

    // Volume Kubus
    public double volume(double sisi)
    {
        return super.getSisi()*super.getSisi()*super.getSisi();
    }

    // Volume Tabung

    public double volume(double a, double tinggi)
    {
        return super.getPi()*(a*a)*tinggi;
    }
}
