package com.pmob.android.posttest5.ui.telephone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pmob.android.posttest5.R
import kotlinx.android.synthetic.main.fragment_telephone.*


class TelephoneFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_telephone, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        submit_telephone.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val number = input_telephone.text.toString().trim()
        when (v?.id) {
            R.id.submit_telephone -> {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$number")
                startActivity(intent)
            }
        }
    }
}