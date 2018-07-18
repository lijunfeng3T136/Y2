package com.sz.bean;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class BookTwo {
    private String[] name;
    private Set<book> names;
    private Map<String,book>bookMap;

    public Map<String, book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, book> bookMap) {
        this.bookMap = bookMap;
    }

    public Set<book> getNames() {
        return names;
    }

    public void setNames(Set<book> names) {
        this.names = names;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookTwo{" +
                "name=" + Arrays.toString(name) +
                '}';
    }
}
