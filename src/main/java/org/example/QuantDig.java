package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuantDig {

    public int calculo(String digito) {
        int sum = 0;
        List<String> myList = new ArrayList<>(Arrays.asList(digito.split("")));
        for(String x : myList) {
            sum += Integer.parseInt(x);
        }
        return sum;
    }

    public int comprimento(String digito){
        List<String> myList = new ArrayList<>(Arrays.asList(digito.split("")));
        int lenght = myList.size();
        return lenght;
    }
}
