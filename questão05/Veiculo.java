public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePaginas;
    private int capacidadeDeTanque;
    private int velocidadeMaxima;
    private float consumoMedio;

    public Veiculo(String placa, String cor, int numeroDePaginas, int capacidadeDeTanque, int velocidadeMaxima,
            float consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePaginas = numeroDePaginas;
        this.capacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getCapacidadeDeTanque() {
        return capacidadeDeTanque;
    }

    public void setCapacidadeDeTanque(int capacidadeDeTanque) {
        this.capacidadeDeTanque = capacidadeDeTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(float consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

}
