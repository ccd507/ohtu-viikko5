package ohtu;

import java.util.ArrayList;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21; // TODO: is there a better way?
    private boolean all;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    private ArrayList<String> tasks() {
        ArrayList<String> list = new ArrayList<String>();
        if (a1) list.add("a1");
        if (a2) list.add("a2");
        if (a3) list.add("a3");
        if (a4) list.add("a4");
        if (a5) list.add("a5");
        if (a6) list.add("a6");
        if (a7) list.add("a7");
        if (a8) list.add("a8");
        if (a9) list.add("a9");
        if (a10) list.add("a10");
        if (a11) list.add("a11");
        if (a12) list.add("a12");
        if (a13) list.add("a13");
        if (a14) list.add("a14");
        if (a15) list.add("a15");
        if (a16) list.add("a16");
        if (a17) list.add("a17");
        if (a18) list.add("a18");
        if (a19) list.add("a19");
        if (a20) list.add("a20");
        if (a21) list.add("a21");
        return list;
    }

    @Override
    public String toString() {
        ArrayList<String> taskList = tasks();
        String t = "";
        for (String s : taskList) {
            t += " " + s;
        }
        return "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + taskList.size() + ", aikaa kului " + hours + " tuntia" + ", tehdyt tehtävät:" + t;
    }

}
