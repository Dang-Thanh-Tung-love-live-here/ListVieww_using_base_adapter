package com.doctor.listvieww_using_base_adapter.PersonAdapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.doctor.listvieww_using_base_adapter.MainActivity;
import com.doctor.listvieww_using_base_adapter.R;
import com.doctor.listvieww_using_base_adapter.model.Person;

import java.util.ArrayList;

public class PersonAdapter extends BaseAdapter {
    private ArrayList<Person> people;
    private Context context;

    public PersonAdapter(ArrayList<Person> people, Context context) {
        this.people = people;
        this.context = context;
    }

    @Override
    public int getCount() {
        if(people!=null)
        return people.size();
        else return 0;
     }

    @Override
    public Object getItem(int position) {

        return people.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View v= convertView;
       if(v==null) {
           LayoutInflater inflater=((MainActivity)context).getLayoutInflater();
           v=inflater.inflate(R.layout.)
       }

        return v;
    }
}
