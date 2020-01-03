package com.titanz.titanztech.view;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.titanz.titanztech.R;
import com.titanz.titanztech.adapters.PromocoesAdapter;
import com.titanz.titanztech.interfaces.PromocoesListener;
import com.titanz.titanztech.models.Promocoes;

import java.util.ArrayList;


public class FragmentPromocoes extends Fragment implements PromocoesListener {

    private RecyclerView recyclerViewPromocoes;
    private PromocoesAdapter promocoesAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.promocoes_fragment,container,false);

        ArrayList<Promocoes> promocoesArrayList = new ArrayList<>();

        Promocoes promocoes1 = new Promocoes();
        promocoes1.setNome("Aplicativo Android Comercial");
        promocoes1.setValor("R$ 500,00");
        promocoesArrayList.add(promocoes1);

        Promocoes promocoes2 = new Promocoes();
        promocoes2.setNome("Formatação + Limpeza - Notebook ");
        promocoes2.setValor("R$ 120,00");
        promocoesArrayList.add(promocoes2);

        Promocoes promocoes3 = new Promocoes();
        promocoes3.setNome("Formatação + Limpeza - Desktop");
        promocoes3.setValor("R$ 100,00");
        promocoesArrayList.add(promocoes3);

        Promocoes promocoes4 = new Promocoes();
        promocoes4.setNome("Formatação + SSD 120GB");
        promocoes4.setValor("R$ 260,00");
        promocoesArrayList.add(promocoes4);

        Promocoes promocoes5 = new Promocoes();
        promocoes5.setNome("Formatação + SSD 240GB");
        promocoes5.setValor("R$ 350,00");
        promocoesArrayList.add(promocoes5);

        Promocoes promocoes6 = new Promocoes();
        promocoes6.setNome("Formatação + SSD 480GB");
        promocoes6.setValor("R$ 440,00");
        promocoesArrayList.add(promocoes6);

        Promocoes promocoes7 = new Promocoes();
        promocoes7.setNome("Recuperação de Arquivos Pessoais");
        promocoes7.setValor("R$ 70,00");
        promocoesArrayList.add(promocoes7);

        Promocoes promocoes8 = new Promocoes();
        promocoes8.setNome("Limpeza Notebook + Pasta Térmica");
        promocoes8.setValor("R$ 60,00");
        promocoesArrayList.add(promocoes8);

        Promocoes promocoes9 = new Promocoes();
        promocoes9.setNome("Limpeza Desktop + Pasta Térmica");
        promocoes9.setValor("R$ 50,00");
        promocoesArrayList.add(promocoes9);


        recyclerViewPromocoes = view.findViewById(R.id.promocoes_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        promocoesAdapter = new PromocoesAdapter(promocoesArrayList,this);

        recyclerViewPromocoes.setAdapter(promocoesAdapter);
        recyclerViewPromocoes.setLayoutManager(layoutManager);
        return view;
    }

    public void onPromocaoClicada (Promocoes promocao){

        Intent intent = new Intent(getContext(), DetalhesPromocoesActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("PROMOCOES", promocao);

        intent.putExtras(bundle);

        startActivity(intent);


    }
}
