import java.util.Vector;

/**
 * pairs
 */
public class pairs {

    static void func(Vector<Integer> vec, int sum) {
        for (int i = 0; i < vec.size(); i++) {
            for (int j = i + 1; j < vec.size(); j++) {
                if (vec.elementAt(i) + vec.elementAt(j) == sum) {
                    System.out.println(vec.elementAt(i) + " " + vec.elementAt(j) + " , ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(3);
        vec.add(6);
        vec.add(4);
        vec.add(3);
        vec.add(2);
        vec.add(4);
        vec.add(1);

        func(vec, 3);

    }
}