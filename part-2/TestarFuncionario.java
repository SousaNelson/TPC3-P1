import javax.swing.*;

import java.util.Scanner;
public class TestarFuncionario {


    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);
        f1.mostra();


        System.out.println("salario atual:" + f1.salario);
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());

        Funcionario f2 = new Funcionario();
        f2.nome = "Danilo";
        f2.salario = 100;
        if (f1 == f2) {
            System.out.println("f1 e f2 são iguais");
        } else {
            System.out.println("f1 e f2 são diferentes");
        }


}
}
