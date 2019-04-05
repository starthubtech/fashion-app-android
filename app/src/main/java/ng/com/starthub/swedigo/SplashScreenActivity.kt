package ng.com.starthub.swedigo
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity


class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        supportActionBar!!.hide()

    Handler().postDelayed(
    {
        startActivity(Intent(this, OnboardingActivity ::class.java))
        finish()
    }, SPLASH_TIME_OUT)

}}