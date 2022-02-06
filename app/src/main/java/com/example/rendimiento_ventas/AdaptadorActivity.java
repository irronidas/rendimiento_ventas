package com.example.rendimiento_ventas;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class AdaptadorActivity extends BaseAdapter {

    private static LayoutInflater  layoutInflater;
    Context contexto;
    String[] datos;
    int[] datosImg;
    //Consttructor
    public AdaptadorActivity (Context contexto, String[] Nombre, int[] imagenes)
    {
        this.contexto = contexto;
        this.datos = Nombre;
        this.datosImg = imagenes;
        layoutInflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }
    //este método crea y almacena la vista del nombre y la imagen
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = layoutInflater.inflate(R.layout.activity_adaptador, null);
        TextView Nombre = (TextView) vista.findViewById(R.id.txnombre);
        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView);
        Nombre.setText(datos[i]);
        imagen.setImageResource(datosImg[i]);
        return vista;
    }

    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}