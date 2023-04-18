package part_2;

public class Prog{
    public static void main(String[] args) {
         Pessoa tata;
         tata = new Pessoa("Tata", 20);

         tata.setNome("Tata Lima");
         tata.setIdade(-19);


         if (tata.getIdade() > 15){
            tata.fazAniversario();
            tata.imprime();
         }

    }
}
