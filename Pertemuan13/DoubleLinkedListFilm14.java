public class DoubleLinkedListFilm14 {
    NodeFilm14 head;
    int size;

    public void addLast(Film14 data) {
        if (head == null) {
            head = new NodeFilm14(null, data, null);
        } else {
            NodeFilm14 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm14 newNode = new NodeFilm14(current, data, null);
            current.next = newNode;
        }
        size++;
    }

    public void print() {
        NodeFilm14 current = head;
        System.out.println("DAFTAR FILM:");
        while (current != null) {
            System.out.println("ID: " + current.data.id + " | Judul: " + current.data.judul + " | Rating: " + current.data.rating);
            current = current.next;
        }
    }

    public void searchById(int id) {
        NodeFilm14 current = head;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("Ditemukan: ID: " + current.data.id + ", Judul: " + current.data.judul + ", Rating: " + current.data.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortDescending() {
        if (head == null || head.next == null) return;

        for (NodeFilm14 i = head; i != null; i = i.next) {
            NodeFilm14 max = i;
            for (NodeFilm14 j = i.next; j != null; j = j.next) {
                if (j.data.rating > max.data.rating) {
                    max = j;
                }
            }

            if (max != i) {
                Film14 temp = i.data;
                i.data = max.data;
                max.data = temp;
            }
        }
    }
}
