import java.time.LocalDate;
import java.util.List;

public class Trabalhar_Collection {
    public static void main(String[] args) {

            Collection collection = new Collection();

            /*Criar tarefas*/
            collection.criarTarefaUnica("Fazer TPC-5 de POO", LocalDate.now());
            collection.criarTarefaMensal("Teste de POO", LocalDate.of(2023, 4, 28));
            collection.criarTarefaUnica("Teste de Probabilidade", LocalDate.of(2023, 5,5 ));
            collection.criarTarefaDiaria("Teste de Sistemas e Sinais", LocalDate.of(2023, 5, 6));

            /*Listar a tarefa recente*/
            List<Tarefa> tarefasHoje = collection.listarTarefas(LocalDate.now());
            System.out.println("Tarefas_now:");

            for (Tarefa tarefa : tarefasHoje) {
                System.out.println("- " + tarefa.getDescricao());
            }

            /*Modificar uma tarefa*/
            collection.modificarTarefa(3, "Estudar Matemática Discreta", LocalDate.of(2023, 4, 27));

            /* Listar todas as tarefas*/
            List<Tarefa> todasTarefas = collection.listarTarefas(LocalDate.MIN);
            System.out.println("Todas as tarefas:");

            for (Tarefa tarefa : todasTarefas) {
                System.out.println("- " + tarefa.getDescricao() + " (" + tarefa.getClass().getSimpleName() + ")");
            }

          

            /*Apagar tarefa*/
            collection.apagarTarefa(0);

        }
    }
