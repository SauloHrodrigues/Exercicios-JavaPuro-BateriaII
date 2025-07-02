import entidades.Agenda;
import entidades.Contato;

public class AgendaDeContatosComBusca {
    public static void main(String[] args) {

        Contato saulo = new Contato("Saulo02 henrique rodrigues","(99) 707070-70");
        Agenda agenda = new Agenda(saulo);

        agenda.bucarContatoPeloPrimeiroNome("saulo");
        agenda.bucarContatoPorSobreNome("vieira");
//        agenda.listaDeContatos();


    }
}
