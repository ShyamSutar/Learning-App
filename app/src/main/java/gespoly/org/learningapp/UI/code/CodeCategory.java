package gespoly.org.learningapp.UI.code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.security.SecureRandom;

import gespoly.org.learningapp.R;

public class CodeCategory extends AppCompatActivity {

    ListView programs;
    String[] list ;
//            = {"aldskfjasjdfljsdfa;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_category);

        loadCatergory();

        programs = findViewById(R.id.programs);

        CustomAdapter adapter = new CustomAdapter();
        programs.setAdapter(adapter);

        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CodeCategory.this, codeActivity.class);
                intent.putExtra("position",list[i]);
                startActivity(intent);
            }
        });

    }

    private void loadCatergory() {
        final String chap1[] = {"Write a program to convert U.S. dollars to Indian rupees.","Write a program to find the area of Rectangle", "Write a Python program to reverse a list.", "Write a program to check the largest number among the three numbers", "Find the Sum of First 10 Natural Numbers Using For Loop.", "Write a program to check whether a number is even or odd.","Write a Python Program to Reverse a Given Number"};
        final String chap2[] = {"Write any Program to check multiple conditions using if statement","Write any program using switch-case statement","DEVELOP PROGRAM FOR IMPLEMENTATION OF CONSTRUCTOR AND MULTIPLE CONSTRUCTOR","DEVELOP PROGRAM FOR IMPLEMENTATION OF DIFFERENT FUNCTIONS OF STRING CLASS","DEVELOP PROGRAM FOR IMPLEMENTATION OF ARRAYS IN JAVA","DEVELOP PROGRAM FOR IMPLEMENTATION OF VECTORS IN JAVA","WRITE THE PROGRAM TO DEMONSTRATE THE USE OF FOR-EACH VERSION OF FOR LOOP IN JAVA","CHECK IP ADDRESS PATTERN USING REGEX MATCH IN JAVA"};
        final String chap3[] = {"Write a program for factorial in php","Write a program for Even and Odd in php","PHP program to check for an Armstrong number"};
        final String chap4[] = {"4;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};
        final String chap5[] = {"5;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};
        final String chap6[] = {"6;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};
        final String chap7[] = {"7;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};
        final String chap8[] = {"8;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};
        final String chap9[] = {"9;;a daslkfj sfd", "sdjaflsajdlfjs laksdjf jsadf sajd", "jkfasklj f asdlfj lsadf js","jksdaflkjas ljsda fljsad fj fdsaj ","ksldfj sd fsdj fsd fskdfa?"};


        String category = getIntent().getStringExtra("codeCategory");
        switch (category) {
            case "chapter1":
                list = chap1;
                break;
            case "chapter2":
                list = chap2;
                break;
            case "chapter3":
                list = chap3;
                break;
            case "chapter4":
                list = chap4;
                break;
            case "chapter5":
                list = chap5;
                break;
            case "chapter6":
                list = chap6;
                break;
            case "chapter7":
                list = chap7;
                break;
            case "chapter8":
                list = chap8;
                break;
            case "chapter9":
                list = chap9;
                break;
        }
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.code_category_item_layout,null);

            TextView textView = view.findViewById(R.id.codeTitle);
            textView.setText(list[i]);
            return view;
        }
    }
}