import java.util.Scanner;

class oddecho{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        
        String[] save=new String[n];
        
        for(int i=0;i<n;i++){
            save[i] = scan.nextLine();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(save[i]);
            }
        }
        
    }
}