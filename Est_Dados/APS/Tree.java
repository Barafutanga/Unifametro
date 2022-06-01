package APS;

public class Tree {
    public static void main(String[] args) {
        TreeSeedling<Integer> tree = new TreeSeedling<>(); //create a tree from TreeSeedling
        tree.add(10); //first value insertion is root
        tree.add(5); //second value insertion is node
    }
}
