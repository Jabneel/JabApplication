package com.javacodegeeks.androidcanvasexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Canvas;

public class AndroidCanvasExample extends Activity {

    private CanvasView customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCanvas = (CanvasView) findViewById(R.id.signature_canvas);

        Button clearBtn = (Button)findViewById(R.id.button1);
        clearBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearCanvas(v);
            }

        });
    }

    public void clearCanvas(View v ){
        customCanvas.wipeCanvas();
    }


}