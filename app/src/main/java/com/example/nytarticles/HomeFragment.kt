package com.example.nytarticles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nytarticles.ArticleViewModel
import com.example.nytarticles.ArticleAdapter
import com.example.nytarticles.R

class HomeFragment : Fragment() {
    private lateinit var articleViewModel: ArticleViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var articleAdapter: ArticleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        articleViewModel = ViewModelProvider(this).get(ArticleViewModel::class.java)

        // Initialize RecyclerView and Adapter
        recyclerView = view.findViewById(R.id.recyclerView)
        articleAdapter = ArticleAdapter(requireContext())

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = articleAdapter

        // Data from the ViewModel
        articleViewModel.articles.observe(viewLifecycleOwner, { articles ->
            articles?.let {
                articleAdapter.setArticles(it)
            }
        })

        articleViewModel.fetchArticles("wP0H4r1Ez9x9Uwx9GZ4vH8STxl7KSe32")

//        // Navigate to the detail fragment
//        view.setOnClickListener {
//            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
//            navController.navigate(action)
//        }

        return view
    }
}
