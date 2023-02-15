import java.util.*;
public class sumofevenproductofodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digit,pro=0,even=0;
        int num=sc.nextInt();
        while(num>0){
            digit=num%10;
            if(digit%2==0){
                even=even+digit;
            }
            else{
                pro=pro*digit;
            }
            num=num/10;
        }
        System.out.print("sum:"+even+"pro:"+pro);
    }
}
