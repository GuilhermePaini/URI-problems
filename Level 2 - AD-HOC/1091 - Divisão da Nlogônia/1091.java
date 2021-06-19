import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int aux = scanner.nextInt();
        
        while(aux != 0){
            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();
            
            for(int i = 0; i < aux; i++){
                 int corX = scanner.nextInt();
                int corY = scanner.nextInt();

                if(corX == pointX || corY == pointY)
                    System.out.println("divisa");
                else if(corX > pointX && corY > pointY)
                    System.out.println("NE");
                else if(corX > pointX && corY < pointY)
                    System.out.println("SE");
                else if(corX < pointX && corY > pointY) 
                    System.out.println("NO");
                else System.out.println("SO");
            }
            
            aux = scanner.nextInt();
        }
    }
}
