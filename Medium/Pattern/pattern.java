//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        //nth line has 0 gap, n-1 has 1, n-2 has 2 and so on.
        for(int i=1; i<=n; i++){
            for(int k=n-1-i; k>=0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int k=0; k<=n-1-i;k++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
