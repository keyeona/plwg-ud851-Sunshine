/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    private TextView WeatherView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        WeatherView = (TextView) findViewById(R.id.tv_weather_data);


        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weatherTypes = new String[20];
        weatherTypes[0] = "189512,31.71,-0.97";
        weatherTypes[1] = "189612,35.55,2.87";
        weatherTypes[2] = "189712,30.76,-1.92";
        weatherTypes[3] = "189812,28.67,-4.01";
        weatherTypes[4] = "189912,31.62,-1.06";
        weatherTypes[5] = "190012,34.48,1.80";
        weatherTypes[6] = "190112,31.48,-1.20";
        weatherTypes[7] = "190212,30.79,-1.89";
        weatherTypes[8] = "190312,30.54,-2.14";
        weatherTypes[9] = "190412,32.02,-0.66";
        weatherTypes[10] = "190512,30.99,-1.69";
        weatherTypes[11] = "190612,34.97,2.29";
        weatherTypes[12] = "190712,34.70,2.02";
        weatherTypes[13] = "190812,33.31,0.63";
        weatherTypes[14] = "190912,25.61,-7.07";
        weatherTypes[15] = "191012,31.93,-0.75";
        weatherTypes[16] = "191112,32.20,-0.48";
        weatherTypes[17] = "191212,32.95,0.27";
        weatherTypes[18] = "191312,33.33,0.65";
        weatherTypes[19] = "91412,26.78,-5.90";

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String WeatherDay : weatherTypes) {
            WeatherView.append(WeatherDay + "\n\n\n");
        }
    }
}