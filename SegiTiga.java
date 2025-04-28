
public class SegiTiga extends BangunDatar {
    double alas, tinggi, sisi1, sisi2, sisi3;

    public SegiTiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        super("SegiTiga", alas, tinggi, sisi1, sisi2, sisi3);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public String getJenisSegiTiga() {
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            return "Segitiga Sama Sisi";
        } else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
            return "Segitiga Sama Kaki";
        } else {
            return "Segitiga Sembarang";
        }
    }

    public void infoBangunDatar() {
        System.out.println("===========================================");
        System.out.println("Jenis Bangun Datar: " + super.getjenisBangunDatar());
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("Sisi 3: " + sisi3);
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Jenis Segitiga: " + getJenisSegiTiga());
        System.out.println("===========================================");
    }
}