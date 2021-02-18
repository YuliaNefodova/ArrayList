package com.company;

public interface IList {

    void clear();
    int size();
    int get(int index);
    boolean add(int value);
    boolean add(int index, int value);
    int remove(int number);
    int removeByIndex(int index);
    boolean contains(int value);
    boolean set(int index, int value);
    void print(); //=> выводит в консоль массив в квадратных скобках и через запятую
    int[] toArray();// => приводит данные к массиву, в случае с AList ничего сложного, у нас и так массив
    boolean removeAll(int[] ar);

   /* конструкторы:
   1) по умолчанию = capacity = 10;
   2) AList(int capacity);
   3) AList(int[] array);

   Реализации:
   Alist1 хранит данные типа int
   Alist2 хранит generic
   LList1 - однонаправленный связанный список
   LList2 - двунаправленный связанный список*/

}
