package quiz;

public class Quizgame {

    Question[] questions=new Question[3];
    Players player=new Players();

    String[] questionsdata={"Capital of India_____?","Capital of Telangana _____?","Capital of Maharashtra _____?"};
    String[] options1={"Delhi","RangaReddy","Guntur"};
    String[] options2={"Telangana","Hyderabad","Pune"};
    String[] options3={"Maharashtra","Kurnool","Mumbai"};
    String[] options4={"andhraPradesh","Kadapa","Thane"};
    int[] answers={1,2,3};


    public void initGame() {

        for(int i=0;i<3;i++) {
            questions[i]=new Question();
        }


        for(int i=0;i<3;i++) {
            questions[i].Question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }

    }

    public void play() {

        player.getDetails();

        for(int i=0;i<3;i++) {
            boolean status=questions[i].askQuestion();
            if(status==true) {
                System.out.println("WOW! It's Correct Answer...!");
                player.score=player.score+5;
            }
            else {
                System.out.println("OOPS! It's Wrong Answer...!");
                player.score=player.score-5;
            }

        }

        System.out.println(player.name+" Your Score is : "+player.score);

    }

}
