package AP1.LinkedList.Question4;

public class LinkedList<TYPE> {
    private Element<TYPE> first;
    private Element<TYPE> last;
    private int size;
    
    public LinkedList() {
        this.size = 0;
    }
    
    public Element<TYPE> getFirst() {
        return first;
    }
    public void setFirst(Element<TYPE> first) {
        this.first = first;
    }
    
    public Element<TYPE> getLast() {
        return last;
    }
    public void setLast(Element<TYPE> last) {
        this.last = last;
    }
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    public void add(TYPE newValue) {
        Element<TYPE> newElement = new Element<TYPE>(newValue);
        if(this.first == null && this.last == null) {
            this.first = newElement;
            this.last = newElement;
        } else {
            this.last.setNext(newElement);
            this.last = newElement;
        }
        this.size++;
    }
    
    public void remove(Element<TYPE> searchValue) {
        Element<TYPE> past = null;
        Element<TYPE> actual = this.first;
        for(int i = 0; i < this.getSize(); i++) {
            if(actual.getValue() != null) {
                if(this.size == 1) {
                    this.first = null;
                    this.last = null;
                } else if (actual == first) {
                    this.first = actual.getNext();
                    actual.setNext(null);
                } else if (actual == last) {
                    this.last = past;
                    past.setNext(null);
                } else {
                    past.setNext(actual.getNext());
                    actual = null;
                }
                this.size--;
                break;
            }
            past = actual;
            actual = actual.getNext();
        }
    }
    
    public Element<TYPE> get(int position) {
        Element<TYPE> actual = this.first;
        for(int i = 0; i < position; i++) {
            if(actual.getNext() != null) {
                actual = actual.getNext();
            }
        }
        return actual;
    }
}
