package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        Task[] list1 = new Task[]{
                new Task(1, "Test1", "Hello bro1"),
                new Task(2, "Test2", "Hello bro2"),
                new Task(3, "Test3", "Hello bro3"),
                new Task(4, "Test4", "Hello bro4"),
                new Task(5, "Test5", "Hello bro5"),
                new Task(6, "Test6", "Hello bro6"),
                new Task(7, "Test7", "Hello bro7"),
                new Task(8, "Test8", "Hello bro8"),
                new Task(9, "Test9", "Hello bro9"),
                new Task(10, "Test10", "Hello bro10"),
                new Task(11, "Test11", "Hello bro11"),


        };

        RecyclerView tasklist = (RecyclerView) findViewById(R.id.tasklist);


        tasklist.setLayoutManager(new LinearLayoutManager(this));


        tasklist.setAdapter(new TaskAdapter(list1));
    }
}
