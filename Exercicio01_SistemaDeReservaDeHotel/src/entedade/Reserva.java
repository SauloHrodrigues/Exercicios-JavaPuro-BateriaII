package entedade;

import exceptions.ReservaInexistenteException;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private int dias;
    private boolean status;

    public Reserva(Hospede hospede, Quarto quarto, int dias) {
        quarto.ocuparQuarto();
        status = true;
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
    }

    public void cancelar(){
        if(status){
            quarto.liberar();
            status= false;
        }  else {
            throw new RuntimeException("Não há reserva a ser cancelada");
        }
    }
    public Double calcularValorTotal(){
        if(status){
            return this.quarto.getTipo().getValorDaDiaria() * this.dias;
        }  else {
            throw new RuntimeException("Não há reserva a ser calculada");
        }
    }

    public Quarto getQuarto() {
        if(status){
            return quarto;
        }else{
            throw new RuntimeException("Não há quarto a ser mostrado.");
        }
    }

    public void mostrarReserva(){
        if(status){
            System.out.println();
            System.out.println("Hospede: "+this.hospede.getNome());
            System.out.println("Quarto: nº. "+this.quarto.getNumero()+" - "
                    +this.quarto.getTipo());
            System.out.println("Quantidade de dias: "+this.dias);
            System.out.printf("Valor da diaria: R$ %.2f%n", this.quarto.getTipo().getValorDaDiaria());
            System.out.printf("Total a pagar: R$ %.2f%n", calcularValorTotal());
            System.out.println("****************************************");
        }else{
            throw new ReservaInexistenteException("Não há reserva a ser mostrada.");
        }
    }
}
