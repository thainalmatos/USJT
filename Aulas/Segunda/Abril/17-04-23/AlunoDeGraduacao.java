public class AlunoDeGraduacao extends Aluno{
    private double nota1, nota2, notaFinal;

    // metodo de acesso = getters
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }

    // metodos modificadores = setters
    public void setNota1(Double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(Double nota2){
        this.nota2 = nota2;
    }


}
