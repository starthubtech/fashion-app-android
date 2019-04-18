package ng.com.starthub.swedigo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class PopularStoreAdapter(val PopularStoreDetailsList: ArrayList<PopularStoreDetails>) : RecyclerView.Adapter<PopularStoreAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PopularStoreAdapter.ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.popular_stores, p0, false)
        return PopularStoreAdapter.ViewHolder(v)

    }

    override fun getItemCount(): Int {
      return PopularStoreDetailsList.size
    }

    override fun onBindViewHolder(p0: PopularStoreAdapter.ViewHolder, p1: Int) {
        val popularStoreDetails: PopularStoreDetails = PopularStoreDetailsList[p1]

        p0?.descStore?.text= popularStoreDetails.descStore
        p0?.imageStore?.imageAlpha = popularStoreDetails.imageStore
        p0?.nameStore?.text = popularStoreDetails.nameStore
    }

    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {

        val imageStore = itemView.findViewById(R.id.imageStore) as ImageView
        val nameStore = itemView.findViewById(R.id.nameStore) as TextView
        val descStore = itemView.findViewById(R.id.descStore) as TextView
    }

}
