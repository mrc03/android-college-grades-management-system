package com.example.menuka.loginandregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import adapters.ModuleAdapter;
import dummy_data.ModuleData;
import models.Module;

public class SingleSemesterActivity extends AppCompatActivity {
    private List<Module> moduleList;
    private ModuleAdapter moduleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_semester);

        moduleList = ModuleData.getModules();
        moduleAdapter = new ModuleAdapter(this, 0, moduleList);

        ListView listView = (ListView) findViewById(R.id.modules_list_view);
        listView.setAdapter(moduleAdapter);

    }
}
