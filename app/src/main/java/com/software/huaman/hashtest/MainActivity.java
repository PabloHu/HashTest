package com.software.huaman.hashtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="MainACtivityTAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car("Ford", "Prove");
        Map<String, Car> map = new HashMap();

        map.put("First", car);
        car = new Car("Mazda", "Rx8");
        map.put("Second", car);

        Log.d(TAG, "onCreate: "+Arrays.asList(map));
      //  System.out.println(Arrays.asList(map));

        Gson gson = new Gson();
        String json = gson.toJson(map);
        Log.d(TAG, "onCreate: "+json);

      //  HashMap<String,Car> result =
        //        new ObjectMapper().readValue(JSON_SOURCE, HashMap.class);
        Map<String, Car> map2 = new Gson().fromJson(json, HashMap.class);
        car = new Car("Dodge", "Stealth");
map2.put("Three", car);
        Log.d(TAG, "onCreate2: "+Arrays.asList(map2));

    }
}
