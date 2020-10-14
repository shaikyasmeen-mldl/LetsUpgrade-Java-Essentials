package com.myjava;

import java.util.Scanner;
public class Tax {

    public static void main(String[] args)
    {

        String name;
        int day_of_birth,month_of_birth,year_of_birth,monthly_salary,tax_amount;
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter Your name");
        name=sc.nextLine();

        System.out.println("Please enter Your Day of birth");
        day_of_birth=sc.nextInt();

        System.out.println("Enter Your Month of birth (1-12)");
        month_of_birth=sc.nextInt();

        System.out.println("Enter Your Year of birth");
        year_of_birth=sc.nextInt();

        System.out.println("Enter Your Monthly Salary");
        monthly_salary =sc.nextInt();
        int age = 2020-year_of_birth;

        int annual_salary = (monthly_salary * 12);

        if(annual_salary >=500000) {
            tax_amount= (annual_salary * 20) / 100;
            System.out.println("Your name is " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax_amount);
        }
        else if(annual_salary >=400000) {
            tax_amount= (annual_salary * 15) / 100;
            System.out.println("Your name is " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax_amount);
        }
        else if(annual_salary >=300000) {
            tax_amount= (annual_salary * 10) / 100;
            System.out.println("Your name is " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax_amount);
        }
        else if(annual_salary >=200000) {
            tax_amount= (annual_salary * 5) / 100;
            System.out.println("Your name is " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax is "+ tax_amount);
        }
        else {
            //tax= (annual_salary * 15) / 100;
            System.out.println("Your name is " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax is not need to pay");
        }

    }

}