package ru.mirea.lukaninava.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textViewStudent = findViewById(R.id.textViewStudent);
        Button btnWhoAmI = findViewById(R.id.btnWhoAmI);
        Button btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 14");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);


        };

        public void onMyButtonClick(View view) {
            TextView textViewStudent = findViewById(R.id.textViewStudent);
            textViewStudent.setText("Это сделал не я!");
        }

}