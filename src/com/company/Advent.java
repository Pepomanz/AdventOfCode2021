package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Advent {
    public long day1(String input){
        String[] inputList = input.split("\n");
        List<Boolean> compareList = new ArrayList<>();
        int i = 1;
        while (i < inputList.length){
            if(i > 0){
                int prevValue = Integer.parseInt(inputList[i -1]);
                int nextValue = Integer.parseInt(inputList[i]);
                int result = nextValue - prevValue;
                if(result > 0){
                    compareList.add(true);
                } else {
                    compareList.add(false);
                }
            }
            i++;
        }
        long countIncreaseValue = compareList.stream().filter(x -> x == true).count();
        return countIncreaseValue;
    }

    public long day1WithExtra(String input){
        List<Integer> inputList = Arrays.stream(input.split("\n")).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        List<Integer> dataList = new ArrayList<>();
        List<Boolean> compareList = new ArrayList<>();

        for(int i=0; i< inputList.size() -2 ; i++){
            int total = inputList.get(i) +  inputList.get(i+1) +  inputList.get(i+2);
            dataList.add(total);
        }

        int i = 1;
        while (i < dataList.size()){
            if(i > 0){
                int prevValue = dataList.get(i -1);
                int nextValue = dataList.get(i);
                int result = nextValue - prevValue;
                if(result > 0){
                    compareList.add(true);
                } else {
                    compareList.add(false);
                }
            }
            i++;
        }
        return compareList.stream().filter(x -> x == true).count();
    }
}
