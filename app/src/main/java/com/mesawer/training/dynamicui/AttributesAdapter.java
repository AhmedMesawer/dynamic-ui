package com.mesawer.training.dynamicui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AttributesAdapter extends RecyclerView.Adapter<AttributesAdapter.ViewHolder> {

    private List<Attribute> attributes;

    public AttributesAdapter(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_attribute, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Attribute attribute = attributes.get(position);
        holder.attributeNameTextView.setText(attribute.getAttributeName());
        switch (attribute.getAttributeType()) {
            case AttributeType.DATE:
                holder.dateAttributeTextView.setVisibility(View.VISIBLE);
                holder.changeDateAttributeIcon.setVisibility(View.VISIBLE);
                break;
            case AttributeType.MEMO:
                holder.textAttributeEditText.setVisibility(View.VISIBLE);
                break;
            case AttributeType.VALUE_LIST:
                holder.listAttributeSpinner.setVisibility(View.VISIBLE);
                break;
            case AttributeType.DB_LIST:
                holder.listAttributeSpinner.setVisibility(View.VISIBLE);
                break;
            case AttributeType.TEXT:
                holder.textAttributeEditText.setVisibility(View.VISIBLE);
                break;
            case AttributeType.SYSTEM:
                holder.listAttributeSpinner.setVisibility(View.VISIBLE);
                break;
        }
        holder.textAttributeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                attributes.get(position).setAttributeValue(s.toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return attributes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.attributeNameTextView)
        TextView attributeNameTextView;
        @BindView(R.id.textAttributeEditText)
        EditText textAttributeEditText;
        @BindView(R.id.dateAttributeTextView)
        TextView dateAttributeTextView;
        @BindView(R.id.changeDateAttributeIcon)
        ImageView changeDateAttributeIcon;
        @BindView(R.id.listAttributeSpinner)
        Spinner listAttributeSpinner;
        @BindView(R.id.attributeSwitch)
        Switch attributeSwitch;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
