import java.util.Scanner;
public class hello {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name");
        System.out.println("hello "+ input.next());
        input.close();
    }
}