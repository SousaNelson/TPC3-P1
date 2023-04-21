/*Exercicio 12*/
import java.time.LocalDate;

public class TarefaDiaria extends Tarefa{
    public TarefaDiaria(String descrição, LocalDate data) {
        super(descrição, data);
    }

    public boolean ocorreEm(int dia, int mes, int ano){
        return true;
    }
}
