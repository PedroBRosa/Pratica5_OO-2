import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        float altura, peso;
        int idade;
        Pessoa[] pessoas = new Pessoa[10];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Escreva o nome: ");
            nome = ler.next();
            System.out.println("Escreva a altura: ");
            altura = ler.nextFloat();
            System.out.println("Escreva o peso: ");
            peso = ler.nextFloat();
            System.out.println("Escreva a idade: ");
            idade = ler.nextInt();
            pessoas[i] = new Pessoa(nome, altura, peso,idade);
        }
//                                COMPARANDO SE OS OBJETOS SÃO IGUAIS
//        for (int i = 0; i < pessoas.length; i++) System.out.println(pessoas[i].imprimir());
//        Funcionario fun1 = new Funcionario("Pedro", "TI", "Bradesco", "316547436546", 2000.00);
//        Funcionario fun2 = new Funcionario("Maria", "TI", "Bradesco", "316547436546", 2000.00);
//        if (fun1 == fun2) {
//            System.out.println("Os dados são iguais");
//        } else {
//            System.out.println("os dados são diferentes");
//        }


    }
}
