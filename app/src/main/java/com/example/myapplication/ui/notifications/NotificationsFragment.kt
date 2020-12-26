package com.example.myapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //It's the reference to the ViewModel that holds data
        notificationsViewModel =
                ViewModelProvider(this).get(NotificationsViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        val newsView: LinearLayout = root.findViewById(R.id.news_table)
        notificationsViewModel.news.observe(viewLifecycleOwner, Observer {
            //Here we link data to UI element
            it.forEach{
                //TODO Come cazzo ci butto i dati in questo View?!
//                newsView.
            }
        })


        return root
    }



}