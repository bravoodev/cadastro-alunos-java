
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



public class CadastroAlunos {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner (System.in)) {
            ArrayList<Aluno> listaAlunos = new ArrayList<>();
            
            
            int opcao;
            do{
                System.out.println("=== MENU ===");
                System.out.println("1 - Cadastrar Aluno");
                System.out.println("2 - Listar Alunos");
                System.out.println("3 - Salvar alunos no arquivo");
                System.out.println("0 - Sair");
                System.out.println("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao){
                    case 1:
                        System.out.println("Digite o nome do aluno: ");
                        String nome = scanner.nextLine();
                        
                        System.out.println("Digite a idade do aluno: ");
                        int idade = scanner.nextInt();
                        
                        System.out.println("Digite a nota do aluno: ");
                        double nota = scanner.nextDouble();
                        
                        Aluno novoAluno = new Aluno(nome, idade, nota);
                        listaAlunos.add(novoAluno);
                        System.out.println("Aluno cadastrado com sucesso!\n");
                        break;
                        
                    case 2:
                        System.out.println("\n=== LISTA DE ALUNOS ===");
                        for (Aluno aluno: listaAlunos){
                            System.out.println(aluno);
                        }
                        System.out.println("");
                        break;
                        
                    case 3:
                        salvarAlunosEmArquivo(listaAlunos);
                        break;
                        
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                        
                    default:
                        System.out.println("Opção inválida!\n");
                        break;
                }
            } while (opcao != 0 );
        }
    }


    public static void salvarAlunosEmArquivo(ArrayList<Aluno> lista) {
        try {
            try (FileWriter writer = new FileWriter("alunos.txt")) {
                for (Aluno aluno : lista) {
                    writer.write(aluno.toString() + "\n");
                }
            }
            System.out.println("Alunos salvos com sucesso no arquivo 'alunos.txt'!\n");

        } catch (IOException e) {
            System.out.println("Erro ao salvar os alunos: " + e.getMessage());
        }
    }
}


