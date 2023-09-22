import java.util.Scanner;

class heimavinna{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] sp = input.split(";");
        int result =0;
        
        for(String i:sp){
            if(i.contains("-")){
                int temp1 = i.indexOf("-");
                int temp2 = Integer.parseInt(i.substring(0,temp1));
                int temp3 = Integer.parseInt(i.substring(temp1+1));
                result+=temp3-temp2;
            }
        }
        result+=sp.length;
        System.out.print(result);
    }
}