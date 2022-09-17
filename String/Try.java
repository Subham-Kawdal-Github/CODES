public class Try {
    public static void main(String[] args) {
        int n = 
        String number = Integer.toString(n);
        char[] num = number.toCharArray();
        int len = num.length;
        int i = len-1;
        while(i>0){
            if(num[i] > num[i-1]) break;
            i--;
        }
        if(i==0) return -1;//////////////////////////////
        int j = i-1;
        i = len-1;
        while(i>j){
            if(num[j] < num[i]){
                char temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                break;
            }
            i--;
        }
        StringBuilder ans_str = new StringBuilder();
        for(i=0;i<=j;i++) ans_str.append(num[i]);
        for(i=len-1;i>j;i--) ans_str.append(num[i]);
        
        long ans = Long.parseLong(ans_str.toString());
        
        if(ans > Integer.MAX_VALUE) return -1;
        return (int)ans;//////////////////////////////////////////////////
    }
}
