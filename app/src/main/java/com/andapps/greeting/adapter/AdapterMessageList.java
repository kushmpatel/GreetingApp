package com.andapps.greeting.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.andapps.greeting.R;


/**
 * Created by kushpatel on 9/20/2017.
 */

public class AdapterMessageList extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Activity activity;
    private String msgList[];

    public AdapterMessageList(Activity activity, String msgList[]) {
        this.activity = activity;
        this.msgList = msgList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_row_message, parent, false);
        return new MessageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MessageViewHolder myHolder = (MessageViewHolder) holder;
        String text = msgList[position];
        myHolder.tvMessage.setText(text);
        myHolder.ivShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Clicked on "+position+" position",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return msgList.length;
    }

     class MessageViewHolder extends RecyclerView.ViewHolder {
        final TextView tvMessage;
        final View rootView;
         final ImageView ivShare;

        MessageViewHolder(View itemView) {
            super(itemView);
            rootView = itemView;
            tvMessage = (TextView) itemView.findViewById(R.id.tvMessage);
            ivShare = (ImageView) itemView.findViewById(R.id.ivShare);
        }
    }
}
