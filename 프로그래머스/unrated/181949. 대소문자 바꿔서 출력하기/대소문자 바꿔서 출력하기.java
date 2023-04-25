import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String result = "";
        
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            
            if(Character.isLowerCase(c))
            {
                result += Character.toUpperCase(c);
            }
            else{
                result += Character.toLowerCase(c);
            }
        }
        
        System.out.println(result);
    }
}