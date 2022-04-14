public class Adresse implements java.io.Serializable {
    private int num =0;
    private String adr="";

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Adresse(int num,String adr) {
        this.num = num;
        this.adr=adr;
    }
}
