package com.example.recipe_view.ui.ui.recipe_list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.recipe_view.R

class RecipeListFragment : Fragment(R.layout.fragment_recipe_list) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecipeListFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}