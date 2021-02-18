package com.company;

import org.junit.jupiter.api.Assertions;

import static com.company.AList1.*;
import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

class AList1Test {

    int [] array = {8,9,1,3,4};
    IList collection = new AList1(array);

    @org.junit.jupiter.api.Test
    void clear() {
        collection.print();
        collection.clear();
        collection.print();
    }

    @org.junit.jupiter.api.Test
    void size() {
        collection.print();
        System.out.println(collection.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        collection.print();
        System.out.println(collection.get(3));
    }

    @org.junit.jupiter.api.Test
    void add() {
        collection.print();
        collection.add(7);
        collection.print();
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        collection.print();
        collection.add(3,6);
        collection.print();
    }

    @org.junit.jupiter.api.Test
    void remove() {
        collection.print();
        collection.remove(8);
        collection.print();

    }

    @org.junit.jupiter.api.Test
    void removeByIndex() {
        collection.print();
        collection.removeByIndex(2);
        collection.print();
    }

    @org.junit.jupiter.api.Test
    void contains() {
        collection.print();
        System.out.println(collection.contains(2));
        System.out.println(collection.contains(3));
    }

    @org.junit.jupiter.api.Test
    void set() {
        collection.print();
        collection.set(2,9);
        collection.print();
    }

    @org.junit.jupiter.api.Test
    void print() {
        collection.print();
    }


    @org.junit.jupiter.api.Test
    void removeAll() {
        collection.print();
        collection.removeAll(array);
        collection.print();
    }
}