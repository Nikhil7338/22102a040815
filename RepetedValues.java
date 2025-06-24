import java.util.*;
class RepetedValues{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=arr[i];
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key:map.keySet()){
            int x=map.get(key);
            if(x>1){
                System.out.print(key+" ");
            }
        }
    }
}
