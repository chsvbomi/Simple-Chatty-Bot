import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num=scanner.nextLine();
        char a=num.charAt(0);
        char b=num.charAt(1);
        char c=num.charAt(2);
        char d=num.charAt(3);
        if(a+b==d+c||a+b==c+d){
            System.out.println(1);
        }
        else{
            System.out.println(37);
        }
    }
}