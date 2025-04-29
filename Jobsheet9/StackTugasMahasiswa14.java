class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;
    int top;
    int size;

    public StackTugasMahasiswa14(int size) {
        this.size = size;
        stack = new Mahasiswa14[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push (Mahasiswa14 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa14 pop() {
        if (!isEmpty()) {
            Mahasiswa14 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    Mahasiswa14 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'konversiDesimalKeBiner'");
    }
}