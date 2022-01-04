import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();

        ArrayList<Question> questions = new ArrayList<Question>();
        Question q1 = new Question("Qual a capital da Bahia? 1 - Salvador | 2 - Ilhéus | 3 - Porto Seguro", 1);
        Question q2 = new Question("Qual a capital de Rondônia? 1 - Ariquemes | 2 - Porto Velho | 3 - Vilhena", 2);
        Question q3 = new Question("Qual a capital de Pernambuco? 1 - Jaboatão  dos Guararapes | 2 - Olinda | 3 - Recife", 3);
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

        System.out.println("Identificação de usuário - insira seu nome");
        user.setNome(input.nextLine());

        int hits = 0;
        int miss = 0;
        for (int i = 0; i < questions.size(); i++) {
            String question = questions.get(i).getQuestion();
            System.out.println(question);
            int nswr = input.nextInt();
            if (nswr == questions.get(i).getNswr()) {
                hits++;
            } else {
                miss++;
            }
        }

        System.out.println("Nome: " + user.getNome());
        System.out.println("Acertos:" + hits);
        System.out.println("Erros:" + miss);
    }
}

