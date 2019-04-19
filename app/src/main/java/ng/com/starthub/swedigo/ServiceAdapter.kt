package ng.com.starthub.swedigo

import android.content.Intent
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ServiceAdapter(val ServiceDetailsList: ArrayList<ServiceDetails>) : RecyclerView.Adapter<ServiceAdapter.ViewHolder>(){
     override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.service_list, p0, false)
        return ViewHolder(v)
     }

     override fun getItemCount(): Int {
         return ServiceDetailsList.size
     }

     override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
         val serviceDetails: ServiceDetails = ServiceDetailsList[p1]

         p0?.serviceTitle?.text = serviceDetails.serviceTitle
         p0?.serviceImage?.imageAlpha = serviceDetails.serviceImage

     }

     class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val serviceImage = itemView.findViewById(R.id.serviceImage) as ImageView
         val serviceTitle = itemView.findViewById(R.id.serviceTitle) as TextView
    }
 }