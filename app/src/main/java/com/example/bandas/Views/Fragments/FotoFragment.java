package com.example.bandas.Views.Fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bandas.R;

public class FotoFragment extends Fragment {

    //crio uma constante privada

    private static final String NOME = "nome";
    private static final String IMAGEM = "imagem";
    private TextView txtNomeAlbum;
    private ImageView imgAlbum;

    public FotoFragment() {
        //required empy constructor
    }

    //método que não precisa de instância para ser chamado e ele retorna um fragmento
    public static Fragment novaInstancia(int imagem, String nomeAlbum){

        FotoFragment fotoFragment = new FotoFragment();
        Bundle bundle = new Bundle();

        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeAlbum);

        fotoFragment.setArguments(bundle);

        return fotoFragment;

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.foto_fragment, container, false);

        initViews(view);

        if (getArguments()!=null){
            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imgAlbum.setImageDrawable(drawable);
            txtNomeAlbum.setText(nomeRecebido);
        }

        return view;
    }

    private void initViews(View view) {

        txtNomeAlbum = view.findViewById(R.id.textNomeAlbum);
        imgAlbum = view.findViewById(R.id.imageAlbum);


    }




}
