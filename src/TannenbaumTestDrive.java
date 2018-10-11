import java.util.Scanner;

public class TannenbaumTestDrive {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
       // int userInputWidth = scanner.nextInt();
        int userInputSize = scanner.nextInt();
        scanner.close();

        Tannenbaum xmastree = new Tannenbaum();
        xmastree.size = userInputSize;
       // xmastree.width = userInputWidth;
        xmastree.zeichnen();
    }
}
