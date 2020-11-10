import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String language=scanner.next();
        boolean lang1= true;
        boolean lang2= false;
        char biggi=language.charAt(0);
        if(biggi=='J'){
            System.out.print(lang1);
        }
        else {
            System.out.print(lang2);
        }
    }
}
