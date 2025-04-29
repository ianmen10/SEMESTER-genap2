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
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
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
    public String KonversidesimalKeBiner(int desimal) {
        String biner = "";
        while (desimal > 0) {
            int sisa = desimal % 2;
            biner = sisa + biner;
            desimal = desimal / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop()
        }
        return biner;
    }

    Mahasiswa14 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

}
