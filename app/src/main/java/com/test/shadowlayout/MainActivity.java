package com.test.shadowlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.github.shadowlayout.ShadowLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    ShadowLayout sl;

    private TextView tvShadowColorRed;
    private TextView tvShadowColorGray;
    private TextView tvBgColor1;
    private TextView tvBgColor2;
    private TextView tvBgColor3;

    private SeekBar sbShadowRange;
    private SeekBar sbBgOffsetLeft;
    private SeekBar sbBgOffsetTop;
    private SeekBar sbBgOffsetRight;
    private SeekBar sbBgOffsetBottom;
    private SeekBar sbShadowRadius;
    private SeekBar sbShadowRadiusLeft;
    private SeekBar sbShadowRadiusTop;
    private SeekBar sbShadowRadiusRight;
    private SeekBar sbShadowRadiusBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        final int shadowColor = ContextCompat.getColor(this, R.color.colorAccent);
        final int solidColor = ContextCompat.getColor(this, R.color.transparent);


        sbShadowRange.setOnSeekBarChangeListener(this);
        sbBgOffsetLeft.setOnSeekBarChangeListener(this);
        sbBgOffsetTop.setOnSeekBarChangeListener(this);
        sbBgOffsetRight.setOnSeekBarChangeListener(this);
        sbBgOffsetBottom.setOnSeekBarChangeListener(this);
        sbShadowRadius.setOnSeekBarChangeListener(this);
        sbShadowRadiusLeft.setOnSeekBarChangeListener(this);
        sbShadowRadiusTop.setOnSeekBarChangeListener(this);
        sbShadowRadiusRight.setOnSeekBarChangeListener(this);
        sbShadowRadiusBottom.setOnSeekBarChangeListener(this);


    }

    private void initView() {
        sl = findViewById(R.id.sl);
        tvShadowColorRed = findViewById(R.id.tvShadowColorRed);
        tvShadowColorGray = findViewById(R.id.tvShadowColorGray);
        tvBgColor1 = findViewById(R.id.tvBgColor1);
        tvBgColor2 = findViewById(R.id.tvBgColor2);
        tvBgColor3 = findViewById(R.id.tvBgColor3);
        tvShadowColorRed.setOnClickListener(this);
        tvShadowColorGray.setOnClickListener(this);
        tvBgColor1.setOnClickListener(this);
        tvBgColor2.setOnClickListener(this);
        tvBgColor3.setOnClickListener(this);


        sbShadowRange = findViewById(R.id.sbShadowRange);
        sbBgOffsetLeft = findViewById(R.id.sbBgOffsetLeft);
        sbBgOffsetTop = findViewById(R.id.sbBgOffsetTop);
        sbBgOffsetRight = findViewById(R.id.sbBgOffsetRight);
        sbBgOffsetBottom = findViewById(R.id.sbBgOffsetBottom);
        sbShadowRadius = findViewById(R.id.sbShadowRadius);
        sbShadowRadiusLeft = findViewById(R.id.sbShadowRadiusLeft);
        sbShadowRadiusTop = findViewById(R.id.sbShadowRadiusTop);
        sbShadowRadiusRight = findViewById(R.id.sbShadowRadiusRight);
        sbShadowRadiusBottom = findViewById(R.id.sbShadowRadiusBottom);

        sbShadowRange.setProgress((int) sl.getShadowRange());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvShadowColorRed:
                sl.setShadowColor(Color.parseColor("#cc0000"));
                break;
            case R.id.tvShadowColorGray:
                sl.setShadowColor(Color.parseColor("#b9cccccc"));
                break;
            case R.id.tvBgColor1:
                sl.setSolidColor(ContextCompat.getColor(this, R.color.colorPrimary));
                break;
            case R.id.tvBgColor2:
                sl.setSolidColor(ContextCompat.getColor(this, R.color.c_press_bt));
                break;
            case R.id.tvBgColor3:
                sl.setSolidColor(ContextCompat.getColor(this, R.color.white));
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.sbShadowRange:
                sl.setShadowRange(progress);
                break;
            case R.id.sbBgOffsetLeft:
                sl.setShadowOffsetLeft(progress);
                break;
            case R.id.sbBgOffsetTop:
                sl.setShadowOffsetTop(progress);
                break;
            case R.id.sbBgOffsetRight:
                sl.setShadowOffsetRight(progress);
                break;
            case R.id.sbBgOffsetBottom:
                sl.setShadowOffsetBottom(progress);
                break;
            case R.id.sbShadowRadius:
                sl.setShadowRadius(progress);
                sbShadowRadiusLeft.setProgress(progress);
                sbShadowRadiusTop.setProgress(progress);
                sbShadowRadiusRight.setProgress(progress);
                sbShadowRadiusBottom.setProgress(progress);
                break;
            case R.id.sbShadowRadiusLeft:
                sl.setShadowTopLeftRadius(progress);
                break;
            case R.id.sbShadowRadiusTop:
                sl.setShadowTopRightRadius(progress);
                break;
            case R.id.sbShadowRadiusRight:
                sl.setShadowBottomRightRadius(progress);
                break;
            case R.id.sbShadowRadiusBottom:
                sl.setShadowBottomLeftRadius(progress);
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
