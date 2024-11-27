package sanity.nil.patterns.iterator;

import java.util.Iterator;
import java.util.Stack;

public class PreorderIterator<T> implements Iterator<T> {
    private Stack<BinaryTreeNode<T>> stack = new Stack<>();

    public PreorderIterator(BinaryTreeNode<T> root) {
        if (root != null) {
            stack.push(root);
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
            stack.push(currentNode.getRight());
        }
        if (currentNode.getLeft() != null) {
            stack.push(currentNode.getLeft());
        }

        return result;
    }
}
