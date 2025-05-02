package com.ironhack.oddIntegers;

import java.util.ArrayList;
import java.util.List;

public class NListGenerator {

    private int n;
    private List<Integer> nList;

    public NListGenerator(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public List<Integer> generateOddList() {
    nList = new ArrayList<>();

        if (this.n < 0) {
            for (int i = 0; i >= this.n; i--) {
                if (i % 2 != 0) {
                    nList.add(i);
                }
            }
        } else if (this.n > 0) {
            for (int i = 0; i <= this.n; i++) {
                if (i % 2 != 0) {
                    nList.add(i);
                }
            }
        }
        return nList;
    }

}
