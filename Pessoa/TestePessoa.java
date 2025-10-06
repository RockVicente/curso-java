import java.util.Scanner;
public class TestePessoa {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner in = new Scanner(System.in);

        System.out.println("DIgite o nome da pessoa");
        pessoa.setNome(in.nextLine());
        
        System.out.println("Digite a Idade");
        pessoa.setIdade(in.nextInt());

        System.out.println("Digite a Cidade");
        pessoa.setCidade(in.nextLine());

        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println("Idade: "+ pessoa.getIdade());
        System.out.println("Cidade: "+ pessoa.getCidade());    

    }
    
}
