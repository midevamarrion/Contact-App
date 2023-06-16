package com.example.contactapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.databinding.ActivityAddingContactsBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume( ){
        super.onResume()
        displayContacts()
        binding.btnFloating.setOnClickListener {
           val intent= Intent(this,AddContacts::class.java)
            startActivity(intent)
        }

    }

    fun displayContacts(){
        var name1 = ContactData("Emmily","emmily@gmail.com","79072548748","https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        var name2 = ContactData("Stephanie","stephanie@gmail.com","79072548748","https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        var name3 = ContactData("Annet","annett@gmail.com","79072548748","https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        var name4 = ContactData("Mercy","mercy@gmail.com","79072548748","https://media.istockphoto.com/id/1381203194/photo/beautiful-afro-woman.jpg?s=612x612&w=0&k=20&c=6Klilmbsd4buHLE1QkWYg_duPsoMtQ9XrOwSvL6Xir0=")
        var name5 = ContactData("John","john@gmail.com","79072548748", "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80")
        var name6= ContactData("Jane","jane@gmail.com","79072548748","https://media.istockphoto.com/id/1408224350/photo/photo-of-cheerful-dark-skin-girl-dance-cool-wear-summer-outfit-raise-hands-isolated-on-funky.jpg?s=612x612&w=0&k=20&c=Jtqzmi7Lbpz9qRQfpIrOE5D_Wuaw3KH2AUw_0W3nJuE=")
        var name7 = ContactData("Magret","magret@gmail.com","79072548748","https://media.istockphoto.com/id/1255950210/photo/close-up-portrait-of-happy-african-american-woman-looking-at-camera-with-mouth-open.jpg?s=612x612&w=0&k=20&c=YBIkv7xW_Cz0pCCSTwIl3UYKXkva49H-yIcj5IcFfps=")
        var name8 = ContactData("Leila","leila@gmail.com","79072548748","https://media.istockphoto.com/id/1426200383/photo/charming-african-american-young-woman-listen-music-track-isolated-on-white-background-afro.jpg?s=612x612&w=0&k=20&c=C8cN8hXVAZ2V6dxkNQZI1USGJp11UVq6ddGyKRU4iyQ=")
        var name9 = ContactData("Ayla","ayla@gmail.com","79072548748","https://media.istockphoto.com/id/928419104/photo/beauty-portrait-of-young-african-american-girl-with-afro-hairstyle-girl-posing-on-yellow.jpg?s=612x612&w=0&k=20&c=OP3qrkArCaXP99kqGy7ADL6QA8XBPrnbXNNykCUEnJk=")
        var name10 = ContactData("Yvonne","yvonne@gmail.com","79072548748","https://media.istockphoto.com/id/1293629947/photo/young-african-american-woman-smiling-posing-on-yellow-background.jpg?s=612x612&w=0&k=20&c=7csvY2FQuY2o4D8C38qzpvOiUQcWribnVhRZHK4jMy4=" )
        var names = listOf<ContactData>(name1,name2, name3,name4,name5,name6,name7,name8,name9,name10)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        val contactsAdapter =ContactsAdapter(names)
//        var contactsAdapter = ContactsRVAdapter(contactList)
        binding.rvContact.adapter = contactsAdapter}}
//