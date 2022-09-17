import java.util.ArrayList;
import java.util.List;

public class DistantPalindromes {

    // public class AllPalindromeSubstringsPossible {
        public static List<String> allPalindromeSubstring(String s)
        {
            
            List<String> list = new ArrayList<String>();
     
            // moving the pivot from starting till end of the string
            for (float pivot = 0; pivot < s.length(); pivot += .5) {
     
                // set radius to the first nearest element
                // on left and right
                float palindromeRadius = pivot - (int)pivot;
     
                // if the position needs to be compared has an element
                // and the characters at left and right matches
                while ((pivot + palindromeRadius) < s.length()
                       && (pivot - palindromeRadius) >= 0
                       && s.charAt((int)(pivot - palindromeRadius))
                              == s.charAt((int)(pivot + palindromeRadius))) {
     
                    list.add(s.substring((int)(pivot - palindromeRadius),
                                         (int)(pivot + palindromeRadius + 1)));
     
                    // increasing the radius by 1 to point to the
                    // next elements in left and right
                    palindromeRadius++;
                }
            }
     
            int max =0;
            for(int i=0; i<list.size(); i++){
                for(int j=i+1; j<list.size(); j++){
                    
                }
            }
        }
     
        // Drivers code
        public static void main(String[] args)
        {
            List<String> list = allPalindromeSubstring("hellolle");
            System.out.println(list.size());
            System.out.println(list);
            list = allPalindromeSubstring("geeksforgeeks");
            System.out.println(list.size());
            System.out.println(list);
        }
}
