public class LinkedList<T> {
    private LinkedListItem<T> first;

    public LinkedList() {
        this.first = null;
    }

    public LinkedListItem<T> getFirst() {
        return this.first;
    }

    public int size() {
        int result = 0;

        if (this.first != null) {
            LinkedListItem<T> current = this.first;

            do {
                result++;
                current = current.getNext();
            } while (current != null);
        }

        return result;
    }

    public void add(T value) {
        LinkedListItem<T> item = new LinkedListItem<T>(value);

        if (this.first == null) {
            this.first = item;
        } else {
            LinkedListItem<T> current = this.first;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(item);
        }
    }

    public T get(int index) {
        LinkedListItem<T> item = this.first;

        while (item != null && index > 0) {
            item = item.getNext();
            index--;
        }

        return item.getValue();
    }
}
