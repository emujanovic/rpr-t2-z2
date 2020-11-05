package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetnaTacka;
    private double krajnjaTacka;
    private boolean pripadaPocetna;
    private boolean pripadaKrajnja;

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pripadaPocetna, boolean pripadaKrajnja) throws IllegalArgumentException {
        if (pocetnaTacka > krajnjaTacka) {
            throw new IllegalArgumentException("Neispravne pocetna i krajnja tacka");
        }
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pripadaPocetna = pripadaPocetna;
        this.pripadaKrajnja = pripadaKrajnja;
    }

    public Interval() {
        this.pocetnaTacka = 0;
        this.krajnjaTacka = 0;
        this.pripadaPocetna = false;
        this.pripadaKrajnja = false;
    }

    public boolean isNull() {
        return !(this.pripadaPocetna && this.pripadaKrajnja && this.pocetnaTacka == 0 && this.krajnjaTacka == 0);
    }

    public boolean isIn(double tacka) {
        if (this.pripadaPocetna && this.pripadaKrajnja) {
            if (tacka >= this.pocetnaTacka && tacka <= this.krajnjaTacka) return true;
        }
        if (this.pripadaPocetna && !this.pripadaKrajnja) {
            if (tacka >= this.pocetnaTacka && tacka < this.krajnjaTacka) return true;
        }
        if (!this.pripadaPocetna && this.pripadaKrajnja) {
            if (tacka > this.pocetnaTacka && tacka <= this.krajnjaTacka) return true;
        }
        if (!this.pripadaPocetna && !this.pripadaKrajnja) {
            if (tacka > this.pocetnaTacka && tacka < this.krajnjaTacka) return true;
        }

        return false;
    }


}
