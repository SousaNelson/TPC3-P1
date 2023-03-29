public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean EstaNaEmpresa;
    Data dataDeEntrada;


    void recebeAumento(double aumento){
        salario+=aumento;
    }

    double calculaGanhoAnual(){
       return salario*12;
    }

    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Dia: " + this.dataDeEntrada.dia);
        System.out.println("Mês: " + this.dataDeEntrada.mes);
        System.out.println("Ano: " + this.dataDeEntrada.ano);


    }
}
class Data {
    int dia;
    int mes;
    int ano;
}


