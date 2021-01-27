package materialdesign.sriyank.com.collapsingtoolbarlayout;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toolbar toolbar = findViewById(R.id.toolbar);
		toolbar.setTitle("Module 5");
		toolbar.inflateMenu(R.menu.menu_main);

		CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsingToolbar);
		collapsingToolbar.setTitle("Collapsing Toolbar");
	}
}
