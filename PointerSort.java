import java.util.*;
class c13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0;
        int b=n-1;
        for(int i=0;i<n;i++){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
            if(a>b){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
