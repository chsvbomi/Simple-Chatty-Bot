import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//если бы я был тобой, я бы слился тоже, на твоём бы месте мэн, я бы слился тоже
        int sum=0;
        int num=scanner.nextInt();
        while (num != 0) {
            sum += num;
            num = scanner.nextInt();
        }
        if(num==0){
            System.out.println(sum);
        }
    }
    }
