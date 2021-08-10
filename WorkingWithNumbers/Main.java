package Homework.WorkingWithNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number < 1){
                iterator.remove();
            }
        }
        Iterator<Integer> iterator1 = intList.iterator();
        while (iterator1.hasNext()){
            Integer number = iterator1.next();
            if (number % 2 != 0){
                iterator1.remove();
            }
        }
        Collections.sort(intList);
        System.out.println(intList);
    }
}
