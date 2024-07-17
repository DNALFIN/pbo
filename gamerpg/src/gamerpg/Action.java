package gamerpg;

abstract class Action {
    public int tingkat;
    public int serangan;
    public int maxHp;
    public int hpSaatIni;
    abstract int hitungSkor();
    abstract void dapatkanExp();
    abstract void naikTingkat();
    abstract void updateStatus();
    
}
