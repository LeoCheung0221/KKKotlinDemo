package com.tufusi.kkkotlin.basic.multi_thread

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tufusi.kkkotlin.R
import kotlinx.android.synthetic.main.activity_sync_with_main_thread.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description
 */
class SyncWithMainThread : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sync_with_main_thread)
    }

    fun onClick(view: View) {
        CallTask().execute()
    }

    private inner class CallTask : AsyncTask<Unit, Unit, Int>() {
        override fun doInBackground(vararg p0: Unit?): Int {
            return add(3, 5)
        }

        override fun onPostExecute(result: Int?) {
            // synchronization with the main thread
            // for update user interface
            tvSyncWithMainThreadText.text = result!!.toString()
        }
    }

    fun add(a: Int, b: Int): Int {
        Thread.sleep(3000)
        return a + b
    }
}