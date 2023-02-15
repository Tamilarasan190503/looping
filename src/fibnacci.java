import java.util.Scanner;

public class fibnacci {
    public static void main(String[] main){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first=0;
        int second =1;
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            int total=first+second;
            first=second;
            second=total;

        }
    }
}
