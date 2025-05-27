package casemethod;
import java.util.Scanner;
public class SPBU {
    Scanner in = new Scanner(System.in);
    NodeKendaraan head;
    NodeKendaraan tail;
    int size;
    TransaksiPengisian[] arrOfRiwayatTransaksi = new TransaksiPengisian[100];
    int idx;

    SPBU(){
        head = null;
        size = 0;
        idx = 0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void addLast(Kendaraan input){
        NodeKendaraan nodeInput=new NodeKendaraan(input, null);

        if(isEmpty()){
            head=nodeInput;
            tail=nodeInput;
        }else{
            tail.next=nodeInput;
            tail=nodeInput;
        }
        System.out.println(">> Kendaatan masuk dalam antrian.");
        size++;
    }

    int cekSize(){
        return size;
    }

    Kendaraan getFirst(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        return head.data;
    }

    void layaniKendaraan(TransaksiPengisian kendaraan)throws Exception {
        if (isEmpty()) {
            throw new Exception("Kendaraan tidak boleh null");
        }
        head = head.next; 
        kendaraan.totalBayar = kendaraan.bbm.hargaPerLt * kendaraan.liter;
        arrOfRiwayatTransaksi[idx] = new TransaksiPengisian(kendaraan.kendaraan, kendaraan.bbm, kendaraan.liter, kendaraan.totalBayar);
        idx++;
        size--;
    }

    void tampilRiwayat(){
    for (int i = 0; i < idx; i++) {
        TransaksiPengisian transaksiPengisian = arrOfRiwayatTransaksi[i];
        System.out.println(transaksiPengisian.kendaraan.platNo + " : " + transaksiPengisian.totalBayar);
    }
    }

    void TampilAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodeKendaraan current = head;
            System.out.println("Antrian Kendaraan:");
            while (current != null) {
                current.tampil();
                current = current.next;
            }
        }
    }
}
