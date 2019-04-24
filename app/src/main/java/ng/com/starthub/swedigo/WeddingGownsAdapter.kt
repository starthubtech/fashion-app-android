package ng.com.starthub.swedigo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class WeddingGownsAdapter(val WeddingGownsDetailsList: ArrayList<WeddingGownsDetails>):RecyclerView.Adapter<WeddingGownsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): WeddingGownsAdapter.ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.wedding_gowns_detail, p0, false)
        return WeddingGownsAdapter.ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return WeddingGownsDetailsList.size

    }

    override fun onBindViewHolder(p0: WeddingGownsAdapter.ViewHolder, p1: Int) {
        val weddingGownsDetails : WeddingGownsDetails = WeddingGownsDetailsList[p1]

        p0?.storeName?.text= weddingGownsDetails.storeName
        p0?.storeDesc?.text= weddingGownsDetails.storeDesc
        p0?.storeImage?.imageAlpha= weddingGownsDetails.storeImage
        p0?.storePrice?.text=weddingGownsDetails.storePrice

    }

   class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
       val storeImage = itemView.findViewById(R.id.storeImage) as ImageView
       val storeDesc = itemView.findViewById(R.id.storeDesc) as TextView
       val storeName = itemView.findViewById(R.id.storeName) as TextView
       val storePrice = itemView.findViewById(R.id.storePrice) as TextView
   }
}