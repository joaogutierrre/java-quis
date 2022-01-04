public class Question {
    private String question;
    private int nswr;

    public Question(String question, int nswr) {
        this.question = question;
        this.nswr = nswr;
    }

    public String getQuestion() {
        return question;
    }

    public int getNswr() {
        return nswr;
    }
}
