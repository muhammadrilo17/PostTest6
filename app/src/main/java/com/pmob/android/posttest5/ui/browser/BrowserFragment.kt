package com.pmob.android.posttest5.ui.browser

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pmob.android.posttest5.R
import kotlinx.android.synthetic.main.fragment_browser.*


class BrowserFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_browser, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        submit_keyword.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val address = input_keyword.text.toString().trim()
        when (v?.id) {
            R.id.submit_keyword -> {
                val url = "http://google.com/$address"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }
    }
}