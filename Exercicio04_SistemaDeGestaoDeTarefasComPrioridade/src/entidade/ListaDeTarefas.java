package entidade;

import exception.TarefaConcluidaException;
import exception.TarefaInexistenteException;
import exception.TarefaJaExistenteException;
import exception.TarefaNaoConcluidaException;
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
        validarTarefaNaoCadastrada(tarefa);
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

    public Tarefa exibirTarefa(String nomeDatarefa){
        Tarefa tarefaEncontrada= tarefas.stream()
                .filter(tarefa -> tarefa.getTitulo().equalsIgnoreCase(nomeDatarefa))
                .findFirst().get();
        return tarefaEncontrada;
    }

    public void exibirListaDetarefas(){
        for (Tarefa t : tarefas){
            System.out.println(t);
        }
    }

    private void validarTarefaCadastrada(Tarefa tarefa){
        if (!tarefas.contains(tarefa)){
            throw new TarefaInexistenteException("Essa tarefa não esta cadastrada.");
        }
    }
    private void validarTarefaNaoCadastrada(Tarefa tarefa){
        if (tarefas.contains(tarefa)){
            throw new TarefaJaExistenteException("Essa tarefa já esta cadastrada.");
        }
    }

    private void tarefaNaoConluida(Tarefa tarefa){
        if(!tarefa.isConcluida()){
            throw new TarefaNaoConcluidaException("Essa tarefa não está concluida.");
        }
    }
    private void tarefaConluida(Tarefa tarefa){
        if(tarefa.isConcluida()){
            throw new TarefaConcluidaException("Essa tarefa já está concluida.");
        }
    }
}
