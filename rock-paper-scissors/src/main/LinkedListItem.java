public class LinkedListItem<T> {
    private T value;
    private LinkedListItem<T> next;

    public LinkedListItem(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedListItem<T> getNext() {
        return this.next;
    }

    public void setNext(LinkedListItem<T> next) {
        this.next = next;
    }
}
