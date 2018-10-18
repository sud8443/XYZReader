package com.example.xyzreader.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

import java.util.ArrayList;

public class ArticleBodyTextRecyclerViewAdapter extends RecyclerView.Adapter<ArticleBodyTextRecyclerViewAdapter.ViewHolder> {

    ArrayList<Spanned> mArtcileParagraphs;
    Context mContext;

    public ArticleBodyTextRecyclerViewAdapter(Context context, ArrayList<Spanned> articleContentParagraph) {
        mArtcileParagraphs = articleContentParagraph;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.list_item_article_content, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.articleContentParagraphText.setText(mArtcileParagraphs.get(position));
    }

    @Override
    public int getItemCount() {
        if (mArtcileParagraphs == null)
            return 0;
        return mArtcileParagraphs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView articleContentParagraphText;

        public ViewHolder(View itemView) {
            super(itemView);

            articleContentParagraphText = (TextView) itemView.findViewById(R.id.article_body);
        }
    }
}
