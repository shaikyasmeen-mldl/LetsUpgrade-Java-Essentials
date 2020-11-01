package quiz;

import java.util.Scanner;

public class Players {

    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails() {

        System.out.println("Enter Player Name : ");
        name=sc.next();

    }

}
