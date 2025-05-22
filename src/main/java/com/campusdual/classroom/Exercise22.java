package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> list = new ArrayList<>();
        list.add("GKFFD");
        list.add("TNANA");
        list.add("MPMSL");
        list.add("PSWME");
        list.add("LZMLF");
        list.add("JYEBV");
        list.add("YELNT");
        list.add("JSNKR");
        list.add("JFESF");
        list.add("TMJLL");

        return list;
    }

    public static void printElementsAndIndex(List<String> customList) {
        int index = 0;
        for (String element : customList) {
            System.out.println("Element: " + element + ", Index: " + index);
            index++;
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> customList = createArrayList();
        addElementToList(customList, "AAAAA");
        printElementsAndIndex(customList);
    }


}
