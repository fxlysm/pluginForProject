package com.kazam.quickcreat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
// compile 'com.jakewharton:butterknife:8.0.1'
//    https://github.com/JakeWharton/butterknife
public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.line1)
    LinearLayout line1;
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.line2)
    LinearLayout line2;
    @BindView(R.id.text3)
    TextView text3;
    @BindView(R.id.line3)
    LinearLayout line3;
    @BindView(R.id.btn)
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.line1, R.id.line2, R.id.line3, R.id.btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.line1:
                text.setText("click lin1");
                break;
            case R.id.line2:
                text2.setText("click lin2");
                break;
            case R.id.line3:
                text3.setText("click lin3");
                break;
            case R.id.btn:
                Toast.makeText(this,"Btn",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
