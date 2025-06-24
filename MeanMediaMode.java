import java.util.*;
class MeanMediaMode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int median=0;
        int mode=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        if(n%2==0){
            int x=n/2;
            median=(arr[x]+arr[x-1])/2;
        }
        else{
            int x=(n/2)+1;
            median=arr[x];
        }
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(max<count){
                max=count;
                mode=arr[i];
            }
        }
        if(mode<2){
            System.out.print("sum="+sum+" Mean="+ sum+" median="+median+" mode=no repeted value");
        }else{
            System.out.print("sum="+sum+" Mean="+ sum+" median="+median+" mode="+mode);
        }
    }
}
