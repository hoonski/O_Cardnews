package com.example.kwon_younghoon.o_cardnews;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class DialogLiscense extends Dialog {
    private Button mCloseButton;
    private Context context;
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
        mCloseButton.setBackgroundResource(R.drawable.ic_action_back);

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

}
