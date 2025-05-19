public class QueueLinkedList14 {
    NodeMahasiswa14 front, rear;
    int size;

    public QueueLinkedList14() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa14 data) {
        NodeMahasiswa14 newNode = new NodeMahasiswa14(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Antrian ditambahkan.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.println("Memanggil:");
            front.data.tampilInformasi();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir:");
            rear.data.tampilInformasi();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Isi antrian:");
            NodeMahasiswa14 temp = front;
            while (temp != null) {
                temp.data.tampilInformasi();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }
    public void clearQueue() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getSize() {
        return size;
    }
}
