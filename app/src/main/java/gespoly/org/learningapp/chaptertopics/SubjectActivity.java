package gespoly.org.learningapp.chaptertopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import gespoly.org.learningapp.R;
import gespoly.org.learningapp.chapter.five.javascript;
import gespoly.org.learningapp.chapter.one.android;
import gespoly.org.learningapp.chapter.one.java;
import gespoly.org.learningapp.chapter.two.php;


public class SubjectActivity extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String chapter1[] = {"Mad - Unit 1","Mad - Unit 2","Mad - Unit 3","Mad - Unit 4","Mad - Unit 5","Mad - Unit 6"};
    String chapter2[] = {"Py - Unit 1","Py - Unit 2","Py - Unit 3","Py - Unit 4","Py - Unit 5"};
    String chapter3[] = {"Php - Unit 1","Php - Unit 2","Php - Unit 3","Php - Unit 4","Php - Unit 5","Php - Unit 6"};
    String chapter4[] = {"MGT - Unit 1","MGT - Unit 2","MGT - Unit 3","MGT - Unit 4","MGT - Unit 5"};
    String chapter5[] = {"ETI - Unit 1","ETI - Unit 2","ETI - Unit 3","ETI - Unit 4","ETI - Unit 5","ETI - Unit 6"};
    String chapterName;
    TopicAdapter adapter;
    String arr[] = null;
    ImageView chapterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        toolbar = findViewById(R.id.toolbar);
        chapterImage = findViewById(R.id.chapter_image);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);

        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chapterName = getIntent().getStringExtra("chapterName");

        compareAndOpen();


    }

    private void compareAndOpen() {

        if(chapterName.equals("heading1")){
            arr = chapter1;
//            chapterImage.setImageResource(R.drawable.graph);
            Glide.with(SubjectActivity.this).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/Mobile-App.png?alt=media&token=2d32dcc0-f6d1-47b9-957c-da7139f0536c").into(chapterImage);
            getSupportActionBar().setTitle("heading1");
        }
        else if(chapterName.equals("heading2")){
            arr = chapter2;
//            chapterImage.setImageResource(R.drawable.graph);
            Glide.with(SubjectActivity.this).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(4).jpg?alt=media&token=3ec8b03d-b783-4bc1-9091-dc681ddde383").into(chapterImage);
            getSupportActionBar().setTitle("heading2");
        }
        else if(chapterName.equals("heading3")){
            arr = chapter3;
//            chapterImage.setImageResource(R.drawable.graph);
            Glide.with(SubjectActivity.this).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/brochure-flyer-paper-poster-logo-trademark-text-building-office-buildi.jpg?alt=media&token=ef3ca0e8-2964-4b20-98f9-9243badeada5").into(chapterImage);
            getSupportActionBar().setTitle("heading3");
        }
        else if(chapterName.equals("heading4")){
            arr = chapter4;
//            chapterImage.setImageResource(R.drawable.graph);
            Glide.with(SubjectActivity.this).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(5).jpg?alt=media&token=4134454b-89d3-4bfd-ac9d-79181bbb3ed4").into(chapterImage);
            getSupportActionBar().setTitle("heading4");
        }
        else if(chapterName.equals("heading5")){
            arr = chapter5;
//            chapterImage.setImageResource(R.drawable.graph);
            Glide.with(SubjectActivity.this).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(6).jpg?alt=media&token=c97d6bd7-9de3-437e-9850-629b79c9389a").into(chapterImage);
            getSupportActionBar().setTitle("heading5");
        }
        else {
            arr = null;
        }

        adapter = new TopicAdapter(arr, SubjectActivity.this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                openActivity(arr[i]);
            }
        });
    }

    private void openActivity(String s) {
        Intent intent = new Intent(SubjectActivity.this, java.class);
        switch (s){
            case "Mad - Unit 1":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Mad - Unit 1");
                startActivity(intent);
                break;
            case "Mad - Unit 2":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Mad - Unit 2");
                startActivity(intent);
                break;
            case "Mad - Unit 3":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Mad - Unit 3");
                startActivity(intent);
                break;
            case "Mad - Unit 4":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Mad - Unit 4");
                startActivity(intent);
                break;
            case "Mad - Unit 5":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Mad - Unit 5");
                startActivity(intent);
                break;
            case "Mad - Unit 6":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Mad - Unit 6");
                startActivity(intent);
                break;
            case "Py - Unit 1":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Py - Unit 1");
                startActivity(intent);
                break;
            case "Py - Unit 2":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Py - Unit 2");
                startActivity(intent);
                break;
            case "Py - Unit 3":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Py - Unit 3");
                startActivity(intent);
                break;
            case "Py - Unit 4":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Py - Unit 4");
                startActivity(intent);
                break;
            case "Py - Unit 5":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Py - Unit 5");
                startActivity(intent);
                break;
            case "Py - Unit 6":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Py - Unit 6");
                startActivity(intent);
                break;
            case "Php - Unit 1":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Php - Unit 1");
                startActivity(intent);
                break;
            case "Php - Unit 2":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Php - Unit 2");
                startActivity(intent);
                break;
            case "Php - Unit 3":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Php - Unit 3");
                startActivity(intent);
                break;
            case "Php - Unit 4":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Php - Unit 4");
                startActivity(intent);
                break;
            case "Php - Unit 5":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Php - Unit 5");
                startActivity(intent);
                break;
            case "Php - Unit 6":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "Php - Unit 6");
                startActivity(intent);
                break;
            case "MGT - Unit 1":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "MGT - Unit 1");
                startActivity(intent);
                break;
            case "MGT - Unit 2":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "MGT - Unit 2");
                startActivity(intent);
                break;
            case "MGT - Unit 3":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "MGT - Unit 3");
                startActivity(intent);
                break;
            case "MGT - Unit 4":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "MGT - Unit 4");
                startActivity(intent);
                break;
            case "MGT - Unit 5":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "MGT - Unit 5");
                startActivity(intent);
                break;
            case "MGT - Unit 6":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "MGT - Unit 6");
                startActivity(intent);
                break;
            case "ETI - Unit 1":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "ETI - Unit 1");
                startActivity(intent);
                break;
            case "ETI - Unit 2":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "ETI - Unit 2");
                startActivity(intent);
                break;
            case "ETI - Unit 3":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "ETI - Unit 3");
                startActivity(intent);
                break;
            case "ETI - Unit 4":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "ETI - Unit 4");
                startActivity(intent);
                break;
            case "ETI - Unit 5":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "ETI - Unit 5");
                startActivity(intent);
                break;
            case "ETI - Unit 6":
                startActivity(new Intent(SubjectActivity.this, java.class));
                intent.putExtra("unit", "ETI - Unit 6");
                startActivity(intent);
                break;

        }
    }

}