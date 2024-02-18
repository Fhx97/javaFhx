package com.fengxiaoshuai.genericity;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    private ListUtil(){}
    public static<E> void addAll(ArrayList<E> list,E e){
        list.add(e);
    }
}
