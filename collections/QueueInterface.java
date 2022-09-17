import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

        Queue<String> names = new LinkedList<String>();
        names.add("sexiboi");
        names.add("mango");
        names.add("grape");
        names.add("banana");

        System.out.println(names);
        names.remove("sexiboi");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("grape");
        System.out.println(names);
        System.out.println(names.contains("mango"));

    }
}
