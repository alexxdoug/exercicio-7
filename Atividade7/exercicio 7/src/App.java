import java.util.Scanner;
public class app {
    public static void main(string[] args) throws Exception {
        double lado, area;
        Scanner S =new scanner(system.in);

        System.out.println("digite o valor da lateral ao quadrado");
        lado = S.nextDouble();

        area= lado*lado;

        System.out.println("o dobro da area do quadrado é de" +(area*2));

    }
}

