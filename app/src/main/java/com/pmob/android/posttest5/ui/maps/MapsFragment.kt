package com.pmob.android.posttest5.ui.maps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pmob.android.posttest5.R
import kotlinx.android.synthetic.main.fragment_maps.*

class MapsFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        submit_alamat.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val address = input_alamat.text.toString().trim()
        when (v?.id) {
            R.id.submit_alamat -> {
                val url = "http://maps.google.com/maps?daddr=$address"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }
    }
}