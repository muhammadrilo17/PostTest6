package com.pmob.android.posttest5.ui.message

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pmob.android.posttest5.R
import kotlinx.android.synthetic.main.fragment_message.*
import java.lang.String


class MessageFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        submit_message.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val phoneNumber = input_message_no.text.toString().trim()
        val bodyMessage = input_message.text.toString().trim()

        when(v?.id) {
            R.id.submit_message -> {
                val uri: Uri = Uri.parse(String.format("smsto:%s", phoneNumber))
                val smsIntent = Intent(Intent.ACTION_SENDTO, uri)
                smsIntent.putExtra("sms_body", bodyMessage)
                startActivity(smsIntent)
            }
        }
    }

}