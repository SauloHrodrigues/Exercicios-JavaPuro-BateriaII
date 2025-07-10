package entidade;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeTarefas {
    List<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> ListarTrarefasPorPrioridades(){
        List<Tarefa> listaOrdenada = tarefas;
       listaOrdenada.sort(Comparator.comparing(Tarefa::getPrioridade).reversed());
       return listaOrdenada;
    }

    public List<Tarefa> listarTarefasPendentes(){
        return tarefas.stream()
                .filter(t -> !t.isConcluida())
                .collect(Collectors.toList());
    }

    public void exibirListaDetarefas(){
        for (Tarefa t : tarefas){
            System.out.println(t);
        }
    }
}
