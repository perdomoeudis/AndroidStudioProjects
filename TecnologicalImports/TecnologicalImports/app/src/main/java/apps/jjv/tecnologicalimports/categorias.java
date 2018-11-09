package apps.jjv.tecnologicalimports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }
    //Metodo para el boton Categorias
    public void Categorias(View View){
        Intent categorias = new Intent(this, categorias.class);
        startActivity(categorias);
    }
    //Metodo para el boton Contactenos
    public void Contactenos(View View){
        Intent contactenos = new Intent(this, contactenos.class);
        startActivity(contactenos);
    }
    //Metodo para el boton Informacion
    public void Informacion(View View){
        Intent informacion = new Intent(this, informacion.class);
        startActivity(informacion);
    }
    //Metodo para el boton Login
    public void Login(View View){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }
}
