import java.util.*;
public class uppercasecount {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int count=0;
        String s = b.nextLine();
        char y;
        for(int i=0;i<s.length();i++){
            y=s.charAt(i);
            if(Character.isUpperCase(y)){
                count++;

            }


        }
        System.out.print(count);

    }
}