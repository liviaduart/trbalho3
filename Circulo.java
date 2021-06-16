public class Circulo implements formasInterface {

    public double raio;

    public Circulo() {
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return (raio * raio) * (Math.PI);
    }

    @Override
    public double calculaPerimetro() {
        return (2 * (Math.PI)) * (raio);
    }
}
