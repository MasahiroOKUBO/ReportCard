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

/**
 * Created by okubo on 2016/11/19.
 * Custom Adapter Class.
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

        // find view
        TextView student_nameTextView = (TextView) listItemView.findViewById(R.id.student_name);
        TextView student_classTextView = (TextView) listItemView.findViewById(R.id.student_class);
        ImageView student_portraitImageView = (ImageView) listItemView.findViewById(R.id.student_portrait);
        TextView mathematicsTextView = (TextView) listItemView.findViewById(R.id.mathematics);
        TextView languageTextView = (TextView) listItemView.findViewById(R.id.language);
        TextView civicsTextView = (TextView) listItemView.findViewById(R.id.civics);
        TextView scienceTextView = (TextView) listItemView.findViewById(R.id.science);

        // set value
        student_nameTextView.setText(currentReportCard.getmStudentName());
        student_classTextView.setText(currentReportCard.getmStudentClass());
        student_portraitImageView.setImageResource(currentReportCard.getmImageResourceId());
        mathematicsTextView.setText(currentReportCard.getmGradeMathematics());
        languageTextView.setText(currentReportCard.getmGradeLanguage());
        civicsTextView.setText(currentReportCard.getmGradeCivics());
        scienceTextView.setText(currentReportCard.getmGradeScience());

        return listItemView;
    }
}
