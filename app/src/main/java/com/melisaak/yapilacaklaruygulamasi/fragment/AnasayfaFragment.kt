package com.melisaak.yapilacaklaruygulamasi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.melisaak.yapilacaklaruygulamasi.R
import com.melisaak.yapilacaklaruygulamasi.databinding.FragmentAnasayfaBinding
import com.melisaak.yapilacaklaruygulamasi.entity.isler


class AnasayfaFragment : Fragment() {
  private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.fab.setOnClickListener {
            //Navigation.findNavController(it).navigate(R.id.isKayitGecis)

            val kisi = isler(1,"Ekmek Al")
            val gecis = AnasayfaFragmentDirections.isDetayGecis(kisi)
            Navigation.findNavController(it).navigate(gecis)


        }

        return tasarim.root
    }
}



