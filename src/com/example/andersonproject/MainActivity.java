package com.example.andersonproject;

import javax.security.auth.PrivateCredentialPermission;

import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText editText1;
	private Button button1;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        editText1 = (EditText)findViewById(R.id.editText1);
        button1 = (Button)findViewById(R.id.button1);
        
        button1.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("debug", "click");
				sendMessage();
			}

			
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
        
    }
    
    private void sendMessage() {
		// TODO Auto-generated method stub
		Editable editable = editText1.getText();
		String editText1 = editable.toString();
//		if (isEncrypt.isChecked()) {
//			text = "************";
//		}
		editable.clear();
		Toast.makeText(this, (CharSequence) editText1, Toast.LENGTH_SHORT).show();
	}
}
