package com.example.lyodsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class BlueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView = inflater.inflate(R.layout.blue_layout, container, false)
       var resultTextView = myView.findViewById<TextView>(R.id.textViewResult)
        var result = arguments?.getString("un")
        Toast.makeText(activity, "data -- $result", Toast.LENGTH_LONG).show()
        resultTextView.setText(result)

        return myView
    }

}