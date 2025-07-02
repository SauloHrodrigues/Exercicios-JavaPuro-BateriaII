package entedade;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private int dias;

    public Reserva(Hospede hospede, Quarto quarto, int dias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
    }

    public Double calcularValorTotal(){
        return this.quarto.getTipo().getValorDaDiaria() * this.dias;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void mostrarReserva(){
        System.out.println();
        System.out.println("Hospede: "+this.hospede.getNome());
        System.out.println("Quarto: nº. "+this.quarto.getNumero()+" - "
                +this.quarto.getTipo());
        System.out.println("Quantidade de dias: "+this.getDias());
        System.out.printf("Valor da diaria: R$ %.2f%n", this.quarto.getTipo().getValorDaDiaria());
        System.out.printf("Total a pagar: R$ %.2f%n", calcularValorTotal());
        System.out.println("****************************************");
    }
}
