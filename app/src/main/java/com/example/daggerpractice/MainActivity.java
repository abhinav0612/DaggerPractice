package com.example.daggerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
   @Inject
   ApiService apiService;

   @Inject
   User user;
    private static final String TAG = "MainActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //<------------------Using the base application class for application scope of component-------------------------->
        //((BaseApplication)getApplicationContext()).getApplicationComponent.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //<------------------Directly accessing the component for activity scope of component------------------------------>
        ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
                .userName("Abhinav")
                .useId(12)
                .build();
        applicationComponent.inject(this);

      /*  Call<List<Post>> call = apiService.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                for(Post post : response.body()){
                    textView.append("Title: " + post.getTitle() +"\n");
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });*/

      textView.setText("Name: " + user.getName()+" Id: " + user.getId());

    }
}
