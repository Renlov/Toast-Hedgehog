package com.hedgehog.toastlib

import android.app.Activity
import android.widget.Toast
import androidx.fragment.app.Fragment

class ToastClass {

}

fun <T : Activity> T.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun <T : Fragment> T.toast(message: String) {
    Toast.makeText(requireContext(),message, Toast.LENGTH_SHORT).show()
}