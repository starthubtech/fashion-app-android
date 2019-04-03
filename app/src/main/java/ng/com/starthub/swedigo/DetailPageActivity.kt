package ng.com.starthub.swedigo

import android.content.DialogInterface
import android.content.res.ColorStateList
import android.provider.CalendarContract
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.SpinnerAdapter
import android.widget.Toast

import java.util.ArrayList


class DetailPageActivity : AppCompatActivity() {

    private var spinner1: Spinner? = null
    private var spinner2: Spinner? = null
    private var spinner3: Spinner? = null
    private val submitbtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        addItemsOnSpinner1()
        addItemsOnSpinner2()
        addItemsOnSpinner3()
        addListnerOnSpinnerItemSelected()
    }

    //ADD ITEMS INTO SPINNER DYNAMICALLY
    fun addItemsOnSpinner1() {
        spinner1 = findViewById<View>(R.id.spinner) as Spinner
        val color = ArrayList<String>()
        color.add("Color")
        color.add("Blue")
        color.add("Red")
        color.add("Yellow")
        color.add("Brown")
        color.add("Green")
        color.add("Black")
        color.add("Pink")
        color.add("Purple")
        color.add("Maroon")
        color.add("Grey")
        color.add("Sky_Blue")
        color.add("Pitch_Brown")
        color.add("See_Green")
        val dataAdapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, color)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1!!.adapter = dataAdapter
    }

    fun addItemsOnSpinner3() {
        spinner3 = findViewById<View>(R.id.spinner3) as Spinner
        val quantity = ArrayList<String>()
        quantity.add("Quantity")
        quantity.add("1")
        quantity.add("2")
        quantity.add("3")
        quantity.add("4")
        quantity.add("5")
        quantity.add("6")
        val dataAdapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, quantity)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner3!!.adapter = dataAdapter
    }

    fun addItemsOnSpinner2() {

        spinner2 = findViewById<View>(R.id.spinner2) as Spinner
        val size = ArrayList<String>()
        size.add("Size")
        size.add("size 26")
        size.add("size 30")
        size.add("size 36")
        size.add("size 38")
        size.add("size 40")
        size.add("size 42")
        size.add("size 42")
        size.add("size 42")
        size.add("size 42")
        size.add("size 42")
        size.add("size 42")
        size.add("size 42")

        val dataAdapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, size)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2!!.adapter = dataAdapter
    }

    fun addListnerOnSpinnerItemSelected() {
        spinner1 = findViewById<View>(R.id.spinner) as Spinner
        spinner1!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                Toast.makeText(parent.context, "Experience the Art:" + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
    //get the selected dropdown list value

    /*public void addListenerOnButton(){
        spinner1=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner3=(Spinner)findViewById(R.id.spinner3);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test.this, "OnClickListener :" +
                                "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem())+
                                "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }*/
}
