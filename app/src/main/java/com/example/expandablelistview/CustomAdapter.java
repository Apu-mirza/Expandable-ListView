package com.example.expandablelistview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private int clickedItemPosition = -1;
    String[] itemList,itemList2;
//    List<String> itemList,itemList2;
//
    LayoutInflater layoutInflater;
    Context context;

    public CustomAdapter(Context context, String[] itemList, String[] itemList2) {
        this.context = context;
        this.itemList = itemList;
        this.itemList2 = itemList2;
    }

    @Override
    public int getCount() {
        return itemList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;


        if (view == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.default_layout,viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.textView.setText(itemList[i]);
        }

        else {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.clicked_layout,viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.textView.setText(itemList[i]);
            viewHolder.textView2.setText(itemList2[i]);
        }

        return view;
    }
//    public CustomAdapter(Context context, List<String> itemList, List<String> itemList2) {
//        super(context, 0);
//        this.itemList = itemList;
//        this.itemList2 = itemList2;
//    }
//
    public void setClickedItemPosition(int position) {
        clickedItemPosition = position;
        notifyDataSetChanged();
    }

//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        ViewHolder viewHolder;
//
//        if (convertView == null) {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.default_layout, parent, false);
//
//            viewHolder = new ViewHolder();
//            viewHolder.imageButton1 = convertView.findViewById(R.id.micId);
//            viewHolder.imageButton2 = convertView.findViewById(R.id.videoId);
//
//            convertView.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder) convertView.getTag();
//        }
//
//        // Set click listener for default layout
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setClickedItemPosition(position);
//            }
//        });
//
//        // Change the layout for the clicked item
//        if (position == clickedItemPosition) {
//            convertView = LayoutInflater.from(context.inflate(R.layout.clicked_layout, parent, false);
//
//            viewHolder = new ViewHolder();
//            viewHolder.imageButton1 = convertView.findViewById(R.id.micId);
//            viewHolder.imageButton2 = convertView.findViewById(R.id.videoId);
//
//            convertView.setTag(viewHolder);
//
//            // Set click listeners for ImageButton objects in clicked layout
//            viewHolder.imageButton1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(context,"microphone button is clicked",Toast.LENGTH_LONG).show();
//                }
//            });
//
//            viewHolder.imageButton2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(getContext(),"audio button is clicked",Toast.LENGTH_LONG).show();
//                }
//            });
//        } else {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.default_layout, parent, false);
//
//            viewHolder = new ViewHolder();
//            viewHolder.textView = convertView.findViewById(R.id.item_text);
//
//            convertView.setTag(viewHolder);
//            viewHolder.textView.setText(getItem(position));
//        }
//        return convertView;
//    }

    static class ViewHolder {
        ImageButton imageButton1;
        ImageButton imageButton2;
        TextView textView, textView2;
    }
}
