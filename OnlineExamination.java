import java.util.ArrayList;

import java.util.Scanner;

class Question {

    private String question;

    private ArrayList<String> options;

    private int answer;

    public Question(String question, ArrayList<String> options, int answer) {

        this.question = question;

        this.options = options;

        this.answer = answer;

    }

    public String getQuestion() {

        return question;

    }

    public ArrayList<String> getOptions() {

        return options;

    }

    public int getAnswer() {

        return answer;

    }

}

class Exam {

    private ArrayList<Question> questions;

    private int score;

    public Exam(ArrayList<Question> questions) {

        this.questions = questions;

    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        score = 0;

        for (int i = 0; i < questions.size(); i++) {

            System.out.println("Question " + (i + 1) + ": " + questions.get(i).getQuestion());

            ArrayList<String> options = questions.get(i).getOptions();

            for (int j = 0; j < options.size(); j++) {

                System.out.println((j + 1) + ". " + options.get(j));

            }

            System.out.print("Enter your answer: ");

            int answer = scanner.nextInt();

            if (answer == questions.get(i).getAnswer()) {

                System.out.println("Correct!");

                score++;

            } else {

                System.out.println("Incorrect. The correct answer is option " + questions.get(i).getAnswer() + ".");

            }

        }

        System.out.println("You scored " + score + " out of " + questions.size() + ".");

        scanner.close();

    }

}

public class OnlineExamination {

    public static void main(String[] args) {

        // Sample questions for the exam

        ArrayList<Question> questions = new ArrayList<>();

        ArrayList<String> options1 = new ArrayList<>();

        options1.add("10");

        options1.add("4");

        options1.add("30");

        options1.add("40");

        Question question1 = new Question("What is the square of 2?", options1, 2);

        ArrayList<String> options2 = new ArrayList<>();

        options2.add("India");

        options2.add("USA");

        options2.add("Russia");

        options2.add("China");

        Question question2 = new Question("Which country has the largest population?", options2, 4);

        ArrayList<String> options3 = new ArrayList<>();

        options3.add("Eluru");

        options3.add("Hyderabad");

        options3.add("Delhi");

        options3.add("Mumbai");

        Question question3 = new Question("What is the capital of India?", options3, 3);

        questions.add(question1);

        questions.add(question2);

        questions.add(question3);

        Exam exam = new Exam(questions);

        exam.start();

    }

}
