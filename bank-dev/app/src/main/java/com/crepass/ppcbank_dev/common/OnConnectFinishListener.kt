package com.crepass.ppcbank_dev.common

interface OnConnectFinishListener {
//    fun success(response: Responses, funcName: String, adapter: Any? = null)
    fun failed(message: String, funcName: String)
}