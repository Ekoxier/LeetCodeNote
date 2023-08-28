import java.util.ArrayList;
import java.util.List;

public class MaxHeap<T extends Comparable<T>> {
    private List<T> data;

    public MaxHeap() {
        this.data = new ArrayList<>();
    }

    private int getSize() {
        return this.data.size();
    }

    private int findParent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index - 0 does't have parent.");
        }
        return (index - 1) / 2;
    }

    private int findLeftChild(int index) {
        return 2 * index + 1;
    }

    private int findRightChild(int index) {
        return 2 * index + 2;
    }

    private void shiftUp() {
        int i = this.getSize() - 1;
        while(i > 0 && data.get(findParent(i)).compareTo(data.get(i)) < 0) {
            this.swap(findParent(i),i);
            i = findParent(i);
        }
    }

    private void shiftDown() {
        int i = 0;
        while(findLeftChild(i) <= this.getSize() - 1) {
            if (data.get(findLeftChild(i)).compareTo(data.get(i)) > 0){
                this.swap(findLeftChild(i),i);
                i = findLeftChild(i);
                continue;
            }
            if (data.get(findRightChild(i)).compareTo(data.get(i)) > 0){
                this.swap(findRightChild(i),i);
                i = findRightChild(i);
                continue;
            }
            break;
        }
    }

    public void add(T element) {
        this.data.add(element);
        this.shiftUp();
    }

    private void swap(int i, int j) {
        T tmp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, tmp);
    }

    public T pop() {
        this.swap(0,this.getSize() -1);
        T res = this.data.remove(this.getSize() - 1);
        this.shiftDown();
        return res;
    }
}
