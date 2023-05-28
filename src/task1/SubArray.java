package task1;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A [] = new int[N];
        for(int i= 0;i<N;i++){
            A[i]= sc.nextInt();
        }
        int sum = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0;i<N;i++){
            sum = 0;
            for(int j = i;j<N;j++){
                sum = sum+A[j];
                if(sum<0){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
