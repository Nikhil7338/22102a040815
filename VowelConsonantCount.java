import java.util.*;
class c14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char Vowel[]={'a','e','i','o','u','A','E','I','O','U'};
        int vc=0;
        int x=str.length();
        for(int i=0;i<x;i++){
            char ch=str.charAt(i);
            for(int j=0;j<Vowel.length;j++){
                if(ch==Vowel[j]){
                    vc++;
                }
            }
        }
        int d=x-vc;
        System.out.print(vc+" "+d);
    }
}
