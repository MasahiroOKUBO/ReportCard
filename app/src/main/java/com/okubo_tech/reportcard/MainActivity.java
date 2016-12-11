package com.okubo_tech.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ReportCard> reportCards = new ArrayList<>();

        // use setter pattern.
        ReportCard reportCard = new ReportCard("MasahiroOKUBO", "1-A", R.drawable.masahiro_okubo);
        reportCard.setmGradeMathematics(95);
        reportCard.setmGradeLanguage(60);
        reportCard.setmGradeCivics(35);
        reportCard.setmGradeScience(10);
        reportCards.add(reportCard);

        // use 6 args constructor pattern.
        reportCards.add(new ReportCard("MasahiroOKUBO", "1-A", R.drawable.masahiro_okubo,
                "A", "A", "A", "A"));
        reportCards.add(new ReportCard("MasahiroOKUBO2", "1-C", R.drawable.masahiro_okubo,
                "B", "B", "B", "B"));

        ReportCardAdapter reportCardAdapter = new ReportCardAdapter(this, reportCards);
        ListView listView = (ListView) findViewById(R.id.listview_reportcard);
        listView.setAdapter(reportCardAdapter);

    }
}
