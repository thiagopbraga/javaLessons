import java.util.Random;

public class MeuPrimeiroPrograma {
    public static void main(String[] args) {
        int x;
        Random generate = new Random();
        int i;
        for(i=0;i<6;i++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}