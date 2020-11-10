import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//если бы я был тобой, я бы слился тоже, на твоём бы месте мэн, я бы слился тоже
        int counter=0;
        while (scanner.hasNextInt()){
            counter++;
            if (scanner.nextInt()==0){
                System.out.println(counter-1);
                break;
            }
        }


    }
}