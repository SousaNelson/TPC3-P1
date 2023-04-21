/*Exercicio 12*/
import java.time.LocalDate;

public class Tarefa {
    private String descrição;
    public LocalDate data;

    public Tarefa(String descrição, LocalDate data) {
        this.descrição = descrição;
        this.data = data;
    }

    public boolean ocorreEm(int dia, int mes, int ano){
        LocalDate dataParam = LocalDate.of(dia, mes, ano);
        return data.equals(dataParam);

    }



    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descrição;
    }

    public void setDescricao(String descricao) {
    }
}
