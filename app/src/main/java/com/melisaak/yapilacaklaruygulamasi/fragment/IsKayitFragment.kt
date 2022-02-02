package com.melisaak.yapilacaklaruygulamasi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.melisaak.yapilacaklaruygulamasi.databinding.FragmentIsKayitBinding

class isKayitFragment : Fragment() {
    private lateinit var tasarim:FragmentIsKayitBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentIsKayitBinding.inflate(inflater, container, false)

        tasarim.buttonKaydet.setOnClickListener {
            var is_ad = tasarim.editTextisAd.text.toString()
            kayit(is_ad)
        }

        return tasarim.root
    }
    fun kayit(is_ad:String){


    }


}