/*Exercicio 11*/
public class Testa {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("SL-28-AB","Hyundai",2000,7000000);
        Vehicle v2 = new Vehicle("SV-45-FF","NISSAN",2018,3.000000);

        System.out.println("Nº da placa: "+v1.getRegNo());
        System.out.println("Marca: "+v1.getMake());
        System.out.println("Ano de fabricação: "+v1.getYearOfManufacture());
        System.out.println("Valor: "+v1.getValue());

        SecondHandVehicle n = new SecondHandVehicle("SV-74-BA","Opel",2003,600.000000,2);

        System.out.println("Nº da placa: "+n.getRegNo());
        System.out.println("Marca: "+n.getMake());
        System.out.println("Ano de fabricação: "+n.getYearOfManufacture());
        System.out.println("Valor: "+n.getValue());
        System.out.println("Nº proprietários: "+n.getNumberOfOwners());


    }
}