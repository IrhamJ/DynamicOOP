import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import siswavsisor.*;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;
import java.util.Queue;


public class app {
    public static void main(String[] args) throws IOException,InterruptedException {
        try{

        Scanner sc = new Scanner(System.in);
        ArrayList<mahasiswa> listMahasiswa = new ArrayList();
        ArrayList<supervisor> listSupervisor = new ArrayList();
        int i;
        int j;

        System.out.printf("Masukkan jumlah Mahasiswa : ");
        j = sc.nextInt();
        mahasiswa mhs[] = new mahasiswa[j];
        supervisor dos[] = new supervisor[j];
        final String[] name=new String[j];
        final Double[] Nim=new Double[j];
        final int[] age = new int[j];
        int surs=1;
        System.out.println();
        for (i=0;i<j;i++){
            System.out.printf("Masukkan Nama Mahasiswa ke "+surs+" : ");
            name[i] = sc.next();
            System.out.printf("Masukkan NIM : ");
            Nim[i] = sc.nextDouble();
            System.out.printf("Masukkan Umur : ");
            age[i] = sc.nextInt();
            System.out.println();
            mhs[i]=new mahasiswa(name[i],Nim[i], age[i]);
            listMahasiswa.add(mhs[i]);
            surs++;
        }

        System.out.println();
        System.out.println("Masukkan Data Supervisor");
        System.out.println();
        final String[] named=new String[j];
        final Double[] Nimd=new Double[j];
        final int[] aged = new int[j];
        surs = 1;
        for (i=0;i<j;i++){
            System.out.printf("Masukkan Nama Dosen ke "+ surs + ": ");
            named[i] = sc.next();
            System.out.printf("Masukkan NIP Dosen : ");
            Nimd[i] = sc.nextDouble();
            System.out.printf("Masukkan Umur Dosen : ");
            aged[i] = sc.nextInt();
            System.out.println();
            dos[i]=new supervisor(named[i],Nimd[i], aged[i]);
            listSupervisor.add(dos[i]);
            surs++;
        }

        Iterator<mahasiswa> mahasiswaiterationpp = listMahasiswa.iterator();
        LinkedList<Double> listnim = new LinkedList<Double>();
        int ppg=0;
        while (mahasiswaiterationpp.hasNext()){
            listnim.add(listMahasiswa.get(ppg).NIM);
            mahasiswaiterationpp.next();
            ppg++;
        }
        Iterator<Double> iterasinim = listnim.iterator();

        Iterator<mahasiswa> mahasiswaiteration = listMahasiswa.iterator();
        LinkedList<String> listmatkul = new LinkedList<String>();
        int xd=0;
        while (mahasiswaiteration.hasNext()){
            listmatkul.add(listMahasiswa.get(xd).Nama);
            mahasiswaiteration.next();
            xd++;
        }

        Iterator<String> iterasimahasiswa = listmatkul.iterator();

        Iterator<supervisor> iterasisupervisor = listSupervisor.iterator();
        LinkedList<String> listdosen = new LinkedList<String>();
        int xdd=0;
        while (iterasisupervisor.hasNext()){
            listdosen.add(listSupervisor.get(xdd).Nama);
            iterasisupervisor.next();
            xdd++;
        }
        Iterator<String> iterasisupervisor2 = listdosen.iterator();

        int dx=0;

        Queue<Double> urutan = new PriorityBlockingQueue<Double>();
        while (iterasinim.hasNext()){
            urutan.add(listMahasiswa.get(dx).NIM);
            iterasinim.next();
            dx++;
        }

        Iterator<supervisor> iterasiumur = listSupervisor.iterator();
        int exd=0;
        Queue<Integer> usiadosen = new PriorityBlockingQueue<Integer>();
        while (iterasiumur.hasNext()){
            usiadosen.add(listSupervisor.get(exd).umur);
            iterasiumur.next();
            exd++;
        }

        int p=1;
        int d=0;
        while (iterasimahasiswa.hasNext()){
            System.out.println("Nama mahasiswa ke "+p+" "+iterasimahasiswa.next() );
            System.out.println("Dengan NIM : "+urutan.peek());
            System.out.println("Dengan Umur : "+listMahasiswa.get(d).umur);
            System.out.println();
            urutan.poll();
            p++;
            d++;
        }
        System.out.println("");
        int x=1;
        int dd=0;
        while (iterasisupervisor2.hasNext()){
            System.out.println("Nama Dosen ke "+x+" "+iterasisupervisor2.next() );
            System.out.println("NIP Dosen : "+ listSupervisor.get(dd).NIP);
            System.out.println("Usia Dosen : "+usiadosen.peek());
            System.out.println();
            usiadosen.poll();
            x++;
            dd++;
        }

        System.out.println();
        HashMap<String, String> hashin = new HashMap<String , String>();
        int xddd =0;
        Iterator<supervisor> supervisoriteration = listSupervisor.iterator();
        while (supervisoriteration.hasNext()){
            hashin.put(listMahasiswa.get(xddd).Nama,listSupervisor.get(xddd).Nama);
            supervisoriteration.next();
            xddd++;
        }
        int xdddd=0;
        Iterator<mahasiswa> printiteration = listMahasiswa.iterator();
        while (printiteration.hasNext()){
            System.out.println("Mahasiswa : "+listMahasiswa.get(xdddd).Nama+ "\nDosen pembimbing adalah : "+hashin.get(listMahasiswa.get(xdddd).Nama));
            System.out.println();
            printiteration.next();
            xdddd++;
        }
        }
        catch (InputMismatchException ex){
            System.out.println("Format Input Salah");
            System.out.println("Harap Masukkan Input yang Benar");
        }
        finally {
            System.out.println("Terimakasih Telah Menggunakan Aplikasi");
        }
    }
}
