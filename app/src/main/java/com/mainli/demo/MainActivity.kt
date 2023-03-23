package com.mainli.demo

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mainli.demo.databinding.ActivityMainBinding
import com.mainli.demo.trace.TraceProcess
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity(), ViewTreeObserver.OnPreDrawListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TraceProcess.traceMethodBegin("MainActivity_onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        val viewTreeObserver = binding.root.viewTreeObserver
        viewTreeObserver.addOnPreDrawListener(this)
        TraceProcess.traceMethodEnd("MainActivity_onCreate")
        binding.root.setOnClickListener {
            aa()
        }
        val jsonObject = JSONObject()
        jsonObject.put("aaa", Arrays.asList("1", "2"))
        Log.d("Mainli", "onCreate: ${jsonObject}")

    }

    override fun onPreDraw(): Boolean {
        binding.root.viewTreeObserver.removeOnPreDrawListener(this)
        val readProcessForkRealtimeMillis = Processes.getCurrentStartTime()
        Log.i(
            "<Mainli>",
            "onCreate: ${(SystemClock.elapsedRealtime() - readProcessForkRealtimeMillis)}"
        )
        TraceProcess.traceEnd()
        return true
    }
}