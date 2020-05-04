package com.example.appmyroom

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prototype_contact.view.*

class ContactAdapter(val contacts: List<Contact>):RecyclerView.Adapter<ContactPrototype>{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactPrototype {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactPrototype, position: Int) {
        TODO("Not yet implemented")
    }


}

class ContactPrototype(itemView: View):RecyclerView.ViewHolder(itemView) {
    val etName=itemView.txName.text.toString()
    val etTelephono=itemView.txTelephone.text.toString()
    val cvContact=itemView.cvContact

    fun bind(contact: Contact){
        etName.text=contact.name
        etTelephono.text=contact.telephone
    }
}
