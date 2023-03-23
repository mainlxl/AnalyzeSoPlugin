package com.mainli.demo

import androidx.annotation.Keep
import java.io.Serializable

@Keep
data class MyIotApplianceListPayload(
    val controlDevices: List<ControlDevice>?,
    val underControlDevices: List<UnderControlDevice>?,
    val groupListRank: List<GroupRank>?,
    val token: String?
) : Serializable

@Keep
data class ControlDevice(
    val deviceId: String?,
    val groupName: String?
) : Serializable

@Keep
data class GroupRank(
    val groupName: String?,
    val groupId: String?
) : Serializable

@Keep
data class Component(
    val item: List<Item>?,
    val type: String?
) : Serializable

@Keep
data class Item(
    val state: String?,
    val switches: Switches?
) : Serializable

@Keep
data class Switches(
    val off: Switch?,
    val on: Switch?,
    val all: Switch?
) : Serializable

@Keep
data class SendCommandPayload(
    val dataList: List<Data>?,
    val address: String?,
    val maxRetry: Int?,
    val globalTid: Int?,
    val sendTimeout: Int?,
    val token: String?,
    val type: String?
) : Serializable

@Keep
data class SetStatePayload(
    val attribute: String?,
    val attributeValue: String?,
    val messageType: Int?,
    val address: String?,
    val maxRetry: Int?,
    val globalTid: Int?,
    val sendTimeout: Int?,
    val token: String?,
    val type: String?,
    val transitionTime: Int?,
    val delay: Int?,
    val isNeedUnACK: Boolean?
) : Serializable

@Keep
data class Data(
    val data: String?,
    val expectAckOpcode: String?,
    val sendOpcode: String?
) : Serializable

@Keep
data class Switch(
    val clickUrl: String?,
    val iconUrl: String?,
    val sendCommandPayload: SendCommandPayload?,
    val setStatePayload: SetStatePayload?,
    val tips: String?
) : Serializable

@Keep
data class DeviceConnectInfo(
    val supportRelay: Boolean?,
    val supportProxy: Boolean?,
    val supportTinyMesh: Boolean?,
    val isLowPower: Boolean?,
    val mac: String?,
    val uuid: String?,
    val unicastAddress: String?,
    val isNeedSetFilterType: Boolean?,
    val isNeedSetWhiteList: Boolean?,
    val timeout: Int?,
    val whiteList: String?,
    val positionNum: Int?
) : Serializable {

    fun getIsNeedSetFilterType(): Boolean? {
        return isNeedSetFilterType
    }

    fun getIsNeedSetWhiteList(): Boolean? {
        return isNeedSetWhiteList
    }

    fun getIsLowPower(): Boolean? {
        return isLowPower
    }

}


