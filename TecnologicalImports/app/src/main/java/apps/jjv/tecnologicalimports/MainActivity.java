package apps.jjv.tecnologicalimports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        //Metodo para el boton Productos
        public void Productos(View View){
            Intent productos = new Intent(this, productos.class);
            startActivity(productos);
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
    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionMenu (Menu menu){
        getMenuInflater().inflate(R.menu.opciones, menu);
        return true;
    }
    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOpcionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.item1){
            Toast.makeText( this,  "Opcion 1", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item2){
            Toast.makeText(this, "Opcion 2", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item3){
            Toast.makeText(this, "Opcion 3", Toast.LENGTH_LONG).show();
        }
        return  super.onOptionsItemSelected(item);
    }
}



