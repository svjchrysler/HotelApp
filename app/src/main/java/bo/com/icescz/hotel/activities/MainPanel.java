package bo.com.icescz.hotel.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import bo.com.icescz.hotel.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainPanel extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_panel);
        ButterKnife.bind(this);
        configInit();
    }

    private void configInit() {
        configToolbar();
    }

    private void configToolbar() {
        toolbar.setTitle("Los Tajibos");
        setSupportActionBar(toolbar);
    }
}
