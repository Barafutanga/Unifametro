package APS;

public class TreeSeedling<TYPE extends Comparable> {
    private Element<TYPE> root;

    public TreeSeedling() {
        this.root = null;
    }

    public void add(TYPE value) { //element inserction tree
        Element<TYPE> newElement = new Element<TYPE>(value); //create current element to be added
        if (root == null) { //insert current element into the root space
            this.root = newElement;
        } else {
            Element<TYPE> actual = this.root; //actual is related to values injection, comparing new values to give them a direction (left or right)
            while (true) {
                if (newElement.getValue().compareTo(actual.getValue()) == -1) { //if newElement is lesser than actual
                    if (actual.getLeft() != null) { //looking for another comparisson
                        actual = actual.getLeft();
                    } else {
                        actual.setLeft(newElement); //newElement is now a tree node
                        break;
                    }
                } else { //if newElement is greater os equals to actual
                    if (actual.getRight() != null) { //looking for another comparisson
                        actual = actual.getRight();
                    } else {
                        actual.setRight(newElement); //newElement is now a tree node
                        break;
                    }
                }
            }
        }
    }
}
