package out.serializer;

public interface TreeSerializer {
    // serialize will take the root of a binary tree and serialize it into an int[]
    public int[] serialize(Node root);
}
