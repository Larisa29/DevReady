package out.serializer;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        if(value< 0){
            throw new IllegalArgumentException("The tree cannot contain values smaller than 0");
        }
        this.value = value;
        left = null;
        right = null;
    }
}