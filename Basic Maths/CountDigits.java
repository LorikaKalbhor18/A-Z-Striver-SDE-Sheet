//Link : https://practice.geeksforgeeks.org/problems/count-digits5716/1

import java.io.*;
import java.util.*;

class Solution{
    static int evenlyDivides(int N){
        int temp = N;
        int count = 0;
        while(temp>0){
            int r = temp%10;
            if(r>0 && N%r == 0){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
