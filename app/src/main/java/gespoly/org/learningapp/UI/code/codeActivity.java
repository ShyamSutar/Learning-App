package gespoly.org.learningapp.UI.code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import gespoly.org.learningapp.R;
//import thereisnospon.codeview.CodeView;
//import thereisnospon.codeview.CodeViewTheme;

public class codeActivity extends AppCompatActivity {

//    CodeView codeView;
    TextView codeView;
    String code = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        codeView = findViewById(R.id.codeView);
//        codeView.setText(""+"class hello{\n"+"public static void main(String args{}){\n");
//        codeView = findViewById(R.id.code_view);
//        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO);

        loadPrograms();
    }

    private void loadPrograms() {
        switch (getIntent().getStringExtra("position")){
            case "Write a program to convert U.S. dollars to Indian rupees.":
                code = ProgramExample.ex1;
                break;
            case"chapter2":
                code = ProgramExample.ex2;
                break;
        }
        codeView.setText(code);
    }
}