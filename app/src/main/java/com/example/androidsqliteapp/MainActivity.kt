package com.example.androidsqliteapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var save:Button
    private lateinit var view:Button
    private lateinit var delete:Button
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var id:EditText
    private lateinit var db:SQLiteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        save = findViewById(R.id.btnsave)
        view = findViewById(R.id.btnview)
        delete = findViewById(R.id.btndelete)
        name= findViewById(R.id.txtname)
        email = findViewById(R.id.txtemail)
        id = findViewById(R.id.txtid)

        //creating our database
        db = openOrCreateDatabase("preciousDB", Context.MODE_PRIVATE, null)

       //creating a table ( holds data in the database )
        db.execSQL("CREATE TABLE IF NOT EXISTS users(jina VARCHAR, arafa VARCHAR, kitambulisho VARCHAR)")

        //setOnClickListeners to the buttons
        save.setOnClickListener {
            var name_edt = name.text.toString().trim()
            var email_edt = email.text.toString().trim()
            var idnum_edt = id.text.toString().trim()

            //VALIDATE USER INPUT
            if (name_edt.isEmpty() || email_edt.isEmpty() || idnum_edt.isEmpty())
                Toast.makeText(this, "Check your input field", Toast.LENGTH_SHORT).show()
        } else{

            db.execSQL("INSERT INTO users VALUES ('"')" )




        }



    }
}