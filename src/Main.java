import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Student  класс  тузунуз  полелери  аты,  жашы,  электрондук
        почтасы  болот.  Мейнден  класстын  10  объектисин  тузунуз,
        маанилери мн толтурунуз.
            talentLMS  деген  ArrayList  тузунуз  ,  анан  тузулуп  буткон
        класстын объектин листке салыныз. Анан   текшериниз эки жолу
        электрондук  почтасы  окшош  болгон  студент  болсо  ошол
        студенттерди очурунуз.*/
        Student student = new Student((byte) 18, "Malik", "@asanbekov04");
        Student student2 = new Student((byte) 34, "Samat Baike", "@asadsafnbekov04");
        Student student3 = new Student((byte) 45, "Mamatkarim", "@mamatkarimova");
        Student student4 = new Student((byte) 15, "Bakyt", "@bakyt");
        Student student5 = new Student((byte) 17, "Joodar", "@joki06");
        Student student6 = new Student((byte) 23, "Jenish", "@kesha");
        Student student7 = new Student((byte) 28, "Nurbek", "@nurbekov");
        Student student8 = new Student((byte) 30, "Niaz", "@manasov");
        Student student9 = new Student((byte) 21, "Kenjebek", "@kesha04");
        Student student10 = new Student((byte) 19, "Arslan", "@satinbaev");
        ArrayList<Student> talentLMS = new ArrayList<>();
        talentLMS.add(student);
        talentLMS.add(student2);
        talentLMS.add(student3);
        talentLMS.add(student4);
        talentLMS.add(student5);
        talentLMS.add(student6);
        talentLMS.add(student7);
        talentLMS.add(student8);
        talentLMS.add(student9);
        talentLMS.add(student10);
        String emailToCheck = "@nurbekov";
        for (int i = 0; i < talentLMS.size(); i++) {
            if (talentLMS.get(i).getEmail().equals(emailToCheck)) {
                talentLMS.remove(i);
                break;
            }
        }
        for (Student student11 : talentLMS) {
            System.out.println(student11.getName() + " " + student11.getAge() + " " + student11.getEmail());
        }


    }
}