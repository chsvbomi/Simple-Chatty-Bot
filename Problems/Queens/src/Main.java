import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        if(Math.abs(y2 - y1) /Math.abs(x2 - x1)==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}