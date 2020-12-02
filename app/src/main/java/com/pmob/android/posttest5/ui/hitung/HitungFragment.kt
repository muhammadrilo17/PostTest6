package com.pmob.android.posttest5.ui.hitung

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pmob.android.posttest5.R
import kotlinx.android.synthetic.main.fragment_hitung.*

class HitungFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hitung, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        submit_hitung.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        val r = input_hitung.text.toString().trim().toFloat()
        val phi = 3.14f
        when (v?.id) {
            R.id.submit_hitung -> {
                val resultLuas : Float = phi*r*r
                val resultVol : Float = phi*r*r*r*4/3
                result_hitung.text = "$resultLuas\n$resultVol"
            }
        }
    }
}