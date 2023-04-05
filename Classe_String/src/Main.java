/*Aplicação de alguns métodos da class String*/
public class Main {
    public static void main(String[] args) {
        String r = "Rui Jorge Santos de Sousa";
        String n = "Nelson Jorge Santos de Sousa";
        if (r==n){
            System.out.println("São iguais");
        }
        else {
            System.out.println("São diferentes");
        }
        System.out.println("A dimensão da string = "+n.length()); /* retorna a dimensão*/
        System.out.println(n.toLowerCase());/*letras em minusculas*/
        System.out.println(n.replace("Jorge", "Jorginho"));/*substituir o "Jorge por "Jorginho"*/
        System.out.println(n.endsWith("Santos"));/*Vai ver se termina em "Santos"*/
        System.out.println(n.startsWith("Santos",13));/*testar se o Santos inicia no indice 13*/
    }

}