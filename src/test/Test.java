package test;

import entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@FunctionalInterface
interface IListQuestion {
    void listQuestion(String level, String language);
}

public class Test implements IListQuestion{
    static int showMenu(){
        int choice ;
        System.out.println("--------MENU---------");
        System.out.println("1. Junior");
        System.out.println("2. Mid Senior");
        System.out.println("3. Senior");
        System.out.println("4. Exit");

        System.out.println("Choose :");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());

        return choice;
    }

    static int showLanguage(){
        int choice ;
        System.out.println("--------MENU---------");
        System.out.println("1. Java");
        System.out.println("2. ReactJS");
        System.out.println("3. Exit");

        System.out.println("Choose :");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());

        return choice;
    }

    @Override
    public void listQuestion(String level, String language) {
        if (level.equals("Junior") && language.equals("Java")){
            Stream<Question> filterJuniorJava = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.JUNIOR) && q.getProgramLanguage().getName().equals("Java"));
            Stream<Question> filterSeniorJava = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.SENIOR) && q.getProgramLanguage().getName().equals("Java"));

            filterJuniorJava.toList().stream()
                    .skip(0)
                    .limit(4)
                    .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));

            filterSeniorJava.toList().stream().limit(1).forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));

        } else if (level.equals("Senior") && language.equals("Java")) {
            Stream<Question> filterSeniorJava = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.SENIOR) && q.getProgramLanguage().getName().equals("Java"));
            filterSeniorJava.toList().stream()
                    .limit(5)
                    .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));
        } else if (level.equals("Mid Senior") && language.equals("Java")) {
            Stream<Question> filterJuniorJava = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.JUNIOR) && q.getProgramLanguage().getName().equals("Java"));
            Stream<Question> filterSeniorJava = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.SENIOR) && q.getProgramLanguage().getName().equals("Java"));

            filterJuniorJava.toList().stream()
                    .skip(0)
                    .limit(2)
                    .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));
            filterSeniorJava.toList().stream()
                    .skip(0)
                    .limit(3)
                    .forEach(question -> System.out.println(question.getName() +" "+question.getLevel()));
        }
    }

    public static void main(String[] args) {

        Interview.addQuestion();
        Test test = new Test();

        Stream<Question> filterJuniorReactJS = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.JUNIOR) && q.getProgramLanguage().getName().equals("ReactJS"));
        Stream<Question> filterSeniorReactJS = Interview.lstQuestions.stream().filter(q -> q.getLevel().equals(Level.SENIOR) && q.getProgramLanguage().getName().equals("ReactJS"));

        int choice, choice2;
outer:
        while (true) {
            choice = showLanguage();
            switch (choice) {
                case 1:
                    while (true) {
                        choice2 = showMenu();
                        switch (choice2) {
                            case 1:
                                test.listQuestion("Junior", "Java");
                                break;
                            case 2:
                                test.listQuestion("Mid Senior","Java");
                                break;
                            case 3:
                                test.listQuestion("Senior","Java");
                                break;
                            case 4:
                                continue outer;
                        }
                    }
                case 2:
                    break;
                case 3:
                    return;

            }
        }
    }
}
