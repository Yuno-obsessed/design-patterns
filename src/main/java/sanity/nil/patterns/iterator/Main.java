package sanity.nil.patterns.iterator;

public class Main {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);

        InorderIterator<Integer> iterator = new InorderIterator<>(root);

        System.out.println("Inorder Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        PreorderIterator<Integer> preorderIterator = new PreorderIterator<>(root);

        System.out.println("Preorder Traversal:");
        while (preorderIterator.hasNext()) {
            System.out.println(preorderIterator.next());
        }
    }
}
