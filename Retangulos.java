public class Retangulos implements formasInterface {

    public double base;
    public double altura;

    public Retangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base * altura);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (base + altura);
    }
}
