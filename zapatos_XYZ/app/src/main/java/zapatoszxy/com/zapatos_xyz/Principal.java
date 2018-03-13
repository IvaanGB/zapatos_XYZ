package zapatoszxy.com.zapatos_xyz;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {
    private TextView resultado;
    private EditText cantidad;
    private Resources recursos;
    private Spinner genero, tipo, marca;
    private String opGen[], opTipo[], opMarca[];
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado=findViewById(R.id.txtTotal);
        cantidad=findViewById(R.id.txtCantidad);
        genero=findViewById(R.id.cmbGenero);
        tipo=findViewById(R.id.cmbTipo);
        marca=findViewById(R.id.cmbMarca);
        boton=findViewById(R.id.btnCotizar);

        recursos=this.getResources();

        opGen=recursos.getStringArray(R.array.genero);
        ArrayAdapter <String> gen=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opGen);
        genero.setAdapter(gen);

        opTipo=recursos.getStringArray(R.array.tipo);
        ArrayAdapter <String> tip=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opTipo);
        tipo.setAdapter(tip);

        opMarca=recursos.getStringArray(R.array.marcas);
        ArrayAdapter <String> marc=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opMarca);
        marca.setAdapter(marc);
    }

    public TextView errorSpinner(Spinner mySpinner, String error) {
        TextView errorText = (TextView) mySpinner.getSelectedView();
        errorText.setError("");
        errorText.setTextColor(Color.RED);
        errorText.setText(error);
        return errorText;
    }

    public boolean validarSpinner(Spinner spinner, String error){
        if (spinner.getSelectedItemPosition() == 0) {
            spinner.requestFocus();
            errorSpinner(spinner, error);
            return false;
        }
        return true;
    }

    public boolean validar(){
        if (!validarSpinner(genero, recursos.getString(R.string.errorGenero))){
            return false;
        }
        if (!validarSpinner(tipo, recursos.getString(R.string.errorTipo))){
            return false;
        }
        if (!validarSpinner(marca, recursos.getString(R.string.errorMarca))){
            return false;
        }

        if(cantidad.getText().toString().isEmpty() || Integer.parseInt(cantidad.getText().toString())<=0){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.errorCantidad));
            return false;
        }

        return true;
    }


    public void boton (View v){
        int precio=0;
        if (validar()==true){

            if (genero.getSelectedItemPosition()==1){
                precio= metodos.valorAPagar(metodos.preciosHombre(tipo.getSelectedItemPosition(),
                        marca.getSelectedItemPosition()), Integer.parseInt(cantidad.getText().toString()));
            }
            if (genero.getSelectedItemPosition()==2){
                precio= metodos.valorAPagar(metodos.preciosMujer(tipo.getSelectedItemPosition(),
                        marca.getSelectedItemPosition()), Integer.parseInt(cantidad.getText().toString()));
            }
                resultado.setText(recursos.getString(R.string.Total)+precio);
            }
        }

    }
