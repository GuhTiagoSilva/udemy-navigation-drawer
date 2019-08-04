package com.example.atmconsultoria.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atmconsultoria.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imgLogoAtm.setImageResource(R.drawable.logo);
        holder.instagram.setText("Follow us on instagram");
        holder.curtirFacebook.setText("Like us on Facebook");
        holder.gitHub.setText("Fork us on GitHub");
        holder.playStore.setText("Rate us on PlayStore");
        holder.seguirTwitter.setText("Follow us on Twitter");
        holder.descricao.setText("Estamos sediados em Paços de Ferreira e operamos no mercado desde 2005, abrangendo toda a área do território nacional. Somos constituídos por uma equipa jovem e dinâmica, altamente qualificada e multidisciplinar, para dar uma resposta rápida e eficaz a todas as necessidades das empresas, e dessa forma assegurar uma prestação de serviços de qualidade, satisfazendo as expetativas dos nossos clientes.");
        holder.visitarWebSite.setText("Visit our website");
        holder.faleConosco.setText("Fale conosco");
        holder.contato.setText("Contact Us");
        holder.youtube.setText("Watch us on Youtube");

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgLogoAtm;
        private TextView descricao, descricao2, faleConosco, contato, visitarWebSite, curtirFacebook, seguirTwitter, youtube, playStore, gitHub, instagram;


        public MyViewHolder(@NonNull View view) {
            super(view);

            imgLogoAtm = view.findViewById(R.id.imgLogoAtm);
            descricao = view.findViewById(R.id.textDescricao);
            faleConosco = view.findViewById(R.id.textFaleConosco);
            contato = view.findViewById(R.id.textContato);
            visitarWebSite = view.findViewById(R.id.textVisitarWebSite);
            curtirFacebook = view.findViewById(R.id.textFacebook);
            seguirTwitter = view.findViewById(R.id.textTwitter);
            youtube = view.findViewById(R.id.textYoutube);
            playStore = view.findViewById(R.id.textPlayStore);
            gitHub = view.findViewById(R.id.textGitHub);
            instagram = view.findViewById(R.id.textInstagram);


        }
    }

}
