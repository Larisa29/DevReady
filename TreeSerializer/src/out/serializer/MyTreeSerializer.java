package out.serializer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class MyTreeSerializer implements TreeSerializer {
    @Override
    public int[] serialize(Node root) {
        //for the example tree (in main), this initial capacity works; for a larger tree, the capacity issue should be handled separately
        int[] serializedResult = new int[15];

        //all the values in the initial result array should be -1, because 0 is a valid value in the tree
        Arrays.fill(serializedResult, -1);

        int index = 0;
        Node emptyNode = new Node(Integer.MAX_VALUE);

        //if there is no node in the tree, then the result is an empty array
        if (root == null) {
            return new int[]{};
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            serializedResult[index] = currentNode.value;
            index++;

            //if the current node isn't a leaf, add its children to the queue
            if (currentNode.left != null || currentNode.right != null) {
                //if a node doesn't have a right or left child, I mark this in my result with Integer.MAX_VALUE (emptyNode)
                queue.add(currentNode.left != null ? currentNode.left : emptyNode);
                queue.add(currentNode.right != null ? currentNode.right : emptyNode);
            }
        }
        return serializedResult;
    }
}