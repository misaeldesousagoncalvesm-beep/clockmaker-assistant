
package com.clockmaker.assistant;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(35, 45, 35, 35);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(16, 21, 37));

        TextView title = new TextView(this);
        title.setText("⚙ CLOCKMAKER ASSISTANT");
        title.setTextSize(24);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        status = new TextView(this);
        status.setText("Assistente pronto");
        status.setTextColor(Color.WHITE);
        status.setTextSize(17);
        status.setPadding(10, 30, 10, 30);

        Button button = new Button(this);
        button.setText("Preparar análise");

        button.setOnClickListener(v -> {
            status.setText(
                "Interface Android funcionando. " +
                "Reconhecimento do tabuleiro ainda não integrado."
            );
        });

        layout.addView(title);
        layout.addView(status);
        layout.addView(button);

        setContentView(layout);
    }
}
