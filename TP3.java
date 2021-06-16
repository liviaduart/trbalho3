import java.util.Scanner;

public class TP3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura e o lado do retangulo");
        double alturaRetangulo = sc.nextDouble();
        double baseRetangulo = sc.nextDouble();
        System.out.println("A altura e base do retangulo são respectivamente: " + alturaRetangulo + " " + baseRetangulo);

        System.out.println("Digite o lado do quadrado");
        double ladoQuadrado = sc.nextDouble();
        System.out.println("O lado do quadrado é: " + ladoQuadrado);

        System.out.println("Digite o raio do circulo");
        double raioCirculo = sc.nextDouble();
        System.out.println("O raio do circulo é: " + raioCirculo);

        Retangulos retangulo1 = new Retangulos(baseRetangulo, alturaRetangulo);
        Quadrados quadrado1 = new Quadrados(ladoQuadrado);
        Circulo circulo1 = new Circulo(raioCirculo);

        System.out.println("O perimetro do retangulo, quadrado e circulo são respectivamente: " + retangulo1.calculaPerimetro() + " " + quadrado1.calculaPerimetro() + " " + circulo1.calculaPerimetro());

        System.out.println("A área do retangulo, quadrado e circulo são respectivamente:" + retangulo1.calculaArea() + " " + quadrado1.calculaArea() + " " + circulo1.calculaArea());

    }

}
