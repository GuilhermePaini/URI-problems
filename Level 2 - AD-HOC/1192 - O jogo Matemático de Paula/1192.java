import java.util.Scanner;

public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int aux = scanner.nextInt();
         
        for(int i = 0; i < aux; i++){

            String scan = scanner.next();
            char[] list = scan.toCharArray();

            int val1 = Integer.parseInt(String.valueOf(list[0]));
            int val2 = Integer.parseInt(String.valueOf(list[2]));

            if(val1 == val2)
                System.out.println(val1 * val2);
            else if(Character.isUpperCase(list[1]))
                System.out.println(val2 - val1);
            else if(Character.isLowerCase(list[1]))
                System.out.println(val2 + val1);
        }
    }
}
