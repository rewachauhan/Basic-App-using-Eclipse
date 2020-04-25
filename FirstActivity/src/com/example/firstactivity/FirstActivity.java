package com.example.firstactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class FirstActivity extends Activity {
EditText et1;
TextView tv;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        et1=(EditText) findViewById(R.id.editText1);
        tv=(TextView) findViewById(R.id.textView3);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name=et1.getText().toString();
				tv.setText(name);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
}
