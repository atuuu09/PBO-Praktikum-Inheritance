public class BangunDatar {
    String jenisBangunDatar;
    double panjang;
    double sisi,sisi1,sisi2,sisi3;
    double lebar;
    double tinggi;
    double alas;
    public BangunDatar (String PersegiPanjang, double panjang, double lebar ){
        jenisBangunDatar = PersegiPanjang;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public BangunDatar(String BujurSangkar, double sisi){
        jenisBangunDatar=BujurSangkar;
        this.sisi=sisi;
    }
    public BangunDatar(String SegiTiga, double alas,double sisi1,double sisi2,double sisi3, double tinggi){
        this.alas=alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2=sisi2;
        this.sisi3=sisi3;

    }
    public void setDataBangunDatar(String jenis,double alas, double panjang, double sisi,double lebar,double tinggi,double sisi1,double sisi2, double sisi3){
        jenisBangunDatar=jenis;
        this.alas=alas;
        this.lebar=lebar;
        this.panjang=panjang;
        this.sisi=sisi;
        this.sisi1=sisi1;
        this.sisi2= sisi2;
        this.sisi3=sisi3;
        this.tinggi=tinggi;

    }
    public String getjenisBangunDatar(){
        return jenisBangunDatar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getSisi(){
        return sisi;
    }
    public double getSisi1(){
        return sisi1;
    }
    public double getSisi2(){
        return sisi2;
    }
    public double getSisi3(){
        return sisi3;
    }

}


