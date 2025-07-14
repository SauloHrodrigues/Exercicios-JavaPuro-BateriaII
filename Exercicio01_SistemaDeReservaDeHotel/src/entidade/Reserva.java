package entidade;

import exceptions.QuartoInexistenteException;
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
        try {
            validaReserva();
            quarto.liberar();
            status = false;
        } catch (ReservaInexistenteException e){
            System.out.println("ERRO! "+e.getMessage());
        }
    }
    public Double calcularValorTotal(){
        try {
            validaReserva();
        } catch (ReservaInexistenteException e){
            System.out.println("ERRO! "+ e.getMessage());
        }
        return this.quarto.getTipo().getValorDaDiaria() * this.dias;
    }

    public Quarto getQuarto() {
       try {
           validaReserva();
           validaQuarto();
       }
       catch (ReservaInexistenteException e){
           System.out.println("ERRO! "+ e.getMessage());
       }

       catch (QuartoInexistenteException e){
           System.out.println("ERRO! "+ e.getMessage());
       }

       return quarto;
    }

    public void mostrarReserva(){
        try {
            validaReserva();
            System.out.println();
            System.out.println("Hospede: "+this.hospede.getNome());
            System.out.println("Quarto: nº. "+this.quarto.getNumero()+" - "
                    +this.quarto.getTipo());
            System.out.println("Quantidade de dias: "+this.dias);
            System.out.printf("Valor da diaria: R$ %.2f%n", this.quarto.getTipo().getValorDaDiaria());
            System.out.printf("Total a pagar: R$ %.2f%n", calcularValorTotal());
            System.out.println("****************************************");
        }
        catch (ReservaInexistenteException e){
            System.out.println("ERRO! "+e.getMessage());
        }
    }

    private void validaReserva(){
        if(!status){
            throw new RuntimeException("Reserva inexistente.");
        }
    }
     private void validaQuarto(){
        if (quarto== null){
            throw new QuartoInexistenteException("Quarto inexistente!");
        }
     }
}
