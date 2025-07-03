import entidade.ListaDeTarefas;
import entidade.Tarefa;
import enuns.Prioridade;

public class Exercicio04_SistemaDeGestaoDeTarefasComPrioridade {
    public static void main(String[] args) {

        Tarefa lavarLouca = new Tarefa("Lavar louça", "Lavar a louça do almoço", Prioridade.BAIXA);
        ListaDeTarefas  tarefas = new ListaDeTarefas(lavarLouca);
        tarefas.adicionarTarefa("Lavar o Carro","Lavar o Carro",Prioridade.BAIXA);

        tarefas.adicionarTarefa("Limpar a casa","todo sabado deve limpar a casa",Prioridade.MEDIA);
        tarefas.adicionarTarefa("Etregar os exercicios","Etregar os exercicios para Samara",Prioridade.ALTA);
        tarefas.adicionarTarefa("Limpar a casa","todo sabado deve limpar a casa",Prioridade.MEDIA);
        tarefas.adicionarTarefa("Dar banho no cachorro","Dar banho no cachorro",Prioridade.BAIXA);

//        tarefas.exibirListaDetarefas();

//        System.out.println("Lista ordenada");
//        for(Tarefa i: tarefas.ListarTrarefasPorPrioridades()){
//            System.out.println(i);
//        }

        lavarLouca.concluir();
        System.out.println("Listar Pendentes");
        for (Tarefa t: tarefas.listarTarefasPendentes()){
            System.out.println(t);
            System.out.println();
        }
    }
}
