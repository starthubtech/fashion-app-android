package ng.com.starthub.swedigo
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class StoresAdapter(val storeDetailsList: ArrayList<StoreDetails>) : RecyclerView.Adapter<StoresAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): StoresAdapter.ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.store_details, p0, false)
        return StoresAdapter.ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return storeDetailsList.size

    }

    override fun onBindViewHolder(p0: StoresAdapter.ViewHolder, p1: Int) {
        val storeDetails : StoreDetails = storeDetailsList[p1]

        p0?.openingHours?.text = storeDetails.openingHours
        p0?.storeAddress?.text = storeDetails.storeAddress
        p0?.storeName?.text = storeDetails.storeName
        p0?.storeImage?.imageAlpha = storeDetails.storeImage
    }

   class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
       val storeImage = itemView.findViewById(R.id.storeImage) as ImageView
       val storeName = itemView.findViewById<TextView>(R.id.storeName)
       val storeAddress = itemView.findViewById(R.id.storeAddress) as TextView
       val openingHours = itemView.findViewById(R.id.openingHours) as TextView
   }
}