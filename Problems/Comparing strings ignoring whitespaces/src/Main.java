import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String w1=scanner.nextLine();
        String w2=scanner.nextLine();
        String w3=w2.replaceAll(" ","");
        System.out.println(w3.equals("string"));

    }
}