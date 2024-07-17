
    package gamerpg;

    public class Karakter {
        public String nama;
        public int tingkat;
        public int maxHp;
        public int hpSaatIni;
        public int serangan;
        public int skorHit;
        public int skorKill;
        public long waktu;
        
        
        public Karakter(String nama, int tingkat, int maxHp, int serangan) {
            this.nama = nama;
            this.tingkat = tingkat;
            this.maxHp = maxHp;
            this.hpSaatIni = maxHp;
            this.serangan = serangan;
        }

        public Karakter(int skorHit, int skorKill)
        {
            this.skorHit=skorHit;
            this.skorKill=skorKill;
        }

        public void terimaSerangan(int damage) {
            hpSaatIni -= damage;
            if (hpSaatIni < 0) hpSaatIni = 0;
        }

        public boolean masihHidup() {
            return hpSaatIni > 0;
            
        }

        public int getMaxHp() {
            return maxHp;
        }

        public int getTingkat() {
            return tingkat;
        }

        public int getSerangan() {
            return serangan;
        }

        public int getSkorHit()
        {
            return skorHit;
        }

        public int getSkorKill()
        {
            return skorKill;
        }
    }