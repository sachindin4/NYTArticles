package com.example.nytarticles

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nytarticles.Article
import com.example.nytarticles.R

class ArticleAdapter(private val context: Context) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    private var articles: List<Article> = emptyList()

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val abstractTextView: TextView = itemView.findViewById(R.id.abstractTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val currentArticle = articles[position]
        holder.titleTextView.text = currentArticle.title
        holder.abstractTextView.text = currentArticle.abstract
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    fun setArticles(articles: List<Article>) {
        this.articles = articles
        notifyDataSetChanged()
    }
}
