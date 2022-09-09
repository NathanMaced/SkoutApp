package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declarar as variaveis globais que irão representar os objetos xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Abrindo a janela activity_main

        setContentView(R.layout.activity_main);
        //apresentar ao java os componentes xml
        edtSenha = findViewById(R.id.edtSenha);
        edtUsuario = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        //criando a ação do botão sair
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Criando a variavel
                String usuario, senha;

                //Atribuindo valores para a variavel
                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                //validadando o usuario

                if (usuario.equals("etecia") && senha.equals("etecia")){

                } else {Toast.makeText(getApplicationContext(),"Usuario ou senha ivalidos!",Toast.LENGTH_SHORT).show();}


            }
        });
    }
}