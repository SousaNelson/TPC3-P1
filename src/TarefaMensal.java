/*Exercicio 12*/
import java.time.LocalDate;

public class TarefaMensal extends Tarefa{
    public TarefaMensal(String descrição, LocalDate data) {
        super(descrição, data);
    }

    @Override
    public boolean ocorreEm(int dia, int mes, int ano) {
        return data.getDayOfMonth() == dia;
    }
}
