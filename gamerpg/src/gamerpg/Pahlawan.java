package gamerpg;

class Pahlawan extends Karakter {
    public int exp;
    public int expLevelSelanjutnya;
    public int expKill;
    public int expHit;
    public String tipe;
    public long waktu;
    public int skor;
    

    public Pahlawan(String tipe, String nama, int tingkat, int maxHp, int serangan) {
        super(nama, tingkat, maxHp, serangan);
        this.tipe = tipe;
        this.exp = 0;
        this.expLevelSelanjutnya = 100;
        this.expKill = expKill;
        this.expHit = expHit;
        this.skor=skor;
    }

    public Pahlawan(int skorHit, int skorKill, long waktu)
    {
        super (skorHit, skorKill);
        this.waktu=waktu;
    }
    
    public int hitungSkor(int skor , long waktu)
    {
        return skor - ((int)waktu/2) ;
    }

    public void dapatkanExp(int expKill, int expHit) {
        exp = exp + expKill;
        exp = exp + expHit;
        while (exp >= expLevelSelanjutnya && tingkat < 8) {
            naikTingkat();
        }
    }

    public void naikTingkat() {
        if (tingkat < 8) {
            tingkat++;
            expLevelSelanjutnya = tingkat * 150;
            System.out.println(nama + " naik tingkat ke level " + tingkat + "!");
            updateStatus();
        } else if (tingkat == 7) {
            System.out.println(nama + " sudah mencapai level maksimal!");
            updateStatus();
        }
    }

    private void updateStatus() {
        switch (tingkat) {
            case 1:
                serangan = 10;
                maxHp = 50;
                break;
            case 2:
                serangan = serangan + 20;
                maxHp = maxHp + 100;
                break;
            case 3:
                serangan = serangan + 30;
                maxHp = maxHp + 200;
                break;
            case 4:
                serangan = serangan + 50;
                maxHp = maxHp + 300;
                break;
            case 5:
                serangan = serangan + 90;
                maxHp = maxHp + 600;
                break;
            case 6:
                serangan = serangan + 190;
                maxHp = maxHp + 1200;
                break;
            case 7:
                serangan = serangan + 260;
                maxHp = maxHp + 1800;
                break;
            case 8:
                serangan = serangan + 340;
                maxHp = maxHp + 2900;
                break;
        }
        hpSaatIni = maxHp;
    }
    

    public int getExp() {
        return exp;
    }

    public int getExpLevelSelanjutnya() {
        return expLevelSelanjutnya;
    }

    public int getExpKill()
    {
        return expKill;
    }

    public int getExpHit()
    {
        return expHit;
    }

    public int getSkor()
    {
        return skor;
    }
}