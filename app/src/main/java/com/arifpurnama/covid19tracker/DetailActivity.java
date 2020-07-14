package com.arifpurnama.covid19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry1, tvCases, tvRecovered, tvCritical, tvActive, tvTodayCases, tvTotalDeaths, tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Detail Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position", 0);

        tvCountry1 = findViewById(R.id.Country);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry1.setText(AffactedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffactedCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffactedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffactedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffactedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffactedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffactedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTodayDeaths.setText(AffactedCountries.countryModelList.get(positionCountry).getTodayDeaths());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}