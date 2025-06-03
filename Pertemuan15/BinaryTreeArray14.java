public class BinaryTreeArray14 {
    Mahasiswa14[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray14() {
        this.dataMahasiswa = new Mahasiswa14[10];

        this.idxLast = -1;
    }

    void populateData(Mahasiswa14 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampil();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }


    // TUGAS SOAL NO 4
    void add(Mahasiswa14 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Array penuh, tidak dapat menambahkan data.");
        } else {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampil();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

}