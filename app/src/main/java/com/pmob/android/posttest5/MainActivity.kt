package com.pmob.android.posttest5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.pmob.android.posttest5.ui.browser.BrowserFragment
import com.pmob.android.posttest5.ui.hitung.HitungFragment
import com.pmob.android.posttest5.ui.home.HomeFragment
import com.pmob.android.posttest5.ui.maps.MapsFragment
import com.pmob.android.posttest5.ui.message.MessageFragment
import com.pmob.android.posttest5.ui.telephone.TelephoneFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val mHomeFragment = HomeFragment()
        val fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
        if (fragment !is HomeFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + HomeFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mHomeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
        
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.home -> {
                val homeFragment = HomeFragment()
                val mFragmentManager = supportFragmentManager
                mFragmentManager.beginTransaction().apply {
                    replace(R.id.frame_container, homeFragment, HomeFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.maps -> {
                val mapsFragment = MapsFragment()
                val mFragmentManager = supportFragmentManager
                mFragmentManager.beginTransaction().apply {
                    replace(R.id.frame_container, mapsFragment, MapsFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.browser -> {
                val browserFragment = BrowserFragment()
                val mFragmentManager = supportFragmentManager
                mFragmentManager.beginTransaction().apply {
                    replace(R.id.frame_container, browserFragment, BrowserFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.message -> {
                val messageFragment = MessageFragment()
                val mFragmentManager = supportFragmentManager
                mFragmentManager.beginTransaction().apply {
                    replace(R.id.frame_container, messageFragment, MessageFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.hitung -> {
                val hitungFragment = HitungFragment()
                val mFragmentManager = supportFragmentManager
                mFragmentManager.beginTransaction().apply {
                    replace(R.id.frame_container, hitungFragment, HitungFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
                true
            }
            R.id.telephone -> {
                val telephoneFragment = TelephoneFragment()
                val mFragmentManager = supportFragmentManager
                mFragmentManager.beginTransaction().apply {
                    replace(R.id.frame_container, telephoneFragment, TelephoneFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}