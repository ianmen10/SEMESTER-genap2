package casemethod;

public class NodeKendaraan {
    Kendaraan data;
    NodeKendaraan next;

    NodeKendaraan(Kendaraan data, NodeKendaraan next){
        this.data=data;
        this.next=next;
    }

    void tampil() {
        System.out.println("Plat Nomor: " + data.platNo);
        System.out.println("Tipe: " + data.tipe);
        System.out.println("Merk: " + data.merk);
    }
}
