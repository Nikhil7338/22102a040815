import java.util.*;
class SplCharacterRemoval{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Character> s=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                System.out.print(ch);
            }
        }
    }
}
