package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Player> players = new ArrayList<>();
    private RecyclerView recyclerView;
    private PlayersAdapter playersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        playersAdapter = new PlayersAdapter(players);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(playersAdapter);

        populate();
    }

    private void populate(){
        Player player = new Player("Giánnis Antetokoúnmpo","Milwaukee Bucks","2020");
        players.add(player);

        player = new Player("Giánnis Antetokoúnmpo","Milwaukee Bucks","2019");
        players.add(player);

        player = new Player("James Harden ","Houston Rockets","2018");
        players.add(player);

        player = new Player("Russell Westbrook","Oklahoma City Thunder","2017");
        players.add(player);

        player = new Player("Stephen Curry ","Golden State Warriors","2016");
        players.add(player);

        player = new Player("Stephen Curry ","Golden State Warriors","2015");
        players.add(player);

        player = new Player("Kevin Durant","Oklahoma City Thunder","2014");
        players.add(player);

        player = new Player("LeBron James","Miami Heat","2013");
        players.add(player);

        player = new Player("LeBron James","Miami Heat","2012");
        players.add(player);

        player = new Player("Derrick Rose","Chicago Bulls","2011");
        players.add(player);

        playersAdapter.notifyDataSetChanged();



    }
}