import java.util.Scanner;

class different{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long temp1=sc.nextLong();
            long temp2=sc.nextLong();
            System.out.println(Math.abs(temp1-temp2));
        }
    }
}