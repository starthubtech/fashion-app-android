package ng.com.starthub.swedigo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.home_screen.*

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)
        supportActionBar!!.hide()

        val serviceRecyclerView = findViewById(R.id.recyclerView) as RecyclerView
        val storeRecyclerView = findViewById(R.id.StoreRecyclerView) as RecyclerView

        serviceRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        storeRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)

        val serviceDetails = ArrayList<ServiceDetails>()

                serviceDetails.add (ServiceDetails(R.drawable.lady_back,"Burial Gowns"))
                serviceDetails.add (ServiceDetails(R.drawable.lady_back,"Children Gowns"))
                serviceDetails.add (ServiceDetails(R.drawable.lady_back,"Dancing Gowns"))
                serviceDetails.add (ServiceDetails(R.drawable.lady_back,"Wedding Gowns"))
                serviceDetails.add (ServiceDetails(R.drawable.lady_back,"Church Gowns"))
                serviceDetails.add (ServiceDetails(R.drawable.lady_back,"Big Gowns"))

        val adapter1 = ServiceAdapter(serviceDetails)
        recyclerView.adapter = adapter1

        val popularStoreDetails = ArrayList<PopularStoreDetails>()

                popularStoreDetails.add (PopularStoreDetails(R.drawable.beiler, "Beiler Gowns", "Wedding Planner"))
                popularStoreDetails.add (PopularStoreDetails(R.drawable.fastbox, "Fastbox Gowns", "Wedding Planner"))
                popularStoreDetails.add (PopularStoreDetails(R.drawable.beiler, "Beiler Gowns", "Wedding Planner"))
                popularStoreDetails.add (PopularStoreDetails(R.drawable.ridge, "Ridge Gowns", "Wedding Planner"))

        val adapter2 = PopularStoreAdapter(popularStoreDetails)
        storeRecyclerView.adapter = adapter2


    }}
