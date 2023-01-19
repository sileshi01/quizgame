import java.util.*;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
           //Stopwatch stopwatch = new Stopwatch();
        /*Map<Integer,String> ms= new HashMap<>();
        ms.put(101,"yodi");
        ms.put(102,"bini");
        ms.put(103,"mis");

       Set<Map.Entry<Integer,String>> entry= ms.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator =entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry1 =iterator.next();
            System.out.println(entry1.getKey()+"--"+entry1.getValue());
        }*/
       /* String q1="what color are apples?\n"+ "(a)red/green\n(b)orange\n(c)magenta\n";
        String q2="what color are bananas?\n"+ "(a)red/green\n(b)yellow\n(c)blue\n";

        Question[] questions = {
                new Question(q1,"a"),
                new Question(q2,"b")
        };
        takeTest(questions);*/


            }

            public static void takeTest(Question[] questions){
                int score=0;
                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < questions.length; i++) {
                    System.out.println(questions[i].prompt);
                    String answer = scanner.nextLine();
                    if (answer.equals(questions[i].answer)){
                        score++;
                    }

                }
                System.out.println("you got "+score+"/"+questions.length);

            }
}