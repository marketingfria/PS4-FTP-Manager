package com.ps4ftp.manager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editIp;
    private EditText editPort;
    private TextView textStatus;
    private Button buttonConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editIp = findViewById(R.id.editIp);
        editPort = findViewById(R.id.editPort);
        textStatus = findViewById(R.id.textStatus);
        buttonConnect = findViewById(R.id.buttonConnect);

        buttonConnect.setOnClickListener(view -> {

            String ip = editIp.getText().toString().trim();
            String port = editPort.getText().toString().trim();

            if (ip.isEmpty()) {

                Toast.makeText(
                        MainActivity.this,
                        "Introduce la IP de tu PS4",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            if (port.isEmpty()) {
                port = "2121";
            }

            textStatus.setText(
                    "Preparado para conectar a " +
                    ip +
                    ":" +
                    port
            );

            Toast.makeText(
                    MainActivity.this,
                    "Configuración correcta",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
