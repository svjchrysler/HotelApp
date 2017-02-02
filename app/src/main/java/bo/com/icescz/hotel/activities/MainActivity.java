package bo.com.icescz.hotel.activities;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.badoualy.stepperindicator.StepperIndicator;

import bo.com.icescz.hotel.R;
import bo.com.icescz.hotel.adapters.CustomPagerAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @BindView(R.id.indicator)
    StepperIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        viewpager.setAdapter(new CustomPagerAdapter(this));
        indicator.setViewPager(viewpager);
        indicator.setStepCount(3);
        indicator.setCurrentStep(0);

    }

}
