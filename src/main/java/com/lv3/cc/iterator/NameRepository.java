package com.lv3.cc.iterator;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class NameRepository implements Container {

    private String[] names = {"Robert", "John", "Julie", "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {
            return index < names.length;
        }

        public Object next() {
            return hasNext() ? names[index++] : null;
        }
    }
}
