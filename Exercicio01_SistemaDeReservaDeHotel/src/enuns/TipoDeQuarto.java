package enuns;

public enum TipoDeQuarto {
    SIMPLES(100.00),
    DUPLO(150.00),
    LUXO(280.00);

    private final double preco;

    TipoDeQuarto(double diaria){
        this.preco = diaria;
    }

    public double getValorDaDiaria(){
        return this.preco;
    }
}
