import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int first_input = s.nextInt();
        int second_input = s.nextInt();
        if(first_input<0){
            if(second_input<0){
                System.out.println(3);
            }else{
                System.out.println(2);
            }
        }else{
            if(second_input<0){
                System.out.println(4);
            }else{
                System.out.println(1);
            }
        }
    }
}