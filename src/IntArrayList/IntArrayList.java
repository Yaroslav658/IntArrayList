package IntArrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class IntArrayList implements IntList {
    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public void add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }


    @Override
    public boolean add(int index, int element) {
        try {
            int newSize = size + 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = element;
            for (int i = newSize - 1; i > index; i--) {
                newArr[i] = arr[i - 1];
            }
            size = size + 1;
            arr = newArr;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index. Need to be from 0 to " + size);
            return false;
        }
    }

    @Override
    public void clear() {
        for (int i = size; i > 0; i--) {
            remove(size - 1);
        }

    }

    @Override
    public int get(int index) {
        try {
            return arr[index];
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Wrong index. Need to be from 0 to " + size);
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        } else return true;
    }

    @Override
    public boolean remove(int index) {
        try {
            int newSize = size - 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            for (int i = newSize - 1; i >= index; i--) {
                newArr[i] = arr[i + 1];
            }
            size = size - 1;
            arr = newArr;
            return true;
        } catch (NegativeArraySizeException exception) {
            System.out.println("Is empty.");
            return false;

        }

    }

    @Override
    public boolean removeByValue(int value) {
        int True = 0;
        try {
            for (int i = 0; i < size; i++) {
                if (value == arr[i]) {
                    remove(i);
                    True = 1;
                }
            }
            if (True == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Exception");
            return false;
        }
    }

    @Override
    public boolean set(int index, int element) {
        try {
            arr[index] = element;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index. Need to be from 0 to " + size);
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        int q = toIndex - fromIndex+100;
        int[] newArr = new int[q];
        for(int i = fromIndex; i<toIndex; i++){
            System.out.println(arr[i]);

            newArr[i-fromIndex]=arr[i];

            System.out.println(newArr[i-fromIndex]);
        }


        return null;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }


}
