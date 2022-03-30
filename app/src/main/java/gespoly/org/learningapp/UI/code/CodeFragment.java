package gespoly.org.learningapp.UI.code;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;
import gespoly.org.learningapp.R;


public class CodeFragment extends Fragment implements View.OnClickListener{



    public CodeFragment() {
        // Required empty public constructor
    }

    CircleImageView image1, image2, image3, image4, image5, image6,image7, image8, image9;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_code, container, false);

        image1 = view.findViewById(R.id.chapter1);
        image2 = view.findViewById(R.id.chapter2);
        image3 = view.findViewById(R.id.chapter3);
        image4 = view.findViewById(R.id.chapter4);
        image5 = view.findViewById(R.id.chapter5);
        image6 = view.findViewById(R.id.chapter6);
        image7 = view.findViewById(R.id.chapter7);
        image8 = view.findViewById(R.id.chapter8);
        image9 = view.findViewById(R.id.chapter9);

        loadImage();
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);


        return view;
    }

    private void loadImage() {
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/py.jpg?alt=media&token=8c766591-3b2a-46ce-bc73-b1543ed00620").into(image1);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/java.png?alt=media&token=53bb8841-bc9c-4cdd-8e3c-f71546d60759").into(image2);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/php.png?alt=media&token=2c33a4be-d6fa-4f1a-8a89-981c9eda6460").into(image3);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(2).png?alt=media&token=27345d14-2a58-45d5-9051-29694fa9fd34").into(image4);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/1200px-ISO_C%2B%2B_Logo.svg.png?alt=media&token=f4211482-0f03-4c61-9266-475b3fcf07ed").into(image5);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/VB.NET_Logo.svg.png?alt=media&token=c988ec56-ba54-48ea-9ec1-513e53a64a68").into(image6);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/kotlin.jpg?alt=media&token=323cf89b-80f3-4618-8c31-90b458cb7641").into(image7);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/dart.png?alt=media&token=f71f34a3-2964-4d12-942d-88c0fadefa98").into(image8);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/js.png?alt=media&token=678b0098-9843-474f-9d3a-6c6cf014ee50").into(image9);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(),CodeCategory.class);
        switch (view.getId()){
            case R.id.chapter1:
                intent.putExtra("codeCategory", "chapter1");
                startActivity(intent);
                break;
            case R.id.chapter2:
                intent.putExtra("codeCategory", "chapter2");
                startActivity(intent);
                break;
            case R.id.chapter3:
                intent.putExtra("codeCategory", "chapter3");
                startActivity(intent);
                break;
            case R.id.chapter4:
                intent.putExtra("codeCategory", "chapter4");
                startActivity(intent);
                break;
            case R.id.chapter5:
                intent.putExtra("codeCategory", "chapter5");
                startActivity(intent);
                break;
            case R.id.chapter6:
                intent.putExtra("codeCategory", "chapter6");
                startActivity(intent);
                break;
            case R.id.chapter7:
                intent.putExtra("codeCategory", "chapter7");
                startActivity(intent);
                break;
            case R.id.chapter8:
                intent.putExtra("codeCategory", "chapter8");
                startActivity(intent);
                break;
            case R.id.chapter9:
                intent.putExtra("codeCategory", "chapter9");
                startActivity(intent);
                break;

        }
    }
}