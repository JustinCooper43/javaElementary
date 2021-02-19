package com.streltsov.javaElementary.course.homeworks.hw9;

import java.text.MessageFormat;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

    int[] arrayNumbers = getRandomArray(5, -5, 5);

    System.out.println("Test array: "+Arrays.toString(arrayNumbers));

    checkArrFor(arrayNumbers);
    checkArrWhile(arrayNumbers);
    checkArrMap(arrayNumbers);

}

    private static void checkArrFor(int [] arr){
        System.out.println("Check array \" for \":" );

        int i,k;
        for( i = 0, k = 1 ; i < arr.length - 1 ; k++){
            if((arr[i] + arr[k]) == 7){
                System.out.println(arr[i] +","+ arr[k]);
            }
            if(k == arr.length - 1){
                i++;
                k = i;
            }
        }
    }

    private static void checkArrWhile(int [] arr){
        System.out.println("Check array \" while \":" );

        int i = 0;
        int k = arr.length - 1;
        while(i < arr.length - 1 ){
            if(k == i){
                i++;
                k = arr.length - 1;
            }
            if((arr[i] + arr[k]) == 7){
                System.out.println(arr[i] + "," + arr[k]);
            }
            k--;
        }
    }

    private static void checkArrMap(int [] arr){
        Map<Integer,Integer> mapNumbers = new HashMap<>();
        for(int var: arr){
            int key;
            if(var * (- 1) == var){
                key = 7 + var;
            }else{
                key = 7 - var;
            }
            mapNumbers.put(key,var);
        }
        removeEntry(mapNumbers,false);
        removeEntry(mapNumbers,true);

        System.out.println("Check array \" map \":" );

        for(Map.Entry<Integer,Integer> var : mapNumbers.entrySet()){
            System.out.println(MessageFormat.format("{0},{1} ",var.getKey(),var.getValue()));
        }
    }

    private static void removeEntry(Map<Integer,Integer> map, boolean mapContainsValue){

        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry2 = iterator.next();
            Integer currentKey = entry2.getKey();
            if(map.containsValue(currentKey) == mapContainsValue){
                iterator.remove();
            }
        }
    }

    private static int[] getRandomArray(int size, int fromNumb, int toNumb){

        SplittableRandom randomNumbers = new SplittableRandom();
        int[] arrayNumbers = new int[size];
        for (int i = 0; i < arrayNumbers.length ; i++) {
            arrayNumbers[i] = randomNumbers.nextInt(fromNumb, toNumb);
        }
        return arrayNumbers;
    }
}


