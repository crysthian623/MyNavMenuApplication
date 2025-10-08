package com.example.mynavmenuapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        val btnSend = view.findViewById<Button>(R.id.btnSend)
        val etName = view.findViewById<EditText>(R.id.etName)
        val etEmail = view.findViewById<EditText>(R.id.etEmail)

        btnSend.setOnClickListener {
            if (etName.text.isNotEmpty() && etEmail.text.isNotEmpty()) {
                Toast.makeText(requireContext(), "Mensaje enviado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Completa nombre y correo", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}