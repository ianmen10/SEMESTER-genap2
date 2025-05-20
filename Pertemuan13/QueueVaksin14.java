public class QueueVaksin14 {
    Node14 head;
    int size;

    public QueueVaksin14() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(String nama) {
        if (isEmpty()) {
            head = new Node14(null, nama, null);
        } else {
            Node14 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node14 newNode = new Node14(current, nama, null);
            current.next = newNode;
        }
        size++;
        System.out.println(nama + " masuk dalam antrian vaksin");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println(head.nama + " telah selesai divaksin.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Antrian Vaksin:");
            Node14 current = head;
            while (current != null) {
                System.out.println("- " + current.nama);
                current = current.next;
            }
        }
        System.out.println("Jumlah antrian tersisa: " + size);
    }
}
