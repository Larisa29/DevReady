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

        Node root1 = new Node(10);
        root1.left = new Node(5);
        root1.left.left = new Node(2);
        root1.left.left.left = new Node(1);
        root1.right = new Node(20);
        root1.right.right = new Node(30);
        root1.right.right.right = new Node(40);

        TreeSerializer serializer = new MyTreeSerializer();
        int[] serializedBTree = serializer.serialize(root);
        System.out.println(Arrays.toString(serializedBTree));

        serializedBTree = serializer.serialize(root1);
        System.out.println(Arrays.toString(serializedBTree));
    }
}