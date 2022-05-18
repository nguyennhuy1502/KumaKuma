package entity;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static List<Question> lstQuestions = new ArrayList<Question>();

    static ProgramLanguage java = new ProgramLanguage("L01","Java");
    static ProgramLanguage reactJS = new ProgramLanguage("L02","ReactJS");

    static Question question1 = new Question("J01","Cac dac tinh OOP",Level.JUNIOR,java);
    static Question question2 = new Question("J02","Private variable la gi",Level.JUNIOR,java);
    static Question question3 = new Question("J03","Neu diem khac nhau giua List va Set",Level.JUNIOR,java);
    static Question question4 = new Question("J04","Overload va Override",Level.JUNIOR,java);
    static Question question5 = new Question("J05","TInh ke thua",Level.JUNIOR,java);

    static Question question6 = new Question("J06","Neu diem khac nhau giua List va Set",Level.SENIOR,java);
    static Question question7 = new Question("J07","Tinh da hinh",Level.SENIOR,java);
    static Question question8 = new Question("J08","Tinh bao dong",Level.SENIOR,java);
    static Question question9 = new Question("J09","Tinh da hinh",Level.SENIOR,java);
    static Question question10 = new Question("J010","Interface",Level.SENIOR,java);

    static Question question11 = new Question("R01","Chi ra nhung diem moi cua ES6",Level.JUNIOR,reactJS);
    static Question question12 = new Question("R02","Liet ke ra cac component life cycle",Level.JUNIOR,reactJS);
    static Question question13 = new Question("R03","Neu diem khac nhau giua List va Set reactJS",Level.JUNIOR,reactJS);
    static Question question14 = new Question("R04","Overload va Override reactJS",Level.JUNIOR,reactJS);
    static Question question15 = new Question("R05","TInh ke thua reactJS",Level.JUNIOR,reactJS);

    static Question question16 = new Question("R06","Neu diem khac nhau reactJS",Level.SENIOR,reactJS);
    static Question question17 = new Question("R07","reactJS 07",Level.SENIOR,reactJS);
    static Question question18 = new Question("R08","reactJS 08",Level.SENIOR,reactJS);
    static Question question19 = new Question("R09","reactJS 09",Level.SENIOR,reactJS);
    static Question question20 = new Question("R010","reactJS 10",Level.SENIOR,reactJS);

    public static void addQuestion(){
       lstQuestions.add(question1);
       lstQuestions.add(question2);
       lstQuestions.add(question3);
       lstQuestions.add(question4);
       lstQuestions.add(question5);
       lstQuestions.add(question6);
       lstQuestions.add(question7);
       lstQuestions.add(question8);
       lstQuestions.add(question9);
       lstQuestions.add(question10);
       lstQuestions.add(question11);
       lstQuestions.add(question12);
       lstQuestions.add(question13);
       lstQuestions.add(question14);
       lstQuestions.add(question15);
       lstQuestions.add(question16);
       lstQuestions.add(question17);
       lstQuestions.add(question18);
       lstQuestions.add(question19);
       lstQuestions.add(question20);
    }
}
