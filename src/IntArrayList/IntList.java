package IntArrayList;

public interface IntList {

    void add(int element);                      // done!

    boolean add(int index, int element);       // NO done

    void clear();                        // done!

    int get(int index);                       // done!

    boolean isEmpty();                       // done!

    boolean remove(int index);                       // done!

    boolean removeByValue(int value);                       // NO done

    boolean set(int index, int element);                                    // done!

    int size();                                                              // done!

    IntList subList(int fromIndex, int toIndex);                       // NO done

    int[] toArray();                                                 // NO done
}
