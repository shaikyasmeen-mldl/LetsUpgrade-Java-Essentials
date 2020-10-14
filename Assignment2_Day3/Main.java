package com.myjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

                int marks1, marks2, marks3, marks4,marks5;
                Scanner sc= new Scanner(System.in);

                System.out.println("Enter marks of the five subjects");

                marks1=sc.nextInt();
                marks2=sc.nextInt();
                marks3=sc.nextInt();
                marks4=sc.nextInt();
                marks5=sc.nextInt();
                int total_marks= 500;
                int your_total= marks1 + marks2 + marks3 + marks4 + marks5;

                float percentage = (your_total * 100) / total_marks;

                if(percentage >= 90.0) {
                    System.out.println(" A grade and you have "+ percentage + "%");
                }
                else if(percentage < 90.0 && percentage >= 80.0) {
                    System.out.println(" B grade and you have "+ percentage + "%");
                }
                else if(percentage < 80.0 && percentage >= 70.0) {
                    System.out.println(" C grade and you have "+ percentage + "%");
                }
                else if(percentage < 70.0 && percentage >= 60.0) {
                    System.out.println(" D grade and you have "+ percentage + "%");
                }
                else if(percentage < 60.0) {
                    System.out.println(" E grade and you have "+ percentage + "%");
                }
            }

        }


