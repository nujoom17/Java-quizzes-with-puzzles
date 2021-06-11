import java.util.Scanner;

public class Quiz {
    public Quiz() {
    }

    public static void TakeTest() {
        String q1 = """
                Which is the largest Planet of our solar system?
                a)Earth
                b)Uranus
                c)Saturn
                d)Jupiter""";
        String q2 = """
                Who is the father of Computers?
                a)Linus Torvalds
                b)Charles Babbage
                c)Bill Gates
                d)J.A. Fleming""";
        String q3 = """
                How many bytes make a megabyte?
                a)1024
                b)1,048,576
                c)1000
                d)None of the above""";
        String q4 = """
                What is the first Microprocessor known as?
                a)Pentium 4
                b)Intel 8080
                c)Intel 4004
                d)None of the above
                """;
        String q5 = """
                Who invented the first commercial CPU?
                a)Federico Faggin
                b)Marcian Hoff
                c)Blaise Pascal
                d)John Von Neumann
                """;
        Question[] questions = new Question[]{new Question(q1, "d"), new Question(q2, "b"), new Question(q3, "b"),
                new Question(q4, "c"), new Question(q5, "a")};
        int score = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = input.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}



