package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsAdapter (var contactlist:List<ContactData>):RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactsViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contact = contactlist[position]
        holder.binding.tvName.text = contact.firstName
        holder.binding.tvEmail.text = contact.email
        holder.binding.tvPhoneNumber.text = contact.phoneNumber
        holder.binding.ivAvatar.tag = contact.image
        Picasso
            .get().load(contact.image)
            .resize(80, 80)
            .centerInside()
            .transform(CropCircleTransformation())
            .into(holder.binding.ivAvatar)

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }

    class ContactsViewHolder(var binding: ContactListItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}
