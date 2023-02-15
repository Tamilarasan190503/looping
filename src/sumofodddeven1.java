import java.util.Scanner;

public class sumofodddeven1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int  digit,odd=0,even=0;
        long num = s.nextLong();
        while(num>0){
            digit=(int)(num%10);
            if(digit%2==0){
                even=even+digit;
            }
            else{
                odd=odd+digit;
            }
            num=num/10;
        }
        System.out.print(odd+" "+even);
    }
}
