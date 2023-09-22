import java.util.Scanner;
import java.lang.Math;

public class pot {
  public static void main(String[] args) {
    int total=0;
    Scanner input=new Scanner(System.in);
    int counter=input.nextInt();
    for(int i=0;i<counter;i++){
        int val=input.nextInt();
        int temp1=val/10;
        int temp2=val%10;
        total+=Math.pow(temp1,temp2);
    }
    System.out.print(total);
  }
}