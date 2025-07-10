import entidade.ListaDeTarefas;
import entidade.Tarefa;
import enuns.Prioridade;

public class Exercicio04_SistemaDeGestaoDeTarefasComPrioridade {
    public static void main(String[] args) {

        Tarefa lavarLouca = new Tarefa("Lavar louça", "Lavar a louça do almoço", Prioridade.BAIXA);
        Tarefa lavarCarro = new Tarefa ("Lavar o Carro","Lavar o Carro",Prioridade.BAIXA);
        Tarefa limparCasa = new Tarefa("Limpar a casa","todo sabado deve limpar a casa",Prioridade.MEDIA);
        Tarefa entregarExercicios= new Tarefa("Etregar os exercicios","Etregar os exercicios para Samara",Prioridade.ALTA);
        Tarefa darBanhoNoCachorro = new Tarefa("Dar banho no cachorro","Dar banho no cachorro",Prioridade.BAIXA);

        ListaDeTarefas  tarefas = new ListaDeTarefas();
        tarefas.adicionarTarefa(lavarLouca);
        tarefas.adicionarTarefa(lavarCarro);
        tarefas.adicionarTarefa(limparCasa);
        tarefas.adicionarTarefa(entregarExercicios);
        tarefas.adicionarTarefa(darBanhoNoCachorro);


//        tarefas.exibirListaDetarefas();

        System.out.println("Tarefas por prioridade:");
        for (Tarefa t: tarefas.ListarTrarefasPorPrioridades()) {
            System.out.println(t);
        }
//        System.out.println("Lista ordenada");
//        for(Tarefa i: tarefas.ListarTrarefasPorPrioridades()){
//            System.out.println(i);
//        }

//        lavarLouca.concluir();
//        System.out.println("Listar Pendentes");
//        for (Tarefa t: tarefas.listarTarefasPendentes()){
//            System.out.println(t);
//            System.out.println();
//        }
    }
}
