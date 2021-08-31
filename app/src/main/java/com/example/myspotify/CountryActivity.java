package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ListView listView;

    private static final String[] countries = new String[]{"Chile", "Algeria", "India", "Morocco",
            "United Arab Emirates", "Colombia", "Saudi Arabia", "Hong Kong", "Brazil", "Tanzania",
            "Ecuador", "South Africa", "Ghana", "Mexico", "Kenya", "Peru", "Indonesia", "Uganda", "Vietnam",
            "Egypt", "Thailand", "Argentina", "Nigeria"};

    private static final String[] code = new String[]{"Chile", "Algeria", "India", "Morocco",
            "United Arab Emirates", "Colombia", "Saudi Arabia", "Hong Kong", "Brazil", "Tanzania",
            "Ecuador", "South Africa", "Ghana", "Mexico", "Kenya", "Peru", "Indonesia", "Uganda", "Vietnam",
            "Egypt", "Thailand", "Argentina", "Nigeria"};


//    private static final CountryModelClass[] countries= new CountryModelClass[]{Chile,Algeria,India,Morocco,UnitedArabEmirates,Colombia,
//            SaudiArabia,HongKong,Brazil,Tanzania};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        listView = findViewById(R.id.listView);

        CountryModelClass Chile = new CountryModelClass("Chile", "+56");
        CountryModelClass Algeria = new CountryModelClass("Algeria", "+213");
        CountryModelClass India = new CountryModelClass("India", "+91");
        CountryModelClass Morocco = new CountryModelClass("Morocco", "+212");
        CountryModelClass UnitedArabEmirates = new CountryModelClass("United Arab Emirates", "+971");
        CountryModelClass Colombia = new CountryModelClass("Colombia", "+57");
        CountryModelClass SaudiArabia = new CountryModelClass("Saudi Arabia", "+966");
        CountryModelClass HongKong = new CountryModelClass("Hong Kong", "+852");
        CountryModelClass Brazil = new CountryModelClass("Brazil", "+55");
        CountryModelClass Tanzania = new CountryModelClass("Tanzania", "+255");

        ArrayList<CountryModelClass> countryList = new ArrayList<>();

        countryList.add(Chile);
        countryList.add(Algeria);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        autoCompleteTextView.setAdapter(adapter);

        MyAdapter myAdapter = new MyAdapter(this, R.layout.country_list, countryList);
        listView.setAdapter(myAdapter);
        Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();
    }
}