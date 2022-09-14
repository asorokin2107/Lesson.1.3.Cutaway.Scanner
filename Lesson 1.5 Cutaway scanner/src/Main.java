import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner nameinput = new Scanner(System.in);
        Scanner skypeinput = new Scanner(System.in);

        System.out.println("Name: ");
        String name = nameinput.next();
        System.out.println("Skype: ");
        String skype = skypeinput.next();
        System.out.print("****************************\n");
        System.out.print("****\tВизитка\t        ****\n");
        System.out.print("****\tИмя:" + name +"    ****\n");
        System.out.print("****\tSkype:" + skype +"   ****\n");
        System.out.print("****************************");

    }

}
