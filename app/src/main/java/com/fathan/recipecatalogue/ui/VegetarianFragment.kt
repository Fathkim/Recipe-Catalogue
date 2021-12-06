package com.fathan.recipecatalogue.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.fathan.recipecatalogue.R
import com.fathan.recipecatalogue.adapter.RecipesAdapter
import com.fathan.recipecatalogue.data.DataRecipes
import com.fathan.recipecatalogue.databinding.FragmentVegetarianBinding

class VegetarianFragment : Fragment() {

    private var _binding: FragmentVegetarianBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentVegetarianBinding.inflate(inflater, container, false)
        binding.rvVegetarian.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = RecipesAdapter(DataRecipes.listVegetarian)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}