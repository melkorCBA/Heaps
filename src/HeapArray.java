public class HeapArray {

    Node[] heap;
    int nElements = 0;

    public HeapArray(int max) {
        heap = new Node[max];
    }

    public int trickleDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int maxIndex = index;

        if (heap[leftChild] != null && heap[rightChild] != null) {
            if (heap[leftChild].key > heap[rightChild].key) {
                maxIndex = leftChild;
            } else {
                maxIndex = rightChild;
            }
        }
        else if(heap[leftChild]!=null){

        }
        else if(heap[r])


    }
}