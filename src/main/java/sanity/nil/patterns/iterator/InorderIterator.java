package sanity.nil.patterns.iterator;

import java.util.Iterator;
import java.util.Stack;

public class InorderIterator<T> implements Iterator<T> {
    private Stack<BinaryTreeNode<T>> stack = new Stack<>();

    public InorderIterator(BinaryTreeNode<T> root) {
        pushLeftNodes(root);
    }

    private void pushLeftNodes(BinaryTreeNode<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the tree.");
        }
        BinaryTreeNode<T> currentNode = stack.pop();
        T result = currentNode.getData();

        if (currentNode.getRight() != null) {
            pushLeftNodes(currentNode.getRight());
        }

        return result;
    }
}
