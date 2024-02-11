package ex2;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class keywordsTest {

    private final static ArrayList<String> keywords = new ArrayList<String>();

    @BeforeAll
    static void init(){

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
    }

    private boolean check(String words){
        for (String i : words.split("\\s+")){
            for (String x : keywords){
                if (i.equals(x)){
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    void keyCheck(){
        assertTrue(check("I do my homework"), String.valueOf(true));
        assertFalse(check("I don´t my homework"), String.valueOf(true));
    }


}
