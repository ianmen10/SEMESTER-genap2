public class AntrianLayanan14 {
    int max, size, front, rear;
    Mahasiswa14[] data;

    public AntrianLayanan14(int n) {
        max = n;
        data = new Mahasiswa14[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa14 m) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = m;
        size++;
    }

    public Mahasiswa14 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa14 m = data[front];
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

    public void peek() {
        if (!isEmpty()) {
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Data antrian:");
        for (int i = front; i <= rear; i++) {
            data[i].tampilkanData();
            System.out.println("------");
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }
}
