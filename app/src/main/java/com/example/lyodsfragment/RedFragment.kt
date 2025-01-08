package com.example.lyodsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import kotlin.concurrent.fixedRateTimer

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView = inflater.inflate(R.layout.red_layout, container,false)
        var usernameEditText = myView.findViewById<EditText>(R.id.editTextTextUsername)
        var submitButton = myView.findViewById<Button>(R.id.buttonSubmit)

        submitButton.setOnClickListener {
            var username = usernameEditText.text.toString()
            var blueFrag = BlueFragment()
            var bundle = Bundle()
            bundle.putString("un", username)
            blueFrag.arguments = bundle
            parentFragmentManager?.beginTransaction()?.
            replace(R.id.mainLayout, blueFrag)?.addToBackStack(null)?.commit()
        }
        return myView
    }
}