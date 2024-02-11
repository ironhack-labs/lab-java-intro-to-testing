package ex1;

import java.util.ArrayList;

public class lab {

    public static ArrayList<Integer> ar(int n){
        ArrayList<Integer> numers = new ArrayList<>(n);

        for (int i = 0; i<n; i++){
            if(i%2==0){
                numers.add(i);
            }
        }
        return numers;
    }
}
