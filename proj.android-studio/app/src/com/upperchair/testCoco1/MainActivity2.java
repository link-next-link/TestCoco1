package com.upperchair.testCoco1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main);

        findViewById( R.id.button ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent( v.getContext(), CocosActivity.class);
                startActivity( intent);
            }
        } );
    }
}
