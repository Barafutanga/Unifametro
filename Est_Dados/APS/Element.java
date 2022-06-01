package APS;
public class Element<TYPE> {
    private TYPE value;
    private Element<TYPE> left; //left tree node
    private Element<TYPE> right; //right tree node

    public Element(TYPE value) {
        this.value = value;
        //when node is created, leafs containing null values are created
        this.left = null; //leaf
        this.right = null; //leaf
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public Element<TYPE> getLeft() {
        return left;
    }

    public void setLeft(Element<TYPE> left) {
        this.left = left;
    }

    public Element<TYPE> getRight() {
        return right;
    }

    public void setRight(Element<TYPE> right) {
        this.right = right;
    }
}