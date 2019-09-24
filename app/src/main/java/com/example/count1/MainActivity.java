package com.example.count1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int integer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ビューグループのインスタンスの作成
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        //表示サイズをアクテぃビティ全体に設定
        linearLayout.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                )
        );
        //縦並びのレイアウトを設定
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //アクテビティ上へレイアウトを配置
        setContentView(linearLayout);

        textView = new TextView(this);
        textView.setText("ボタンをタップした数を数えます");
        //表示サイスの設定
        textView.setLayoutParams(
                new ViewGroup.LayoutParams(
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT
                )
        );
        //レイアウト上に配置
        linearLayout.addView(textView);

        Button button = new Button(this);
        button.setText("Button");
        //ボタンの表示サイズを設定
        button.setLayoutParams(
              new  ViewGroup.LayoutParams(
                      LayoutParams.WRAP_CONTENT,
                      LayoutParams.WRAP_CONTENT
              )
        );
        //イベントリスナーの登録
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(String.format("%d 回目", ++integer));
            }
        });
        //レイアウトグループ上に配置
        linearLayout.addView(button);

        Log.i("test","onCreate");

    }


}
