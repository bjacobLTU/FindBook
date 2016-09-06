package com.example.workstation.bookadviser;
import java.util.ArrayList;
import java.util.List;

public class BookExpert {
    List<String> getTitles(String category) {
        List<String> titles = new ArrayList<String>();
        if (category.equals("fiction")) //fiction, non-fiction, horror, drama
        {
            titles.add("fiction titles");
        } else if (category.equals("non-fiction")) {
            titles.add("non-fiction titles");
        } else if (category.equals("horror")) {
            titles.add("horror titles");
        } else {
            titles.add("drama titles");
        }
        return titles;
    }
}
