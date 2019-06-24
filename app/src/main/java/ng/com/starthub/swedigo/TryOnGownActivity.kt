package ng.com.starthub.swedigo

import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.HeaderViewListAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_try_on_gown.*
import android.Manifest
import android.graphics.Bitmap
import android.net.Uri
import android.os.Environment
import android.Manifest.permission.READ_EXTERNAL_STORAGE
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Environment.getExternalStorageDirectory
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import android.Manifest.permission.CAMERA
import android.widget.Gallery
import java.io.File


class TryOnGownActivity : AppCompatActivity() {
    private  val Gallery =1
    private  val CAMARA =2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_try_on_gown)

        textView25.setOnClickListener {

            setUpPermission()

        }

        textView26.setOnClickListener {
            Toast.makeText(applicationContext, "welcome", Toast.LENGTH_SHORT).show()
        }

/*
        fun takePhoto() {
            val intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (intent1.resolveActivity(packageManager) != null) {
                startActivityForResult(intent1, REQUEST_TAKE_PHOTO)
            }
        }
*/
    }
// setting up camara  and photo gallary permission
    private fun setUpPermission(){
        val permission = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
        if(permission != PackageManager.PERMISSION_GRANTED){
            makeRequest()
        } else{

            startActivity(Intent(this, TryOnGownActivity::class.java))
        }

    }

    private fun makeRequest(){
        val onRequestPermissionsResult = ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.CAMERA),CAMERA_REQUEST_CODE)
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {

        when(requestCode){
            CAMERA_REQUEST_CODE -> {

                if (grantResults.isEmpty() || grantResults[1] != PackageManager.PERMISSION_GRANTED){

                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show()

                }else {

                    val intentgown= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (intentgown.resolveActivity(packageManager) !=null) {
//                startActivityForResult(intent1, REQUEST_TAKE_PHOTO)
                        //   Intent(Intent.ACTION_MEDIA_MOUNTED,Uri.parse("file://"+Environment.getExternalStorageDirectory())

                        // val file = File((Environment.getExternalStorageDirectory).toString() + "MyFile.jpg")
                        //  val uri = Uri.fromFile(file)

                        intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                        // intent1.putExtra(MediaStore.EXTRA_OUTPUT, uri)

                        startActivityForResult(intentgown, REQUEST_TAKE_PHOTO)
                        //}

                    }

                }
            }

        }
    }



    fun onRequestPermissionResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (requestCode ==CAMERA_REQUEST_CODE && resultCode == RESULT_OK) {
            val imageBitmap = data.extras.get("data") as Bitmap
            imageView.setImageBitmap(imageBitmap)
        }
    }


    companion object {
        private val CAMERA_REQUEST_CODE = 123
        private val REQUEST_TAKE_PHOTO = 1
    }

    /* @Throws(IOException::class)
     private fun createFile(): File {
         // Create an image file name
         val pic: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
         val storageDir: File = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
         return File.createTempFile(
                 "JPEG_${pic}_",
                 ".jpg",
                 storageDir
         ).apply {
             // Save a file: path for use with ACTION_VIEW intents
             var mCurrentPhotoPath = absolutePath
         }
     }*/


    /* private fun takePicture() {

         val intent: Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
         val file: File = createFile()

         val uri: Uri = FileProvider.getUriForFile(
                 this,
                 "com.example.android.fileprovider",
                 file
         )
         intent.putExtra(MediaStore.EXTRA_OUTPUT,uri)
         startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)

     override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {

             //To get the File for further usage
             val auxFile = File(mCurrentPhotoPath)


             var bitmap :Bitmap=BitmapFactory.decodeFile(mCurrentPhotoPath)
             imageView.setImageBitmap(bitmap)

         }
     }*/
}



