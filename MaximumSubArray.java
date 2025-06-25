//maximum subarray
import java.util.*;
class MaximumSubArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=i+k;
        int index=0;
        int index1=0;
        while(j<n){
            int sum=0;
            for(int b=i;b<j;b++){
                sum+=arr[b];
            }
            if(max<sum){
                max=sum;
                index=i;
                index1=j;
            }
            i++;
            j++;
        }
        for(int a=index;a<index1;a++){
            System.out.print(arr[a]+" ");
        }
        System.out.println();
        System.out.print(max);
    }
}
