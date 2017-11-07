package com.example.kwon_younghoon.o_cardnews;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class DialogLiscense extends Dialog {
    private Button mCloseButton, nextButton, backButton;
    private ImageView i1,i2,i3,i4,i5;
    private Context context;
    private int i = 1;
    private View.OnClickListener mCloseClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow_inf = new WindowManager.LayoutParams();
        lpWindow_inf.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow_inf.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow_inf);

        setContentView(R.layout.activity_dialog_liscense);

        mCloseButton = (Button) findViewById(R.id.dialog_close2);
        mCloseButton.setBackgroundResource(R.drawable.ic_action_remove);
        nextButton = (Button)findViewById(R.id.f_btn);
        nextButton.setBackgroundResource(R.drawable.ic_action_next_item);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i<6) i++;
                init();
            }
        });
        backButton = (Button)findViewById(R.id.b_btn);
        backButton.setBackgroundResource(R.drawable.ic_action_previous_item);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i>0) i--;
                init();
            }
        });

        i1 = (ImageView)findViewById(R.id.l1);
        i2 = (ImageView)findViewById(R.id.l2);
        i3 = (ImageView)findViewById(R.id.l3);
        i4 = (ImageView)findViewById(R.id.l4);
        i5 = (ImageView)findViewById(R.id.l5);

        // 클릭 이벤트 셋팅
        mCloseButton.setOnClickListener(mCloseClickListener);
    }

    // 클릭버튼이 하나일때 생성자 함수로 클릭이벤트를 받는다.
    public DialogLiscense(Context context,
                           View.OnClickListener closeListener) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.mCloseClickListener = closeListener;
        this.context = context;
    }

    void init(){
        switch (i){
            case 1:
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                break;
            case 2:
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.GONE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                break;
            case 3:
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.VISIBLE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                break;
            case 4:
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i4.setVisibility(View.VISIBLE);
                i5.setVisibility(View.GONE);
                break;
            case 5:
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.VISIBLE);
                break;
        }
    }
}
