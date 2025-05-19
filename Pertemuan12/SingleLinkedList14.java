public class SingleLinkedList14 {
    NodeMahasiswa14 head, tail;

    public SingleLinkedList14() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa14 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    public void addFirst(Mahasiswa14 input) {
        NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    public void addLast(Mahasiswa14 input) {
        NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa14 input) {
        NodeMahasiswa14 temp = head;
        do {
            if (temp.data.nim.equals(key)) {
                NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertAt(int index, Mahasiswa14 input) {
        if (index < 0) {
            System.out.println("Index tidak valid!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa14 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) break;
                temp = temp.next;
            }
            if (temp != null) {
                NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
            } else {
                System.out.println("Index melebihi ukuran list!");
            }
        }
    }
    public Mahasiswa14 getData(int index) {
        NodeMahasiswa14 temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) return null;
            temp = temp.next;
        }
        return temp != null ? temp.data : null;
    }
    
    public int indexOf(String key) {
        NodeMahasiswa14 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa14 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
    
        if (head.data.nim.equals(key)) {
            removeFirst();
            return;
        }
    
        NodeMahasiswa14 prev = head;
        NodeMahasiswa14 curr = head.next;
    
        while (curr != null) {
            if (curr.data.nim.equals(key)) {
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
                break;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa14 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null || temp.next == null) return;
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            }
        }
    }
}
