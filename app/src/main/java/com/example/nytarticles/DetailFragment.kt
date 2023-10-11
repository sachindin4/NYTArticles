package com.example.nytarticles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.nytarticles.Article
import com.example.nytarticles.ArticleViewModel
import com.example.nytarticles.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private lateinit var articleViewModel: ArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        articleViewModel = ViewModelProvider(requireActivity()).get(ArticleViewModel::class.java)

        // Selected article from the ViewModel
        articleViewModel.selectedArticle.observe(viewLifecycleOwner, { article ->
            article?.let {
                updateUIWithArticleDetails(article)
            }
        })

        return view
    }

    private fun updateUIWithArticleDetails(article: Article) {
        // Display the article details
        binding.titleTextView.text = article.title
        binding.abstractTextView.text = article.abstract
        // Example: You can also load an image using a library like Picasso or Glide
        // Picasso.get().load(article.imageUrl).into(binding.articleImageView)
    }
}
