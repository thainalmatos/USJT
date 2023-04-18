class Piloto {

    String nome;
    int horasVoo;

    public void voa(String nome){
        this.nome = nome;
        horasVoo = 0;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void adicionaHoras(int horas){
        horasVoo = horasVoo + horas;
    }
}
