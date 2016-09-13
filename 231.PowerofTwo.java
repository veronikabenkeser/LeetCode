public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n==Integer.MIN_VALUE){
            return false;
        }
        
        int count=0;
        
        while(n !=0 ){
            n=n&n-1;
            count+=1;
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
