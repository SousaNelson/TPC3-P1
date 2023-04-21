import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*Exercicio 13*/

public class Collection {

    private List<Tarefa> tarefas;

    public Collection() {
        tarefas = new ArrayList<>();
    }

    public void criarTarefaUnica(String descricao, LocalDate data) {
        TarefaUnica tarefa = new TarefaUnica(descricao, data);
        tarefas.add(tarefa);
    }

    public void criarTarefaDiaria(String descricao, LocalDate data) {
        TarefaDiaria tarefa = new TarefaDiaria(descricao, data);
        tarefas.add(tarefa);
    }

    public void criarTarefaMensal(String descricao, LocalDate data) {
        TarefaMensal tarefa = new TarefaMensal(descricao, data);
        tarefas.add(tarefa);
    }

    public void modificarTarefa(int index, String descricao, LocalDate data) {
        Tarefa tarefa = tarefas.get(index);
        tarefa.setDescricao(descricao);
        tarefa.setData(data);
    }

    public void apagarTarefa(int index) {
        tarefas.remove(index);
    }

    public List<Tarefa> listarTarefas(LocalDate data) {
        List<Tarefa> tarefasData = new ArrayList<>();
        Iterator<Tarefa> iterator = tarefas.iterator();
        //iterator serve para trabalhar com os dados da coleção

        while (iterator.hasNext()) {
            Tarefa tarefa = iterator.next();
            if (tarefa.ocorreEm(data.getYear(), data.getMonthValue(), data.getDayOfMonth())) {
                tarefasData.add(tarefa);
            }
        }
        return tarefasData;
    }

}






