package com.nalazoocare.dropdownt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.nalazoocare.dropdownt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        String[] COUNTRIES = new String[] {"Item 1", "Item 2", "Item 3", "Item 4"};

    ArrayAdapter<String> adapter =
            new ArrayAdapter<>(
                    this,
                    R.layout.dropdown_menu_popup_item,
                    COUNTRIES);

    AutoCompleteTextView editTextFilledExposedDropdown = binding.filledExposedDropdown;
        editTextFilledExposedDropdown.setAdapter(adapter);
}
}
