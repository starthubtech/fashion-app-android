package ng.com.starthub.swedigo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class WeddingGownsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedding_gowns_page)
        supportActionBar!!.hide()

        val storeRecyclerView = findViewById(R.id.storeRecyclerview) as RecyclerView

        storeRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val storeDetails = ArrayList<WeddingGownsDetails>()
            storeDetails.add(WeddingGownsDetails(R.drawable.ic_vector, "Summer Gowns", " This field holds a short description of the store", "$5,000"))
            storeDetails.add(WeddingGownsDetails(R.drawable.ic_home, "Winter Gowns", " This field holds a short description of the store", "$5,000"))
            storeDetails.add(WeddingGownsDetails(R.drawable.ic_cart, "Spring Gowns", " This field holds a short description of the store", "$5,000"))
            storeDetails.add(WeddingGownsDetails(R.drawable.ic_vector, "Summer Gowns", " This field holds a short description of the store", "$5,000"))
            storeDetails.add(WeddingGownsDetails(R.drawable.ic_home, "Winter Gowns", " This field holds a short description of the store", "$5,000"))
            storeDetails.add(WeddingGownsDetails(R.drawable.ic_cart, "Spring Gowns", " This field holds a short description of the store", "$5,000"))

        val adapter = WeddingGownsAdapter(storeDetails)
        storeRecyclerView.adapter = adapter



    }
}
