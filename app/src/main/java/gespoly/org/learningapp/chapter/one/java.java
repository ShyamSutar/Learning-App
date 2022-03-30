package gespoly.org.learningapp.chapter.one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import gespoly.org.learningapp.R;

public class java extends AppCompatActivity {

    private ImageView imageView;
    String units;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        imageView = findViewById(R.id.imageView22);

        units = getIntent().getStringExtra("unit");

        if(units.equals("Mad - Unit 1")){
            imageView.setImageResource(R.drawable.madu1);
        }
        else if(units.equals("Mad - Unit 2")){
            imageView.setImageResource(R.drawable.madu2);
        }
        else if(units.equals("Mad - Unit 3")){
            imageView.setImageResource(R.drawable.madu3);
        }
        else if(units.equals("Mad - Unit 4")){
            imageView.setImageResource(R.drawable.madu4);
        }
        else if(units.equals("Mad - Unit 5")){
            imageView.setImageResource(R.drawable.madu5);
        }
        else if(units.equals("Mad - Unit 6")){
            imageView.setImageResource(R.drawable.madu6);
        }

        else if(units.equals("Py - Unit 1")){
            imageView.setImageResource(R.drawable.py1);
        }
        else if(units.equals("Py - Unit 2")){
            imageView.setImageResource(R.drawable.py2);
        }
        else if(units.equals("Py - Unit 3")){
            imageView.setImageResource(R.drawable.py3);
        }
        else if(units.equals("Py - Unit 4")){
            imageView.setImageResource(R.drawable.py4);
        }
        else if(units.equals("Py - Unit 5")){
            imageView.setImageResource(R.drawable.py5);
        }
        else if(units.equals("Py - Unit 6")){
            imageView.setImageResource(R.drawable.py6);
        }

        else if(units.equals("Php - Unit 1")){
            imageView.setImageResource(R.drawable.php1);
        }
        else if(units.equals("Php - Unit 2")){
            imageView.setImageResource(R.drawable.php2);
        }
        else if(units.equals("Php - Unit 3")){
            imageView.setImageResource(R.drawable.php3);
        }
        else if(units.equals("Php - Unit 4")){
            imageView.setImageResource(R.drawable.php4);
        }
        else if(units.equals("Php - Unit 5")) {
            imageView.setImageResource(R.drawable.php5);
        }

        else if(units.equals("MGT - Unit 1")){
            imageView.setImageResource(R.drawable.mgt1);
        }
        else if(units.equals("MGT - Unit 2")){
            imageView.setImageResource(R.drawable.mgt2);
        }
        else if(units.equals("MGT - Unit 3")){
            imageView.setImageResource(R.drawable.mgt3);
        }
        else if(units.equals("MGT - Unit 4")){
            imageView.setImageResource(R.drawable.mgt4);
        }
        else if(units.equals("MGT - Unit 5")){
            imageView.setImageResource(R.drawable.mgt5);
        }

        else if(units.equals("ETI - Unit 1")){
            imageView.setImageResource(R.drawable.eti1);
        }
        else if(units.equals("ETI - Unit 2")){
            imageView.setImageResource(R.drawable.eti2);
        }
        else if(units.equals("ETI - Unit 3")){
            imageView.setImageResource(R.drawable.eti3);
        }
        else if(units.equals("ETI - Unit 4")){
            imageView.setImageResource(R.drawable.eti4);
        }
        else if(units.equals("ETI - Unit 5")){
            imageView.setImageResource(R.drawable.eti5);
        }
        else if(units.equals("ETI - Unit 6")){
            imageView.setImageResource(R.drawable.eti6);
        }
    }
}