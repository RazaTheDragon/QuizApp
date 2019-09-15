package com.example.myapplication;

public class Question {
    private String Ques;
    private String OP1;
    private String OP2;
    private String OP3;
    private String crroectAns;

    public String getQues() {
        return Ques;
    }

    public void setQues(String ques) {
        Ques = ques;
    }

    public String getOP1() {
        return OP1;
    }

    public void setOP1(String op1) {
        OP1 = op1;
    }

    public String getOP2() {
        return OP2;
    }

    public void setOP2(String op2) {
        OP2 = op2;
    }

    public String getOP3() {
        return OP3;
    }

    public void setOP3(String op3) {
        OP3 = op3;
    }
    public String getcrroectAnst(){
        return crroectAns;
    }
    public void setcrroectAns(String CrroectAns){
        crroectAns = CrroectAns;
    }
}