package com.okubo_tech.reportcard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by okubo on 2016/11/19.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {


    /**
     * Custom constructor.
     *
     * @param context     The current context. Used to inflate the layout file.
     * @param ReportCards A List of ReportCard objects to display in a list
     */
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> ReportCards) {
        super(context, 0, ReportCards);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        ReportCard currentReportCard = getItem(position);

        // set Student Name in list item
        TextView student_nameTextView = (TextView) listItemView.findViewById(R.id.student_name);
        student_nameTextView.setText(currentReportCard.getmStudentName());


        // set Student Class in list item
        TextView student_classTextView = (TextView) listItemView.findViewById(R.id.student_class);
        student_classTextView.setText(currentReportCard.getmStudentClass());

        // set Student Portrait in list item
        ImageView student_portraitImageView = (ImageView) listItemView.findViewById(R.id.student_portrait);
        student_portraitImageView.setImageResource(currentReportCard.getmImageResourceId());


        // set mathematics in list item
        TextView mathematicsTextView = (TextView) listItemView.findViewById(R.id.mathematics);
        mathematicsTextView.setText(currentReportCard.getmGradeMathematics());

        // set language in list item
        TextView languageTextView = (TextView) listItemView.findViewById(R.id.language);
        languageTextView.setText(currentReportCard.getmGradeLanguage());

        // set civics in list item
        TextView civicsTextView = (TextView) listItemView.findViewById(R.id.civics);
        civicsTextView.setText(currentReportCard.getmGradeCivics());

        // set science in list item
        TextView scienceTextView = (TextView) listItemView.findViewById(R.id.science);
        scienceTextView.setText(currentReportCard.getmGradeScience());

        return listItemView;

    }


}
