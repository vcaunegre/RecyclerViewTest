package com.example.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.MyViewHolder> {

private List<Player> playersList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView team,name,year;
        public MyViewHolder(@NonNull View view) {
            super(view);
            name=view.findViewById(R.id.name);
            year=view.findViewById(R.id.year);
            team=view.findViewById(R.id.team);
        }
    }

    public PlayersAdapter(List<Player> playersList){
        this.playersList=playersList;
    }

    @NonNull
    @Override
    public PlayersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_list_row, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Player player = playersList.get(position);
    holder.name.setText(player.name);
    holder.team.setText(player.team);
    holder.year.setText(player.year);
    }

    @Override
    public int getItemCount() {
        return playersList.size();
    }

}
