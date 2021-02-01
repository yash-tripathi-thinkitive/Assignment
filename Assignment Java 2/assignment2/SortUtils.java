package com.thinkitive.day9.assignment2;


import java.util.Collections;
import java.util.List;

public class SortUtils {
public static void sortByName(List list) {
	Collections.sort(list,new CompareBooksByName());
}
public static void sortByPrice(List list) {
	Collections.sort(list , new CompareBooksByPrice());
}

}
