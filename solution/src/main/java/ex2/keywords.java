package ex2;

import java.util.ArrayList;

public class keywords {
    public static boolean keywordsCheck(String words){
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("abstract");
        keywords.add("boolean");
        keywords.add("break");
        keywords.add("byte");
        keywords.add("cas");
        keywords.add("cath");
        keywords.add("char");
        keywords.add("continue");
        keywords.add("default");
        keywords.add("do");
        keywords.add("double");
        keywords.add("else");

        for (String i : words.split("\\s+")){
            for (String x : keywords){
                if (i.equals(x)){
                    return true;
                }
            }
        }
        return false;
    }
}
