package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mQuestion;
    Button mOpOne;
    Button mOpTwo;
    Button mOpThree;
    Button mNext;
    Button mPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mQuestion=findViewById(R.id.question);
    mOpOne=findViewById(R.id.op_1);
    mOpTwo=findViewById(R.id.op_2);
    mOpThree=findViewById(R.id.op_3);
    mNext=findViewById(R.id.next_button);
    mPrevious=findViewById(R.id.previous_button);

        Question obj[]=new Question[5];

        obj[0] = new Question();
        obj[0].setQues("Who are you?");
        obj[0].setOP1("Your Father!");
        obj[0].setOP2("Im you?!?!?!?!?!?!@#$%$^%^");
        obj[0].setOP3("No one in perticular");
        obj[0].setcrroectAns("No one in perticular");

        obj[1] = new Question();
        obj[1].setQues("why do you exest?");
        obj[1].setOP1("To eat!!");
        obj[1].setOP2("To Play");
        obj[1].setOP3("I don't know!!!!!!!!!!!!!!!");
        obj[1].setcrroectAns("I don't know!!!!!!!!!!!!!!!");

        obj[2] = new Question();
        obj[2].setQues("What time is it?");
        obj[2].setOP1("time to eat!!");
        obj[2].setOP2("Time to Play");
        obj[2].setOP3("I don't know!!!!!!!!!!!!!!!");
        obj[2].setcrroectAns("I don't know!!!!!!!!!!!!!!!");

        obj[3] = new Question();
        obj[3].setQues("What is this question?");
        obj[3].setOP1("#%$%&*(&^Q@@$#@!!");
        obj[3].setOP2("i didn't made it");
        obj[3].setOP3("I don't know!!!!!!!!!!!!!!!");
        obj[3].setcrroectAns("I didn't made it");

        obj[4] = new Question();
        obj[4].setQues("Is this the Furth questions?");
        obj[4].setOP1("#%$%&*(&^Q@@$#@!!");
        obj[4].setOP2("It forth not furth!!");
        obj[4].setOP3("no its fith");
        obj[4].setcrroectAns("#%$%&*(&^Q@@$#@!!");

        mQuestion.setText(String.valueOf(obj[0]));



    }
}
