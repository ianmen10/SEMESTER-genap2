public class DoubleLinkedLists14 {
    Node14 head;
    int size;

    public DoubleLinkedLists14() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node14(null, item, null);
        } else {
            Node14 newNode = new Node14(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node14 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node14 newNode = new Node14(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node14 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node14 newNode = new Node14(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node14 newNode = new Node14(current.prev, item, current);
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node14 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            removeFirst();
            return;
        }
        Node14 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
            return;
        }
    
        Node14 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
    
        if (current.next == null) {
            current.prev.next = null;
        } else if (current.prev == null) {
            current = current.next;
            current.prev = null;
            head = current;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node14 current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }        
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked list kosong atau indeks di luar batas");
        }
        Node14 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    
}
