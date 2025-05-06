public class AntrianKRS14 {
    int max, size, front, rear;
    MahasiswaKRS14[] data;

    public AntrianKRS14(int kapasitas) {
        max = kapasitas;
        data = new MahasiswaKRS14[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(MahasiswaKRS14 m) {
        if (isFull()) {
            System.out.println("Antrian KRS penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = m;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian KRS.");
    }

    public MahasiswaKRS14 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong!");
            return null;
        }
        MahasiswaKRS14 m = data[front];
        for (int i = front; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return m;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        for (int i = front; i <= rear; i++) {
            System.out.println("Antrian ke-" + (i - front + 1));
            data[i].tampilkanData();
            System.out.println("----------");
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public void lihatTerdepan() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa pada antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihatTerbelakang() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa pada antrian terakhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
}

