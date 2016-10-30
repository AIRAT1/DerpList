package de.android.derplist.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.android.derplist.R;
import de.android.derplist.model.ListItem;

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>{

    private List<ListItem> listData;
    private LayoutInflater inflater;

    private ItemClickCallback itemClickCallback;

    public void setListData(ArrayList<ListItem> exerciseList) {
        this.listData.clear();
        this.listData.addAll(exerciseList);
    }

    public interface ItemClickCallback {
        void onItemClick(int p);
        void onSecondaryIconClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    public DerpAdapter(List<ListItem> listData, Context c){
        inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public DerpAdapter.DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_item, parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubTitle());
//        if (item.isFavourite()){
//            holder.secondaryIcon.setImageResource(R.drawable.ic_star);
//        } else {
//            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border);
//        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView thumbnail;
//        private ImageView secondaryIcon;
        private TextView title;
        private TextView subTitle;
        private View container;
        private Button load;

        public DerpHolder(View itemView) {
            super(itemView);
            thumbnail = (ImageView)itemView.findViewById(R.id.im_item_icon);
//            secondaryIcon = (ImageView)itemView.findViewById(R.id.im_item_icon_secondary);
//            secondaryIcon.setOnClickListener(this);
            subTitle = (TextView)itemView.findViewById(R.id.lbl_item_sub_title);
            title = (TextView)itemView.findViewById(R.id.lbl_item_text);
            load = (Button)itemView.findViewById(R.id.btn_card_load);
            load.setOnClickListener(this);
            container = itemView.findViewById(R.id.cont_item_root);
//            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            if (v.getId() == R.id.cont_item_root){
//                itemClickCallback.onItemClick(getAdapterPosition());
//            } else {
//                itemClickCallback.onSecondaryIconClick(getAdapterPosition());
//            }

            if (v.getId() == R.id.btn_card_load) {
                itemClickCallback.onItemClick(getAdapterPosition());
            }
        }
    }
}
