package weeks.week_13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Home {
    private double yuzolcumu;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajVarMi;
    private double fiyati;
    private double kiraucreti;
    private String cephesi;
    private int yapimYili;


    public Home() {
        this(0, 0, 0);
    }

    public Home(double yuzolcumu, int banyoSayisi, int odaSayisi) {
        this(yuzolcumu, banyoSayisi, odaSayisi, false, 0, 0, "", 1990);
    }

    public Home(double yuzolcumu, int banyoSayisi, int odaSayisi, boolean garajVarMi, double fiyati, double kiraucreti, String cephesi, int yapimYili) {
        this.yuzolcumu = yuzolcumu;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajVarMi = garajVarMi;
        this.fiyati = fiyati;
        this.kiraucreti = kiraucreti;
        this.cephesi = cephesi;
        this.yapimYili = yapimYili;

    }

    int yasHesapla(int yapimYili) {
        return new GregorianCalendar().get(Calendar.YEAR) - yapimYili;
    }

    public double getYuzolcumu() {
        return yuzolcumu;
    }

    public void setYuzolcumu(double yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public boolean isGarajVarMi() {
        return garajVarMi;
    }

    public void setGarajVarMi(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }


    public double getKiraucreti() {
        return kiraucreti;
    }

    public void setKiraucreti(double kiraucreti) {
        this.kiraucreti = kiraucreti;
    }

    public String getCephesi() {
        return cephesi;
    }

    public void setCephesi(String cephesi) {
        this.cephesi = cephesi;
    }

    public int getYapimYili() {
        return yapimYili;
    }

    public void setYapimYili(int yapimYili) {
        this.yapimYili = yapimYili;
    }

    public int getYasi() {
        return yasHesapla(getYapimYili());
    }

    @Deprecated
    // @see
    public String homeString() {
        return Double.toString(getYuzolcumu()) +"m^2 \n"+ Integer.toString(getBanyoSayisi()) + " adet banyo\n"
                + Integer.toString(getOdaSayisi()) + " adet oda\n"
                + ( isGarajVarMi() ? "garajı var " : "garajı yok") +"\n" + getCephesi() + " cephesi\n" + Double.toString(getFiyati()) + " TL\n"
                + Double.toString(getKiraucreti()) + " kirası \n" + Integer.toString(getYasi()) + " yaşında ";
    }

    public void display(){
        System.out.println("_____________________HOME DETAILS_________________________");
        System.out.println( this.yuzolcumu  + "m^2 \n" +
        this.banyoSayisi+  " adet banyo\n" +
        this.odaSayisi +  " adet oda\n" +
        (this.garajVarMi ? "garajı var \n" : "garajı yok\n") +
        this.fiyati + " TL\n" +
        this.kiraucreti +  "TL kira \n" +
        this.cephesi + " cephesi\n"+
        Integer.toString(getYasi()) + " yaşında " );
    }

    public void renovasyon(){
        this.fiyati = this.fiyati * 1.1 ;
        this.kiraucreti = this.kiraucreti * 1.2;
    }


}
