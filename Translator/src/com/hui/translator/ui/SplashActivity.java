package com.hui.translator.ui;

import com.hui.translator.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/**
 * ��ӭ����
 */
public class SplashActivity extends Activity  {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		
		//2����ת��������
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				startActivity(new Intent(SplashActivity.this, MainActivity.class));
				finish();
				
			}
		}, 2000);
	}
}
