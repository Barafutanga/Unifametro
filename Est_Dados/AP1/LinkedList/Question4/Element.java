package AP1.LinkedList.Question4;
public class Element<TYPE> {
    private TYPE value;
    private Element<TYPE> next;
    private Element<TYPE> previous;

    public Element(TYPE newValue) {
        this.value = newValue;
    }

    public TYPE getValue() {
        return value;
    }
    public void setValue(TYPE value) {
        this.value = value;
    }

    public Element<TYPE> getNext() {
        return next;
    }
    public void setNext(Element<TYPE> next) {
        this.next = next;
    }

    public Element<TYPE> getPrevious() {
        return previous;
    }
    public void setPrevious(Element<TYPE> previous) {
        this.previous = previous;
    }
    
}
