package com.mainli.demo

import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jcodecraeer.xrecyclerview.XRecyclerView

class RefreshActivity : AppCompatActivity() {
    private lateinit var xRecyclerView: XRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refresh)
        xRecyclerView = findViewById(R.id.list)
        xRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val demoAdapter = DemoAdapter()
        xRecyclerView.adapter = demoAdapter
        xRecyclerView.setLoadingMoreEnabled(true)
        xRecyclerView.setPullRefreshEnabled(true)
        xRecyclerView.setLoadingListener(LoadingListener(xRecyclerView, demoAdapter))
        xRecyclerView.setLimitNumberToCallLoadMore(-100);
    }
}

class LoadingListener(val recyclerView: XRecyclerView, val demoAdapter: DemoAdapter) :
    XRecyclerView.LoadingListener {
    override fun onRefresh() {
        demoAdapter.count = 2
        demoAdapter.notifyDataSetChanged()
        recyclerView.refreshComplete()
    }

    override fun onLoadMore() {
        val count = demoAdapter.count;
        demoAdapter.count = count + 2
        demoAdapter.notifyItemRangeInserted(count, 2)
        recyclerView.loadMoreComplete()
    }
}

class DemoAdapter : RecyclerView.Adapter<DemoViewHolder>() {
    var count = 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder =
        DemoViewHolder(parent.context)

    override fun getItemCount(): Int = count

    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        holder.onBind(position)
    }
}

class DemoViewHolder : RecyclerView.ViewHolder {
    constructor(context: Context) : super(TextView(context))

    fun onBind(position: Int) {
        (itemView as TextView).setText("$position - aaaaa")
    }
}