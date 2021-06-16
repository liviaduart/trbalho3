public class Quadrados implements formasInterface {

    public double lado;

    public Quadrados(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return (lado * lado);
    }

    @Override
    public double calculaPerimetro() {
        return 4 * (lado);
    }
}
