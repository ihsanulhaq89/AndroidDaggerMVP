package com.mvp.dagger.androiddaggermvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import javax.inject.Inject;

import static com.mvp.dagger.androiddaggermvp.R.string.error_msg;

/**
 * Created by Ihsanulhaq Pervez on 2/22/2017.
 */
public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    @Inject
    MainPresenter mainPresenter;

    Button go;
    EditText email;
    EditText password;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().mainPresenterModule(new MainPresenterModule(this)).build().inject(this);

        go = (Button) findViewById(R.id.go_button);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        go.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onHideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onError(String error) {
        Toast.makeText(this, error_msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(String data) {
        Toast.makeText(this, String.format("%s%s", new Object[]{data, getString(R.string.success_msg)}), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        mainPresenter.onButtonClick(email.getText().toString(), password.getText().toString());
    }
}
