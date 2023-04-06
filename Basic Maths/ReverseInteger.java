//LINK: https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int rev=0;
        int r;
        int sign =1;
        if(x<0){
            sign = -1;
            x = sign*x;
        }
        while(x > 0){
            if(rev*sign < Integer.MIN_VALUE || rev*sign> Integer.MAX_VALUE)
                return 0;
            r=x%10;
            rev = (rev*10)+r;
            x=x/10;
        }
        
            return (int)sign*rev;
        
    }
}
