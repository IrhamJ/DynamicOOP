package siswavsisor;

public class supervisor {

    public String Nama;

    public double NIP;

    public int umur;

    public supervisor(String Nama, double NIP, int umur){

        this.Nama = Nama;
        this.NIP = NIP;
        this.umur = umur;
    }

    public void display(){
        System.out.println(
                        "Nama Supervisor : "
                        + this.Nama +  "NIP Supervisor : "
                        + this.NIP +
                        "Umur Supervisor : "
                        + this.umur
        );
    }

}
