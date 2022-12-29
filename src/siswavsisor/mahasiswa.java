package siswavsisor;

public class mahasiswa {
    public String Nama;

    public double NIM;

    public int umur;

    public mahasiswa(String Nama, double NIM, int umur){

        this.Nama = Nama;
        this.NIM = NIM;
        this.umur = umur;
    }

    public void display(){
        System.out.println(
                "Nama Mahasiswa : "
                        + this.Nama +  "NIM Mahasiswa : "
                        + this.NIM +
                        "Umur Mahasiswa : "
                        + this.umur
        );
    }
}
