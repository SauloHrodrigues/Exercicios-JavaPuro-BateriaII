import entidade.Hospede;
import entidade.Quarto;
import entidade.Reserva;
import enuns.TipoDeQuarto;

public class SistemaDeReservaDeHotelPRG {
    public static void main(String[] args) {

        Hospede hospede = new Hospede("Saulo", "222.333.444-55");
        Quarto quartoSimples = new Quarto(1, TipoDeQuarto.SIMPLES);
        Quarto quartoDuplo = new Quarto(2, TipoDeQuarto.DUPLO);
        Quarto quartoDeLuxo = new Quarto(3, TipoDeQuarto.LUXO);

        Reserva reserva01 = new Reserva(hospede, quartoSimples, 10);
        Reserva reserva02 = new Reserva(hospede, quartoDuplo, 10);
        Reserva reserva03 = new Reserva(hospede, quartoDeLuxo, 10);

        reserva01.mostrarReserva();
        reserva02.mostrarReserva();
        reserva03.mostrarReserva();

//        reserva01.cancelar();
        reserva01.mostrarReserva();


    }
}
