class StackSurat14 {
    Surat[] stack;
    int top;
    int size;

    public StackSurat14(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}
