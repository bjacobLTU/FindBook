package com.example.workstation.bookadviser;

import android.app.Activity;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBookActivity extends Activity//AppCompatActivity {
{
    private BookExpert expert = new BookExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_book);
    }
    //Call when the button gets clicked
    public void onClickFindBook(View view) {
        //Get a reference to the TextView
        TextView titles = (TextView) findViewById(R.id.titles);

        //Get a reference to the Spinner
        Spinner category = (Spinner) findViewById(R.id.category);

        //Get the selected item in the Spinner
        String bookType = String.valueOf(category.getSelectedItem());

        //Get recommendations from the BeerExpert class
        List<String> titlesList = expert.getTitles(bookType);
        StringBuilder titlesFormatted = new StringBuilder();
        for (String title : titlesList) {
            titlesFormatted.append(title).append('\n');
        }

        //Display the beers
        titles.setText(titlesFormatted);
    }
}
