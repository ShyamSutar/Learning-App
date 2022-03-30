package gespoly.org.learningapp.UI.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import gespoly.org.learningapp.R;
import gespoly.org.learningapp.chaptertopics.SubjectActivity;

public class HomeFragment extends Fragment implements View.OnClickListener{


    public HomeFragment() {
        // Required empty public constructor
    }

    CardView heading1, heading2,heading3,heading4,heading5;
    ImageView image1,image2,image3,image4,image5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        heading1 = view.findViewById(R.id.heading1);
        heading2 = view.findViewById(R.id.heading2);
        heading3 = view.findViewById(R.id.heading3);
        heading4 = view.findViewById(R.id.heading4);
        heading5 = view.findViewById(R.id.heading5);


        heading1.setOnClickListener(this);
        heading2.setOnClickListener(this);
        heading3.setOnClickListener(this);
        heading4.setOnClickListener(this);
        heading5.setOnClickListener(this);


        image1 = view.findViewById(R.id.image1);
        image2 = view.findViewById(R.id.image2);
        image3 = view.findViewById(R.id.image3);
        image4 = view.findViewById(R.id.image4);
        image5 = view.findViewById(R.id.image5);


        loadImage();


        return view;
    }

    private void loadImage() {
      Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/Mobile-App.png?alt=media&token=2d32dcc0-f6d1-47b9-957c-da7139f0536c").into(image1);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(4).jpg?alt=media&token=3ec8b03d-b783-4bc1-9091-dc681ddde383").into(image2);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/brochure-flyer-paper-poster-logo-trademark-text-building-office-buildi.jpg?alt=media&token=ef3ca0e8-2964-4b20-98f9-9243badeada5").into(image3);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(5).jpg?alt=media&token=4134454b-89d3-4bfd-ac9d-79181bbb3ed4").into(image4);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/learning-app-f2d63.appspot.com/o/download%20(6).jpg?alt=media&token=c97d6bd7-9de3-437e-9850-629b79c9389a").into(image5);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getContext(),SubjectActivity.class);

        switch (view.getId()){
            case R.id.heading1:
                intent.putExtra("chapterName", "heading1");
                startActivity(intent);
                break;
            case R.id.heading2:
                intent.putExtra("chapterName", "heading2");
                startActivity(intent);
                break;
            case R.id.heading3:
                intent.putExtra("chapterName", "heading3");
                startActivity(intent);
                break;
            case R.id.heading4:
                intent.putExtra("chapterName", "heading4");
                startActivity(intent);
                break;
            case R.id.heading5:
                intent.putExtra("chapterName", "heading5");
                startActivity(intent);
                break;
        }

    }
}