package JavaFirstClass;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Ovi");
        ls.add("Bishajit");
        ls.add("Sarkar");

        for (String str : ls) {
            System.out.println(str);
        }
    }
}
