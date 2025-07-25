package com.example.retina // Make sure this matches your actual package name

import android.util.Log
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy

class ObjectAnalyzer : ImageAnalysis.Analyzer {

    override fun analyze(image: ImageProxy) {
        // This is where the magic will happen.
        // For now, we'll just log a message to confirm it's working.
        Log.d("ObjectAnalyzer", "New frame received for analysis.")

        // IMPORTANT: You must call close() on the image, otherwise no new images will be received
        image.close()
    }
}
