package out.serializer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        TreeSerializer serializer = new MyTreeSerializer();
        int[] serializedBTree = serializer.serialize(root);
        System.out.println(Arrays.toString(serializedBTree));
    }
}