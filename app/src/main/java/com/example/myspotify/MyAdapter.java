package com.example.myspotify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<CountryModelClass> {
    private static final String TAG = "MyAdapter";
    private Context mContext;
    int mResourace;

    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<CountryModelClass> objects) {
        super(context, resource, objects);
        this.mContext = mContext;
        mResourace = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String country = getItem(position).getCountry();
        String code = getItem(position).getCode();

        CountryModelClass countryModelClass = new CountryModelClass(country, code);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResourace, parent, false);

        TextView tvCountry = (TextView) convertView.findViewById(R.id.nameTextView);
        TextView tvCode = (TextView) convertView.findViewById(R.id.codeTextView);

        tvCountry.setText(country);
        tvCode.setText(code);

        return convertView;
    }
}
