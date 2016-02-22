import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum1 = 0; int sum2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j){
                    sum1+= a[a_i][a_j];
                    if(a_i == 1){
                        sum2 += a[a_i][a_j];
                    }
                }
                else if((a_i == 0 && a_j ==2) || (a_i ==2 && a_j==0)){
                    sum2 += a[a_i][a_j];
                }
            }
        }

        System.out.println(Math.abs(sum1-sum2));
    }
}