import java.util.Scanner;

public class sumofoddeven {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int even =0;
        int odd =0;
        int n= s.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                even=even+i;
            }
            else{
                odd=odd+i;
            }

        }
        System.out.print(even+odd);
    }
}
