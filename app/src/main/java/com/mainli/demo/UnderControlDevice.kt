package com.mainli.demo

import androidx.annotation.Keep
import java.io.Serializable

/**
 * Description : TODO
 * Created by songle@baidu.com on 2021/11/10.
 */
@Keep
data class UnderControlDevice(
        val applianceId: String?,
        val applianceType: String?,
        val clickUrl: String?,
        val components: List<Component>?,
        val controlDeviceId: String?,
        val deviceAbility: List<Any>?,
        val groupName: String?,
        val iconUrl: String?,
        val onlineStatus: Boolean?,
        val tips: String?,
        val settingPageURL: String?,
        val statusDescription: String?,
        val statusIconColor: String?,
        val applianceConnectType: String?,
        val deviceConnectInfo: DeviceConnectInfo?
    // var clientType: String?=null

) : Serializable, BaseDevice() {

    override fun getType(): String {
        return applianceType ?: ""
    }

    override fun getImage(): String? {
        return iconUrl
    }

}

