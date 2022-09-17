package Array;

import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(56);
        num.push(9);
        num.push(00);
        num.push(100);

        int len = num.size();
        for (int i = 0; i < len; i++) {
            System.out.println(num.peek());
        }
    }
}
