package com.example.horario;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends Activity {
	
	//[]
	
	//EditText[12] array;
	Button btn;
	private final static String TAGNAME = "MainActivityHereIam";
	List<EditText> arrayA = new ArrayList<EditText>();
	List<EditText> arrayB = new ArrayList<EditText>();
	List<EditText> arrayC = new ArrayList<EditText>();
	int [] listA = new int[11];int [] listB = new int[11];
	int [] listC = new int[11];
	EditText edtA,edtB,edtC,edt3,edt4,edt5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button) findViewById(R.id.btnsave);
		
		listA[0] = R.id.editText2a;listA[1] = R.id.editText3a;listA[2] = R.id.editText4a;
		listA[3] = R.id.editText5a;listA[4] = R.id.editText6a;listA[5] = R.id.editText7a;
		listA[6] = R.id.editText8a;listA[7] = R.id.editText9a;listA[8] = R.id.editText10a;
		listA[9] = R.id.editText11a;listA[10] = R.id.editText12a;
		
		listB[0] = R.id.editText2b;listB[1] = R.id.editText3b;listB[2] = R.id.editText4b;
		listB[3] = R.id.editText5b;listB[4] = R.id.editText6b;listB[5] = R.id.editText7b;
		listB[6] = R.id.editText8b;listB[7] = R.id.editText9b;listB[8] = R.id.editText10b;
		listB[9] = R.id.editText11b;listB[10] = R.id.editText12b;
		
		listC[0] = R.id.editText2c;listC[1] = R.id.editText3c;listC[2] = R.id.editText4c;
		listC[3] = R.id.editText5c;listC[4] = R.id.editText6c;listC[5] = R.id.editText7c;
		listC[6] = R.id.editText8c;listC[7] = R.id.editText9c;listC[8] = R.id.editText10c;
		listC[9] = R.id.editText11c;listC[10] = R.id.editText12c;
		
		for (int i=0;i<11;i++){
			edtA = (EditText) findViewById(listA[i]);
			edtB = (EditText) findViewById(listB[i]);
			edtC = (EditText) findViewById(listC[i]);
			arrayA.add(edtA);
			arrayB.add(edtB);
			arrayC.add(edtC);
		}
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void Save(View view){
		for(int i=0;i<11;i++){
			arrayA.get(i).setEnabled(false);
			arrayB.get(i).setEnabled(false);
			arrayC.get(i).setEnabled(false);
		}
		btn.setText(arrayA.get(0).getText().toString());
		//edt.setEnabled(false);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}



	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(TAGNAME, "On Resumen method");
	}


	

}
