package com.mainli.demo.ui

import android.app.Activity
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.request.target.DrawableImageViewTarget

class ReportDrawableImageViewTarget(view: ImageView?) : DrawableImageViewTarget(view) {
    val activity: Activity?

    init {
        activity = view?.context as? Activity?
    }

    override fun setResource(resource: Drawable?) {
        super.setResource(resource)
        if (resource != null) {
            activity?.reportFullyDrawn()
        }
    }
}