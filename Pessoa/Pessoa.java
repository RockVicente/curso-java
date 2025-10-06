public class Pessoa{

    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(){} // construtor sem parametro


    // metodo getter para os atributos da classe pessoa

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCidade(){
        return cidade;
    }

    //metodo setter para os atributos da classe pessoa

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

}