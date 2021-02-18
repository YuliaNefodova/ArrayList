package com.company;

public class AList1 implements IList {

    public static int[] array;
    private final static int DEFAULT_CAPACITY = 10;
    private int capacityStart = DEFAULT_CAPACITY;
    private int size;


    public AList1() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public AList1(int[] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            size++;
        }
    }

    public AList1(int capacity) {
        if (capacity < 0) {
            System.out.println(" capacity < 0");
        }
        this.array = new int[capacity];
    }

    @Override
    public void clear() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public boolean add(int value) {
        if (capacityStart >= array.length) {
            int oldCapacity = array.length;
            if (capacityStart >= oldCapacity){
                int newCapacity = (oldCapacity * 3) / 2 + 1;
                int[] newArray = new int[newCapacity];
                for (int i = 0; i < oldCapacity; i ++){
                    newArray[i] = array[i];
                }
                array = newArray;
            }
        } else {
            array[capacityStart++] = value;
        }
        return true;
    }

    @Override
    public boolean add(int index, int value) {
       array[index] = value;
        return true;
    }

    @Override
    public int remove(int number) {
       int result = 0;
       for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                result = removeByIndex(i);
            }
        }
        return result;
    }

    @Override
    public int removeByIndex(int index) {
        //isIndexSuitable(index);
        int result = array[index];
        if (size == 1) {
            size--;
            array = new int[capacityStart];
            return result;
        }
        size--;
        for (int count = index; count < size; count++) {
            array[count] = array[count + 1];
        }
        return result;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, int value) {
        array[index] = value;
        return true;
    }

    @Override
    public void print() {
        String result = "[ ";
        for (int i = 0; i < size; i++) {
            if ( i == size - 1){
                result += array[i];
            }
            else {
                result += array[i] + ", ";
            }
        }
        result += " ]";
        System.out.println(result);
    }


    @Override
    public int[] toArray() {
        int[] toArray = new int[size];
        for (int i = 0; i < size; i++) {
            toArray[i] = array[i];
        }
        return toArray;
    }

    @Override
    public boolean removeAll(int[] ar) {
        for (int i : ar){
            if (contains(i)){
                remove(i);
            }
        }
        return true;
    }
}
