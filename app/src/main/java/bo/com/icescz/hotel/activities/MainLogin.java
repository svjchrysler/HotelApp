package bo.com.icescz.hotel.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hkm.ui.processbutton.iml.ActionProcessButton;

import bo.com.icescz.hotel.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainLogin extends AppCompatActivity {

    @BindView(R.id.btnLogin)
    ActionProcessButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        ButterKnife.bind(this);
        configInit();
    }

    private void configInit() {
        configComponents();
    }

    private void configComponents() {
        btnLogin.setCompleteText("Iniciado");
        btnLogin.setText("Iniciando");
        btnLogin.setMode(ActionProcessButton.Mode.ENDLESS);
        btnLogin.setOnCompleteColorButton(R.color.blue_normal, R.color.blue_pressed);
        btnLogin.setOnClickCompleteState(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainLogin.this, MainPanel.class));
                finish();
            }
        }).build();
    }
}
