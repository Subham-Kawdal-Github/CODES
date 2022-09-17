import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        //////////////// -----------------Set Interface

        int count[] = { 22, 23, 43, 53, 22, 65 };
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < count.length; i++) {
            set.add(count[i]);
        }
        System.out.println(set);

        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
        System.out.println(sortedSet);

    }
}
