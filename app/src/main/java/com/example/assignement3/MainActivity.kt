package com.example.assignement3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var tblData: TableLayout
    private lateinit var txtVersion: EditText
    private lateinit var txtCodeName: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tblData=findViewById<TableLayout>(R.id.tblData)
        txtVersion=findViewById<EditText>(R.id.txtVersion)
        txtCodeName=findViewById<EditText>(R.id.txtCodeName)
    }

    fun addRow(view: View) {
        val version = TextView(this)
        version.text=txtVersion.text
        val codeName = TextView(this)
        codeName.text=txtCodeName.text
        if(version.text.toString()!="" &&
                codeName.text.toString()!="") {
            // Create a new table row.
            val tableRow = TableRow(this) // this
            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.setLayoutParams(layoutParams)
// add values into row by calling addView()


            tableRow.addView(version, 0)
            tableRow.addView(codeName, 0)
// Finally add the created row row into layout
            tblData.addView(tableRow) // id from Layout_fil

            txtVersion.text.clear()
            txtCodeName.text.clear()
        }
    }
}