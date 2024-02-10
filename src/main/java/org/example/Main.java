package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    // method that takes in an integer n and returns an array of all odd integers from 1 to n.
    public List<Integer> buildArrayOddInts(int n) {
        List arrayOddInts = new ArrayList();
        for (int i=0; i<n; i++) {
            if (i%2 == 0 && i!=n-1) {
                arrayOddInts.add(i+1);
            }
        }
        return arrayOddInts;
    }
}