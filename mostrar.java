public class mostrar{
    public static void main(String args[]){

    Pc pc01 = new Pc();
    pc01.monitor = "Redragon";
    pc01.processador = "Intel";
    pc01.ano = 2022;
    pc01.preco = 5.500;

    Pc pc02 = new Pc();
    pc02.monitor = "Dell";
    pc02.processador = "AMD";
    pc02.ano = 2023;
    pc02.preco = 7.000;

    Pc pc03 = new Pc();
    pc03.monitor = "Samsung";
    pc03.processador = "Intel";
    pc03.ano = 2024;
    pc03.preco = 10.000;

    System.out.println("Monitor: " + pc01.monitor + "\nCom processador: " + pc01.processador + "\nDe: " + pc01.ano + "\nValendo: " + pc01.preco);
    System.out.println("-------------------------------------");
    System.out.println("Monitor: " + pc02.monitor + "\nCom processador: " + pc02.processador + "\nDe: " + pc02.ano + "\nValendo: " + pc02.preco);
    System.out.println("-------------------------------------");
    System.out.println("Monitor: " + pc03.monitor + "\nCom processador: " + pc03.processador + "\nDe: " + pc03.ano + "\nValendo: " + pc03.preco);
    }
}