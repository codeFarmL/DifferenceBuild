package org.codefarml.differencebuild;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.codefarml.common.IHandle;

public class MainActivity extends AppCompatActivity {

    Button mBtnFlavors; //仅仅通过渠道
    Button mBtnReflexAndFlavors; //通过渠道和反射
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnFlavors = findViewById(R.id.btnFlavors);
        mBtnFlavors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.showToast(MainActivity.this);
            }
        });

        mBtnReflexAndFlavors = findViewById(R.id.btnReflexAndFlavors);
        mBtnReflexAndFlavors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IHandle handleImpl = ReflexBuildUtils.handleReflexBuild(BuildConfig.FLAVOR);
                if(handleImpl != null){
                    handleImpl.showToast(MainActivity.this);
                }

            }
        });
    }


}