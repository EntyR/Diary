package com.example.calendar.ui.fragments

import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.DialogFragment
import com.example.calendar.R
import com.example.calendar.databinding.EventItemBinding
import com.example.calendar.databinding.FragmentCreateEventBinding

class CreateEventFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentCreateEventBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val id =resources.getIdentifier("Theme.MaterialComponents.Light.Dialog", "style",context?.packageName)
        setStyle(STYLE_NORMAL, id)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialog)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.let {
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.WRAP_CONTENT
            it.window?.setLayout(width, height)
            it.window?.setGravity(Gravity.BOTTOM)
        }
    }


}
