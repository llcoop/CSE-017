
/**
 * @author Logan Cooper
 * @version 4/18/2017
 */
public class Expressions {
        
    /**
     * @param args the arguements
     */
    public static void main(String[] args)
    {
        BinaryTree<String> a = new BinaryTree<String>("A");
        BinaryTree<String> b = new BinaryTree<String>("B");
        BinaryTree<String> c = new BinaryTree<String>("C");
        BinaryTree<String> d = new BinaryTree<String>("D");
        BinaryTree<String> e = new BinaryTree<String>("E");
        BinaryTree<String> addition = new BinaryTree<String>("+", c, d);
        BinaryTree<String> division = new BinaryTree<String>("/", addition, e);
        BinaryTree<String> subtraction = new BinaryTree<String>("-", a, b);
        BinaryTree<String> operation = 
                new BinaryTree<String>("*", subtraction, division);
        System.out.println(operation.toInOrderString());
        System.out.println(operation.toPreOrderString());
        System.out.println(operation.toPostOrderString());
    }

}