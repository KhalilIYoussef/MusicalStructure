package khaliliyoussef.musicalstructure.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import khaliliyoussef.musicalstructure.R;
import khaliliyoussef.musicalstructure.model.Song;

/**
 * Created by Khalil on 9/25/2017.
 */
public class SongAdapter extends RecyclerView.Adapter<SongAdapter.MovieViewHolder> {

    private static List<Song> songs;

    private static Context context;


    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        ImageView songImage;
        TextView songTitle;
        TextView songArtist;
        TextView songAlbum;

        public MovieViewHolder(View v) {
            super(v);
            songImage = v.findViewById(R.id.song_photo);
            songTitle = v.findViewById(R.id.song_title);
            songArtist = v.findViewById(R.id.song_artist);
            songAlbum = v.findViewById(R.id.song_album);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Song ClickDataItems = songs.get(position);
//                        Intent intent = new Intent(context, DetailsActivity.class);
//                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        context.startActivity(intent);
                    }
                }
            });
        }
    }

    public SongAdapter(Context context, List<Song> movies) {
        this.songs = movies;
        this.context = context;
    }

    @Override
    public SongAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {

        holder.songTitle.setText(songs.get(position).getTitle());
        holder.songArtist.setText(String.valueOf(songs.get(position).getArtist()));
        holder.songAlbum.setText(String.valueOf(songs.get(position).getAlbum()));
        holder.songImage.setImageResource(R.mipmap.ic_launcher);

    }
    @Override
    public int getItemCount() {
        return songs.size();
    }

}