package DSA.BinaryHeap.BinaryHeapImplementation;

public class BinaryHeapBestMin extends BinaryHeapAbstract{
  BinaryHeapBestMin(int x) {
    super(x);
  }

  @Override
  boolean isBetter(int parentIdx) {
    int index = 2 * parentIdx + 1;
    if (index <= size()){
      return true;
    }
    return getNode(parentIdx).value > getNode(index).value;
  }

  boolean isBetter(int leftIndex, int rightIndex) {
    return getNode(leftIndex).value < getNode(rightIndex).value;
  }
}
