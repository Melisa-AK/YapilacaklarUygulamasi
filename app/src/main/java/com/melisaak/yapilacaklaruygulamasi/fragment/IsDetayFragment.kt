package com.melisaak.yapilacaklaruygulamasi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.melisaak.yapilacaklaruygulamasi.R
import com.melisaak.yapilacaklaruygulamasi.databinding.FragmentIsDetayBinding


class isDetayFragment : Fragment() {
   private lateinit var tasarim: FragmentIsDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentIsDetayBinding.inflate(inflater, container, false)

        val bundle:isDetayFragmentArgs by navArgs()
        val gelenIs = bundle.`is`

        tasarim.editTextKisiAd.setText(gelenIs.is_ad)

        tasarim.buttonGuncelle.setOnClickListener {
            val is_ad = tasarim.editTextKisiAd.text.toString()
        }

        return tasarim.root
    }
    fun guncelle(is_id:Int,is_ad:String){


    }

}