package ng.com.starthub.swedigo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.home_screen.*

class StoresPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stores_page)
        supportActionBar!!.hide()

        val storeRecyclerView = findViewById(R.id.storeRecyclerView) as RecyclerView

        storeRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val storeDetails = ArrayList<StoreDetails>()

        storeDetails.add (StoreDetails(R.drawable.lady_back,"Esty Stores","24 Atiku Abubakar Way, Uyo, Akwa Ibom State, Nigeria", "Open 24 Hours"))
        storeDetails.add (StoreDetails(R.drawable.lady_back,"Esty Stores","24 Atiku Abubakar Way, Uyo, Akwa Ibom State, Nigeria", "Open 24 Hours"))
        storeDetails.add (StoreDetails(R.drawable.lady_back,"Esty Stores","24 Atiku Abubakar Way, Uyo, Akwa Ibom State, Nigeria", "Open 24 Hours"))
        storeDetails.add (StoreDetails(R.drawable.lady_back,"Esty Stores","24 Atiku Abubakar Way, Uyo, Akwa Ibom State, Nigeria", "Open 24 Hours"))
        storeDetails.add (StoreDetails(R.drawable.lady_back,"Esty Stores","24 Atiku Abubakar Way, Uyo, Akwa Ibom State, Nigeria", "Open 24 Hours"))
        storeDetails.add (StoreDetails(R.drawable.lady_back,"Esty Stores","24 Atiku Abubakar Way, Uyo, Akwa Ibom State, Nigeria", "Open 24 Hours"))

        val adapter = StoresAdapter(storeDetails)
        recyclerView.adapter = adapter
    }
}
