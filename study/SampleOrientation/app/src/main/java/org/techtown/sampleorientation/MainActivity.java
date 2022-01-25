package org.techtown.sampleorientation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate");

        editText = findViewById(R.id.editTextTextPersonName);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                name = editText.getText().toString();
                showToast("입력된 값을 변수에 저장했습니다 : " + name);
            }
        });

        if (savedInstanceState != null){
            name = editText.getText().toString();
            showToast("입력된 값을 변수에 저장했습니다 : " + name);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("name", name);
    }

    @Override
    protected void onStart() {
        super.onStart();

        showToast("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showToast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("onDestroy");
    }
    public void showToast(String data){
        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
    }
}