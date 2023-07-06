import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperaçãoBinaria binario = new OperaçãoBinaria(8, 4);
        //OperaçãoBinaria binario2 = new OperaçãoBinaria(5, 0);

        float a = binario.divisão();
        System.out.println("Divisão:"+a);
        //float b = binario2.divisão();
        //System.out.println("Divisão:"+b);

        System.out.println("Coloque os 2 atributos para serem divididos: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        OperaçãoBinaria binario3 = new OperaçãoBinaria(c, d);
        int div = binario3.divisão();
        System.out.println("Divisão:"+div);
    }
}
