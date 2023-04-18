package part_2;


class Pessoa {
    private int idade;
    private String nome;

    public void fazAniversario(){
        idade ++;
    } public void imprime(){
        System.out.println("Nome: " + nome + " com idade: " + idade);
    } public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    } public void setNome(String nome){
        this.nome = nome;
    }public int getIdade(){
        return idade;
    }public void setIdade( int idade){
        if (idade > 0){
            this.idade= idade;
        }
    }
}
