package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contact;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Saugat Malla","908011122",R.drawable.saugat,"example@fdsf.fasdf","dfdsf"));
        contactList.add(new Contact("Rajesh Hamal","908092212",R.drawable.rajesh,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Dahayang Rai","7891226564",R.drawable.dahayang,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));
        contactList.add(new Contact("Bhuwan KC","908011142",R.drawable.bhuwan,"example@fdsf.fasdf","example@fdsf.fasdf"));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
