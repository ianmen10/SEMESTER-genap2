public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();

        Mahasiswa14 mhs1 = new Mahasiswa14("244160121", "Ali", "A", 3.57);
        Mahasiswa14 mhs2 = new Mahasiswa14("244160185", "Candra", "C", 3.41);
        Mahasiswa14 mhs3 = new Mahasiswa14("244160221", "Badar", "B", 3.75);
        Mahasiswa14 mhs4 = new Mahasiswa14("244160220", "Dewi", "B", 3.35);

        Mahasiswa14 mhs5 = new Mahasiswa14("244160131", "Devi", "A", 3.48);
        Mahasiswa14 mhs6 = new Mahasiswa14("244160205", "Ehsan", "D", 3.61);
        Mahasiswa14 mhs7 = new Mahasiswa14("244160170", "Fizi", "B", 3.86);

        Mahasiswa14[] dataMahasiswas = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7,
        null, null, null };
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa:");
        
        bta.traverseInOrder(0);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        // Tampilkan hasil traversal
        System.out.println("\nInorder Traversal Mahasiswa:");
        bta.traverseInOrder(0);

        System.out.println("\nPreorder Traversal Mahasiswa:");
        bta.traversePreOrder(0);

    }
}