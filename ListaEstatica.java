public class ListaEstatica {
    private int[] elementos;
    private int tamanho;

    public ListaEstatica(int cap) {
        elementos = new int[cap];
        tamanho = 0;
    }

    public void clear() {
        tamanho = 0;
    } 

    public void add(int elementos) {
        if(isFull()){
            throw new IndexOutOfBoundsException("lista cheinha dá nao aqui🤣");
        } else {
            this.elementos[tamanho] = elementos;
            tamanho++;
        }
    }

    public int remove(int pos) {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("essa lista ta sem nada vei🤣");
        } else {
            int elementoRetirado = elementos[pos];
            for(int i = pos; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
            return elementoRetirado;

        }
    }

    public void setData(int elementos, int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("posicao invalida, tenta a sorte🤣");
        } else {
            this.elementos[pos] = elementos;
        }
    }

    public int getData(int pos) {
        if(pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("posicao invalida, tenta a sorte🤣");
        }
        return elementos[pos];
    }

    public int find(int elementos) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i] == elementos) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return tamanho == elementos.length;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("lista está vazia 🤣");
        } else {
            System.out.print("elementos da lista 🤣: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }        
}
