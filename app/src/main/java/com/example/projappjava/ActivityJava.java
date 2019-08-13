package com.example.projappjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class ActivityJava extends AppCompatActivity {

    public static final HashMap<String, String> usuariosMap = new HashMap<>();

    EditText editTextLogin;
    EditText editTextPass;
    Button btnLimpar;
    Button btnOk;

    {
        usuariosMap.put("nin", "214");
        usuariosMap.put("choc", "123");
        usuariosMap.put("sick", "124");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPass = findViewById(R.id.editTextPass);
        btnLimpar = findViewById(R.id.btnLimaparCampos);
        btnOk = findViewById(R.id.btnOk);

        this.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nomeDeUsuarioInformado = editTextLogin.getText().toString();
                String senhaDeUsuarioInformado = editTextPass.getText().toString();

                Toast.makeText(getApplicationContext(),
                        "editTextlogin.getText()=" + editTextLogin.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText()=" + editTextPass.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "editTextlogin.getText().toString()=" + editTextLogin.getText().toString(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText().toString()=" + editTextLogin.getText().toString(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "senhaDeUsuarioInformada=" + senhaDeUsuarioInformado,
                        Toast.LENGTH_LONG).show();

                //se a chave nomeDeUsuarioInformada existir, get retorna a senha
                String passwCadastrado = ActivityJava.usuariosMap.get(nomeDeUsuarioInformado);

                if (passwCadastrado != null && passwCadastrado.equals(senhaDeUsuarioInformado)) {
                    Toast.makeText(getApplicationContext(), "Login Sucesso!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Falhou!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
