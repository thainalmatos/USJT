public class TesteAluno {
    public static void main(String[] args) {
        AlunoDeGraduacao AlunoGrad = new AlunoDeGraduacao();
        AlunoGrad.setNome("Tata");
        AlunoGrad.setIdade(20);
        AlunoGrad.setNota1(8.2);
        AlunoGrad.setNota2(9.0);

        System.out.println("Nome do aluno da graduacao: " + AlunoGrad.getNome() +
         "\nIdade: " + AlunoGrad.getIdade() + "\nNota1: " +
          AlunoGrad.getNota1() + "\nNota2: " + AlunoGrad.getNota2());

        AlunoDePosGraduacao AlunoPos= new AlunoDePosGraduacao();
        AlunoPos.setNome("Maria");
        AlunoPos.setIdade(30);
        AlunoPos.setConceito('A');

        System.out.println("\nNome do aluno da Pos: " + AlunoPos.getNome() +
        "\nIdade: " + AlunoPos.getIdade() + "\nConceito: " +
         AlunoPos.getConceito());



    }
}
