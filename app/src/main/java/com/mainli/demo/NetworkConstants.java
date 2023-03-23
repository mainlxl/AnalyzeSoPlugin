package com.mainli.demo;

import androidx.annotation.Keep;

@Keep
public class NetworkConstants {
    public static String XIAODU_HOST = "https://xiaodu.baidu.com";
    public static String XIAODU_BOSS_PATH = "";
    public static final String APPSERVER_GATEWAY = "/appserver/gateway/app/v1";
    // gateway请求path
    public static String URL_GATEWAY = XIAODU_HOST + APPSERVER_GATEWAY;

    public static final String XIAODUAPP_ANDROID_APP_ID = "dm217C979E2510CB9A";
    public static final String XIAODUAPP_CLIENT_ID = "djToFLwCyv1AQQrDp305nGBxiYfOWcdi";

    public static String RTC_XIAOYU_ADDRESS = "";


    /***
     * h5页面
     */
    // 智能家居：首页
    public static String H5_IOT_DEVICE_CONTROL = XIAODU_HOST + "/saiya/smarthome/index.html?from=oneapp#/?fullPage=1";
    // 智能家居：添加设备
    // public static final String H5_IOT_DEVICE_ADD = XIAODU_HOST + "/saiya/smarthome/index.html#/addDeviceEntry";
    // 智能家居：红外配置
    // public static final String H5_IOT_INFRARED_CONFIG = XIAODU_HOST + "/saiya/smarthome/index.html#/irDeviceList";
    // 家长控制：使用报告
    public static String H5_STUDY_REPORT = XIAODU_HOST + "/saiya/superapp/parents.html#/usageReport";
    public static String SPEAKER_H5_STUDY_REPORT = XIAODU_HOST + "/saiya/superapp/parents.html#/noScreenUsageReport?isDuerPad=0&showRightButtonChild=1";
    // 权限引导：各机型权限引导页
    public static final String H5_SETTING_ONEPLUS_GUIDE = "https%3a%2f%2fxiaodu.baidu.com%2fsaiya%2fhtml%2fmodule_template.html%3ftitle%3d%e4%b8%80%e5%8a%a0%e6%89%8b%e6%9c%ba%e8%ae%be%e7%bd%ae%e8%af%b4%e6%98%8e%26dataSource%3dhttps%3a%2f%2fduerstatic.bj.bcebos.com%2foperateapp%2f1599737024866-config.json";
    public static final String H5_SETTING_SAMSUNG_GUIDE = "https%3a%2f%2fxiaodu.baidu.com%2fsaiya%2fhtml%2fmodule_template.html%3ftitle%3d%e4%b8%89%e6%98%9f%e6%89%8b%e6%9c%ba%e8%ae%be%e7%bd%ae%e8%af%b4%e6%98%8e%26dataSource%3dhttps%3a%2f%2fduerstatic.bj.bcebos.com%2foperateapp%2f1599736477266-config.json";
    public static final String H5_SETTING_MEIZU_GUIDE = "https%3a%2f%2fxiaodu.baidu.com%2fsaiya%2fhtml%2fmodule_template.html%3ftitle%3d%e9%ad%85%e6%97%8f%e6%89%8b%e6%9c%ba%e8%ae%be%e7%bd%ae%e8%af%b4%e6%98%8e%26dataSource%3dhttps%3a%2f%2fduerstatic.bj.bcebos.com%2foperateapp%2f1599642888865-config.json";
    public static final String H5_SETTING_SMARTISAN_GUIDE = "https%3a%2f%2fxiaodu.baidu.com%2fsaiya%2fhtml%2fmodule_template.html%3ftitle%3d%e9%94%a4%e5%ad%90%e6%89%8b%e6%9c%ba%e8%ae%be%e7%bd%ae%e8%af%b4%e6%98%8e%26dataSource%3dhttps%3a%2f%2fduerstatic.bj.bcebos.com%2foperateapp%2f1599735940463-config.json";
    // 关于小度-用户协议
    /**
     * 新增回看功能，更新看护隐私协议
     */
    public static String ABOUT_TYPE_WATCH_ASSISTANT_PROTOCOL = XIAODU_HOST + "/saiya/superapp/tts.html#/protocolConfig?dataSource=https%3A%2F%2Fduerstatic.cdn.bcebos.com%2Fsuperapp%2FprotocolKanhu_1647406273370.txt ";
    public static String ABOUT_TYPE_USER_PROTOCOL = XIAODU_HOST + "/saiya/xiaodu/law/xiaodu.html";
    public static String ABOUT_TYPE_PRIVATE_PROTOCOL = XIAODU_HOST + "/saiya/xiaodu/privacylaw/index.html?type=APP";
    public static String ABOUT_TYPE_RESPONSIBILITY_FREE_PROTOCOL = XIAODU_HOST + "/saiya/superapp/tts.html#/protocolConfig?dataSource=https%3A%2F%2Fduerstatic.bj.bcebos.com%2Fsuperapp%2F家长鉴权功能说明.txt";


    /***
     * app server（此为老接口，新业务均走app gateway）
     * https://console.cloud.baidu-int.com/devops/icode/repos/baidu/duer/dueros-doc/tree/master:du-ui/xiaoduapp
     */
    // 闪屏页
    public static final String XIAODUAPP_INDEX_FLASH_SCREEN = "/xiaoduapp/v1/index/index/flashScreen";
    // 闪屏页真实展现上报
    public static final String XIAODUAPP_FLASHSCREEN_SHOW = "dueros://appserver/flashscreen/show";
    // 智能加速设备是否已签约
    public static final String XIAODUAPP_SPEEDIMPROVE_GET = "/xiaoduapp/v3/SpeedImprove/get";
    // 小浮窗广告位
    public static final String XIAODUAPP_INDEX_FLOAT_AD = "/xiaoduapp/v1/index/index/floatWindow";
    // 首页运营弹窗
    public static String XIAODUAPP_INDEX_POP_WINDOW = XIAODU_BOSS_PATH + "/xiaoduapp/v1/index/index/popWindow";
    // 首页数据
    public static String XIAODUAPP_MODULE_INDEX = XIAODU_BOSS_PATH + "/xiaoduapp/v3/module/index";
    // 音箱蓝牙耳机首页数据
    public static final String XIAODUAPP_APPFEED_INDEX = "/xiaoduapp/v3/appfeed/index";
    // 首页TAB数据
    public static String XIAODUAPP_MODULE_GET_LIST = XIAODU_HOST + XIAODU_BOSS_PATH + "/xiaoduapp/v3/module/getList?list=";
    public static final String XIAODUAPP_GET_ACTIVITY_INFO = "/xiaoduapp/v1/client/signActivity";
    // 金刚位分类广场
    public static String XIAODUAPP_MODULE_KINGKONG_CATEGORY = XIAODU_BOSS_PATH + "/xiaoduapp/v3/module/kingkongCategory";
    // 超能力TAB数据
    public static final String XIAODUAPP_MODULE_GET_PAGE_BY_NAME = "/xiaoduapp/v3/module/getPageByName";
    // 音箱配置网时，根据蓝牙前缀从云端获取配置信息
    public static final String XIAODUAPP_NETWORK_DEVICE_INFO = "/xiaoduapp/v1/client/networkDeviceInfo?bluetoothDeviceName=";
    // show配网查询设备绑定信息
    public static final String XIAODUAPP_DEVICE_BINDING_INFO = "/accountserver/app/v1/getdevicestatus";
    // 头像上传
    public static final String XIAODUAPP_IMAGE_UPLOAD = "/xiaoduapp/v1/resource/imageUpload";
    public static final String XIAODUAPP_GET_PAGE_BY_NAME = "/xiaoduapp/v3/module/getPageByName?name=minePage";
    // 权限引导弹窗，适配三方机型，获取适配列表
    public static final String XIAODU_APP_VENDOR_PERMISSION_LIST = "/xiaoduapp/v1/api/internal/permission/list";
    // 查询是否需要上传APP日志到Crab
    public static final String XIAODUAPP_APP_LOG_QUERY = "/xiaoduapp/v1/api/internal/appLog/query";
    // 成功上传APP日志到Crab后，清除需上传日志的标记位
    public static final String XIAODUAPP_APP_LOG_CALLBACK = "/xiaoduapp/v1/api/internal/appLog/callback";
    // 获取通勤时间
    public static final String XIAODUAPP_NAVIGATION_GET_COMMUTE = "/xiaoduapp/v1/navigation/getCommuteTime";
    // 设置通勤时间
    public static final String XIAODUAPP_NAVIGATION_SET_COMMUTE = "/xiaoduapp/v1/navigation/setCommuteTime";
    // 获取路况推送开关状态
    public static final String XIAODUAPP_NAVIGATION_GET_PUSH_SWITCH_STATUS = "/xiaoduapp/v1/navigation/getPushSwitchStatus";
    // 设置路况推送开关
    public static final String XIAODUAPP_NAVIGATION_SET_PUSH_SWITCH = "/xiaoduapp/v1/navigation/setPushSwitch";
    // 检查用户当前登录账号，是否是可以用手机号登录的
    public static final String XIAODUAPP_SECURE_MOBILE = "/xiaoduapp/v1/verify/securemobile";
    // TWS耳机配置
    public static final String GET_TWS_TRANS_CONFIG_URL = "/xiaoduapp/v1/client/getTwsRecognitionConfig";
    // 账号：获取rtc token：http://icode.baidu.com/repos/baidu/duer/open-platform-api-doc/blob/master:dueros-app-server/account-service/interface/device.md
    public static String URL_APP_LOGIN = XIAODU_HOST + "/appserver/account/v1/appLogin";
    // 账号：请求获取Passport Url
    public static final String ACCOUNT_GET_PASS_URL = "/account/device/getPassurl";
    // 账号：拉活时发送bduss给appserver
    public static final String URL_SEND_BDUSS_TO_SERVER = "/account/device/sendBDUSS";
    // 音色合成：获取音色合成的tokenId
    public static final String URL_TIMBRE_FETECH_TOKENID = "/speech/api/personalize/getTokenid";
    // 音色合成：上传录制语音接口
    public static final String URL_TIMBRE_UPDATE_INFO = "/speech/api/personalize/uploadstoryAudio";


    // 获取礼物信息的接口
    public static String URL_GET_GIFT_INFO_URL = XIAODU_BOSS_PATH + "/xiaoduapp/v3/gift/getReceivedGift";

    /***
     * app gateway
     * https://console.cloud.baidu-int.com/devops/icode/repos/baidu/duer/open-platform-api-doc/tree/master:dueros-app-server/app-gateway-service
     */

    // 打点：{@link StatisticsUtil#onAppServerEvent}打点环境
    public static String GATEWAY_LOG_HOST = XIAODU_HOST;
    // 用户的设备列表，包括主控和被控
    public static final String GATEWAY_MY_DEVICES = "dueros://appserver/internal/myDevice";
    // 添加设备列表
    public static final String GATEWAY_SUPPORTED_DISPLAY_LIST = "dueros://appserverGo/xiaoduapp/v1/client/getSupportedDisplayList";
    // 支持的设备列表
    public static final String GATEWAY_GET_SUPPORTED_DEVICE_LIST = "dueros://appserverGo/xiaoduapp/v1/client/getAppConf";
    // 支持的设备列表
    public static final String GATEWAY_GET_DEVICE_LOCATION = "dueros://appserver/internal/getDeviceLocation";
    // 个人中心页信息
    public static final String GATEWAY_PERSONAL_INFO = "dueros://account/getUserInfo";
    // 个人中心vip信息
    public static final String MEMBERSHIP_GET_VIP_INFO = "dueros://membership/user/GetVipInfo";
    // 个人中心等级信息
    public static final String USER_LEVEL_INFO = "dueros://appserver/userLevel/getUserLevel";
    // 设备绑定/解绑成长值变动
    public static final String BIND_UNBIND_DEVICE_GROWTH_VALUE = "dueros://appserver/userLevel/userDevice";
    // 用户等级活跃
    public static final String USER_LEVEL_ACTIVE = "dueros://appserver/userLevel/userActive";
    // 小度会员入口
    public static final String XIAODU_VIP_ENTRY_INFO  = "dueros://bot_membership/vipCenter/VipEntryInfo";
    // 广告
    public static final String GATEWAY_AD = "dueros://appserver/internal/getAdvertisement";
    // 金币
    public static final String GATEWAY_GOLD_COINS = "dueros://dumall_app/action/GetGoldList";
    // 隐私：拉取首页隐私协议内容
    public static final String PRIVACY_GET_PROTOCOL_INFO = "dueros://appserver/internal/privacy/info";
    // 隐私：同意隐私协议
    public static final String PRIVACY_AGREE_PROTOCOL = "dueros://appserver/internal/privacy/agree";
    // 隐私：拉取使用提示状态：回家看看 视频通话 远程控制 看护助手
    public static final String PRIVACY_GET_USING_TIPS_STATUS = "dueros://appserver/internal/privacy/tip";
    // 隐私：更新使用提示状态
    public static final String PRIVACY_UPDATE_USING_TIPS = "dueros://appserver/internal/privacy/updateTip";
    // 隐私：获取用户关于隐私协议的状态接口
    public static final String PRIVACY_CHECK_FORBIDDEN = "dueros://appserver/internal/privacy/checkForbidden";
    // 隐私：bot看护助手发送申请
    public static String PRIVACY_CAPTURE_PUSH_SHOW_CONFIRM = XIAODU_BOSS_PATH + "/xiaoduapp/v1/proxy/post?server=smart_capture&path=/smartcapture/api/pushshowconfirm";
    // 隐私：bot拉取看护助手风控状态
    public static String PRIVACY_GET_CAPTURE_MODE = XIAODU_BOSS_PATH + "/xiaoduapp/v1/proxy/post?server=smart_capture&path=/smartcapture/api/getCaptureMode";
    // 小度App获取播放器页面、搜索页面和个人中心页面广告
    public static final String URL_GET_ADVERTISEMENT = "dueros://appserver/internal/getAdvertisement";

    // 获取育儿助手会员信息
    public static final String MEMBERSHIP_STATUS_RAISE_CHILD_ASSISTANT = "dueros://xiaodu_raise_child_assistant/space/GetMembershipStatus";
    // 育儿助手授权管理
    public static final String INVITE_AUTHORIZATION_RAISE_CHILD_ASSISTANT = "dueros://xiaodu_raise_child_assistant/space/Authorization";
    // 个人页面育儿助手入口
    public static final String RAISE_CHILD_ASSISTANT_ENTRANCE_USER_PAGE = "dueros://personal_center/GetResource";

    // 获取宝宝空间动态列表
    public static final String RAISE_CHILD_ASSISTANT_GET_SPACE_LIST = "dueros://xiaodu_raise_child_assistant/space/GetSpaceList";

    // 删除宝宝空间动态
    public static final String RAISE_CHILD_ASSISTANT_DELETE_SPACE = "dueros://xiaodu_raise_child_assistant/space/DeleteSpaceItem";

    // 回家听听请求信息列表
    public static final String LISTEN_GET_LATEST_AUDIO_INFO = "dueros://xiaodu_abnormal_sound_detect/getAudioList";

    public static final String MIRROR_INSTALL_TIP_INFO = "dueros://media_middle_service_golang/smartMirrorApp/appInstallTip";

    public static final String MIRROR_INSTALL_TIP_AGREE = "dueros://media_middle_service_golang/smartMirrorApp/appOOBEAgree";

    public static String XIAODUAPP_INDEX_GUIDE_WINDOW = XIAODU_BOSS_PATH + "/xiaoduapp/v1/index/index/guideWindow?type=";

    public static final String XIAODUAPP_SWITCH = "/xiaoduapp/v1/index/index/setSwitch?actionType=%s&cardId=%s";

    /***
     * didp相关
     */
    // 底TAB配置，目前仅用户控制底TAB是否展示VIP
    public static final String DIDP_BOTTOM_TAB_MODE = "appHomeConfig.bottomTabMode";
    // 是否支持隐私升级
    public static final String DIDP_PRIVACY_HAVE_UPDATED = "privacy.haveUpdated";
    // "咨询客服"H5
    public static final String DIDP_CUSTOMER_SERVICE_URL = "appCustomerServiceConfig.url";
    // 帮助中心、咨询客服服务配置，如果云端下发就使用该链接，如果不下发按照原来的走
    public static final String DIDP_HELP_CENTER_URL = "appHelpCenterConfig.url";
    // 三方音箱配置
    public static final String DIDP_THIRD_PARTY_LOUD_SPEAKER = "thirdPartyLoudSpeakerConf";
    // 家庭圈权限配置
    public static final String DIDP_FAMILY_CIRCLE_PERMISSION = "familyCircle.permission";
    // OOBE配置
    public static final String DIDP_OOBE_MODE = "clientFeature.OobeConfig";
    // 获取didp配置的接口
    public static String DIDP_CONFIG = XIAODU_BOSS_PATH +
            "/xiaoduapp/v1/client/getDidpConf?clientConf=clientFeature"
            + "," + DIDP_BOTTOM_TAB_MODE
            + "," + DIDP_PRIVACY_HAVE_UPDATED
            + "," + DIDP_CUSTOMER_SERVICE_URL
            + "," + DIDP_HELP_CENTER_URL
            + "," + DIDP_THIRD_PARTY_LOUD_SPEAKER
            + "," + DIDP_FAMILY_CIRCLE_PERMISSION;

    // 获取didp配置的接口 获取oobe配置
    public static String DIDP_OOBE_CONFIG = XIAODU_BOSS_PATH + "/xiaoduapp/v1/client/getDidpConf?clientConf=" + DIDP_OOBE_MODE;
    /***
     * app server：proxy（此为老接口，新业务均走app gateway）
     * appserver很多资源露出接口，appserver主要负责鉴权（BDUSS换取dumiId，baiduUid）、基础信息获取（didp配置、app配置）、请求分发、结果适配，不涉及具体业务功能，这部分可抽象出通用proxy接口，减少开发联调成本。
     * https://console.cloud.baidu-int.com/devops/icode/repos/baidu/duer/dueros-doc/blob/master:du-ui/xiaoduapp/%E6%8E%A5%E5%8F%A3%E8%A7%84%E8%8C%83.md#proxy%E8%A7%84%E8%8C%83
     */
    // 儿童隐私状态查询
    public static final String CHECK_CHILD_PRIVACY = "/xiaoduapp/v1/proxy/get?server=child_calendar&path=/childlaunchpad/api/checkChildPrivacy";
    // 儿童隐私状态修改
    public static final String SET_CHILD_PRIVACY = "/xiaoduapp/v1/proxy/post?server=child_calendar&path=/childlaunchpad/api/setChildPrivacy";
    // 获取asr hint
    public static final String XIAODUAPP_PROXY_GET_ALL_HINTS = "/xiaoduapp/v1/proxy/get?path=/userguide/getallhints&server=user_guide";


    /***
     * app server：http
     * 提供的app访问bot通用接口（此为老接口，新业务均走app gateway）
     * https://console.cloud.baidu-int.com/devops/icode/repos/baidu/duer/dueros-doc/blob/master:du-ui/xiaoduapp/http-interface.md
     */
    public static final String HTTP_V1 = "/xiaoduapp/v1/http";
    // 播放器有声推荐列表
    public static final String UNICAST_PLAYER_RECOMMEND_URL = "dueros://audio_unicast/api/recommendByItem?entity_id=%s&sourceFrom=PLAYER";
    // 播放器音乐推荐列表
    public static final String MUSIC_PLAYER_RECOMMEND_URL = "dueros://audio_music/api/recommendByItem?entity_id=%s&sourceFrom=PLAYER";
    // 检查是否设置音乐为闹钟u
    public static final String PLAYING_CHECK_ALARM = "dueros://alarm.bot.dueros.ai/alarm_ring/get_this_song_status?type=ALARM";
    // 设置音乐为闹钟
    public static final String PLAYING_SET_ALARM = "dueros://alarm.bot.dueros.ai/alarm_ring/set_this_song?type=ALARM&status=0";
    // 取消设置音乐为闹钟
    public static final String PLAYING_CANCEL_ALARM = "dueros://alarm.bot.dueros.ai/alarm_ring/set_this_song?type=ALARM&status=1";


    /***
     * 旁路：推送、消息中心相关
     * http://wiki.baidu.com/pages/viewpage.action?pageId=576437645
     */
    // Push绑定接口
    public static final String PUSH_BIND = "/device_service/v1/connectToPushService";
    // Push解绑接口
    public static final String PUSH_UNBIND = "/device_service/v1/disconnectFromPushService";
    // 消息列表
    public static final String MESSAGE_LIST = "/device_service/v1/getAppMsgList";
    // 获取新消息数量
    public static final String MESSAGE_NEW_COUNT = "/device_service/v1/getAppNewMsgNum";
    // 设置全部消息已读
    public static final String MESSAGE_SET_READ = "/device_service/v1/setAppMsgRead";
    // 设置部分消息已读
    public static final String MESSAGE_SET_TARGET_READ = "/device_service/v1/setAppTargetMsgRead";
    // 删除消息
    public static final String MESSAGE_DELETE_APP_MESSAGE = "/device_service/v1/deleteAppMsg";


    /***
     * 旁路：saiya接口（此为老接口，新业务均走app gateway）
     * http://agroup.baidu.com/duer/md/article/449678
     */
    // 获取用户信息
    public static String SAIYA_USER_GET_INFO = XIAODU_BOSS_PATH + "/saiya/user/getInfo";
    // 设备列表，包含管理员和非管理员设备
    public static String SAIYA_MERGE_LIST = XIAODU_BOSS_PATH + "/saiya/device/mergelist";
    // 设备列表(旧接口)，仅包含管理员设备
    public static String SAIYA_DEVICE_LIST = XIAODU_BOSS_PATH + "/saiya/device/list";
    // 刷新accessToken
    public static final String SAIYA_REFRESH_TOKEN = "/saiya/device/refreshToken";
    // 云端储存accessToken/refreshToken
    public static final String SAIYA_STORE_AUTH_TOKEN = "/saiya/device/storeAuthToken";
    // 获取家/公司地址
    public static final String SAIYA_USER_INFO = "/saiya/userinfo";
    // 设置家庭地址
    public static final String SAIYA_SET_HOME_ADDRESS = "/saiya/userinfo/updatehomeaddress";
    // 设置公司地址
    public static final String SAIYA_SET_COMPANY_ADDRESS = "/saiya/userinfo/updatework";
    // 上传联系人
    public static final String SAIYA_UPLOAD_CONTACTS = "/saiya/Dcscontacts/upload";


    // 旁路：会员相关
    //public static final String VIP_DIALOG_INFO = "https://xiaodu.baidu.com/dbppay/skill-pay/xiaoduapp/xiaoduvipintro";
    // 会员viptab
    public static final String HOME_VIP_TAB = "https://xiaodu.baidu.com/saiya/superapp/xiaoduvip.html#/viptab";


    /***
     * 旁路：百度网盘相关
     */
    public static final String NETDISK_FETCH_STATE_URL = "https://duerbot-open.baidu.com/album/multismart/album/getpanauth";
    public static final String NETDISK_SET_STATE_URL = "https://duerbot-open.baidu.com/album/multismart/album/setpanallauth";
    public static final String NETDISK_PROTOCOL_URL = "https://xiaodu.baidu.com/saiya/xdv1/pan-protocol.html";
    public static final String NETDISK_PEN_HELP_URL = "https://ufosdk.baidu.com/ufosdk/answer/YMZLKkuOr77raAS85lSzdg%3D%3D/%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%2016254/245281/0?pkgname=%E5%B0%8F%E5%BA%A6APP&appvn=1.1.0&uid=&user=&baiducuid=";
    public static final String NETDISK_PEN_PRIVACY_THAT_URL = "https://xiaodu.baidu.com/saiya/superapp/tts.html#/protocolConfig?dataSource=https%3A%2F%2Fduerstatic.cdn.bcebos.com%2Fsuperapp%2FdiskUniteProtocol_1637914710503.txt";
    public static final String NETDISK_PEN_SPECIAL_TERMS_URL = "https://xiaodu.baidu.com/saiya/superapp/tts.html#/protocolConfig?dataSource=https%3A%2F%2Fduerstatic.cdn.bcebos.com%2Fsuperapp%2FpenClause_1637914877389.txt";


    /***
     * 旁路：留言相关
     */
    public static final String GET_NEW_MESSAGE_COUNT = "/videocall/messagebox/api/getnewmessagecount";


    /**
     * 旁路：智能家居相关
     */
    // 拉取IOT设备列表
    public static final String GET_IOT_DEVICES = "dueros://smarthome.bot.dueros.ai/app/applianceList";


    /**
     * 旁路：音乐相关
     */
    // qq音乐用户信息
    public static final String URL_TENCENT_USER_INFO = "/v20161223/qqmusic/userinfo";
    // qq音乐登录
    public static final String URL_TENCENT_LOGIN = "/v20161223/qqmusic/login";
    // qq音乐强制登录开关
    public static final String QQ_LOGIN_CONFIG = "/music/qq/v2/appconf";
    // 获取登录qq音乐后的弹窗资源
    public static final String QQ_MUSIC_RESOURCE = "/music/qq/v2/loginsuccess";
    // 获取登录二维码
    public static final String URL_MINI_PROGRAM_QR_CODE = "/v20161223/qqmusic/loginqrcode";
    // 轮询扫码登录结果
    public static final String URL_MINI_PROGRAM_POLL_LOGIN_RESULT = "/v20161223/qqmusic/appauthpoll";
    // 牛方案Tme相关  TME /v20161223/tencentmusic/appconfig
    public static final String THIRDPARTY_AUTH_APP_CONFIG = "/v20161223/thirdparty/appconfig";
    public static final String TME_UPLOADE_AUTH_LOGIN = "/v20161223/tencentmusic/login";
    public static final String TME_BENEFIT_INFO = "/v20161223/tencentmusic/benefitinfo";
    public static final String TME_BENEFIT_GETBENEFIT = "/v20161223/tencentmusic/getbenefit";
    public static final String TME_DEVICES_ACTIVE = "/v20161223/tencentmusic/active";
    public static final String TME_GET_MINI_APP_INFO = "/v20161223/tencentmusic/appinfocode";
    public static final String TME_GET_MINI_APP_LOGIN = "/v20161223/tencentmusic/minipauth";
    public static final String TME_GET_LOGOUT = "/v20161223/tencentmusic/logout";
    public static final String TME_HELP_H5_PAGE = XIAODU_HOST + "/saiya/superapp/operate.html#/musicQa";
    // 酷狗手机号登录成功
    public static final String TME_KUGOU_AFTER_PHONE_LOGIN = "/v20161223/tencentmusic/afterphonelogin";
    // 网易云音乐
    public static final String NETEASE_GET_LOGOUT = "/v20161223/neteaseapi/logout";
    // 其他
    public static final String QQ_MUSIC_PACKAGE = "com.tencent.qqmusic";
    public static final String QQ_APP_PACKAGE = "com.tencent.mobileqq";
    public static final String NETEASY_APP_PACKAGE = "com.netease.cloudmusic";
    public static final String DOWNLOAD_QQ_MUSIC_PACKAGE = "http://y.qq.com/m/downqqmusic.html?channelId=10040866";
    public static final String DOWNLOAD_QQ_APP_PACKAGE = "https://cftweb.3g.qq.com/qqappstore/detail?h5=true&gdt=true&packName=com.tencent"
            + ".mobileqq&channel=&via=ANDROIDQQ.FEED.ADVERTISE";


    /***
     * 旁路：小程序相关
     */
    // 获取小程序列表
    public static final String URL_GET_MINI_PROGRAM_LIST = "/xiaoduapp/v1/Miniprogram/list";
    // 启用小程序（同意协议）
    public static final String URL_MINI_PROGRAM_OPEN_ENABLE = "/xiaoduapp/v1/Miniprogram/updateStatus";
    // 获取第三方的token
    public static final String URL_MINI_PROGRAM_FETCH_THIRDPART_TOKEN = "/xiaoduapp/v1/Miniprogram/genthirdpartytoken";


    /***
     * 旁路：H5缓存相关
     */
    public static final String URL_CACHE_H5 = XIAODU_HOST + "/webssr/public/manifest.json";


    /***
     * link click相关地址
     */
    // 有声订阅
    public static final String UNICAST_SUBSCRIBE = "dueros://audio_unicast/getSubscribeList";
    //给喜马拉雅回传OAID
    public static final String UNICAST_MOBILE_DEVICE_ID = "dueros://audio_unicast/api/gateway/saveAppId";
    // 广告效果归因上报OAID和IMEI
    public static final String UNICAST_SAVE_MOBILE_DEVICE_ID = "dueros://bot_ad/saveMobileDeviceId";


    /**
     * 小度路由器
     */
    public static final String GET_CUR_DUER_ROUTER_INFO = "http://xiaoduwifi.com:8602/app/v2/get_router_configure_status";


    /***
     * passport
     */
    // 换取DeviceBduss
    public static final String URL_GET_DEVICE_BDUSS = "https://passport.baidu.com/v3/login/cuidbdusslogin";


    /***
     * 地图车主服务
     */
    private static final String BASE_URL_MAP_SERVER = "https://carowner.baidu.com";
    // 地图车主服务，车牌获取接口
    public static final String SETTINGS_GET_CAR_PLATE = BASE_URL_MAP_SERVER + "/carownerui/api/car/get";
    // 地图车主服务，车牌增加接口
    public static final String SETTINGS_ADD_CAR_PLATE = BASE_URL_MAP_SERVER + "/carownerui/api/car/add";
    // 地图车主服务，车牌更新接口
    public static final String SETTINGS_UPDATE_CAR_PLATE = BASE_URL_MAP_SERVER + "/carownerui/api/car/update";

    public static final String GET_ACCOUNT_CONFIG = "/serverconfig/account/getappconfig";


    /**
     * 获取评论数
     */
    public static final String COMMENT_REPLY_COUNT = "dueros://comment/base/tcount";

    /**
     * 评论点赞
     */
    public static final String COMMENT_UP_DOWN = "dueros://comment/base/updown";

    /**
     * 获取评论列表
     */
    public static final String COMMENT_GET_LIST = "dueros://comment/base/getlist";

    /**
     * 评论打点
     */
    public static final String COMMENT_STATISTICS = "dueros://comment/Clicked";

    /**
     * oaid 云端证书地址
     */
    public static final String OAID_CLOUD = "/xiaoduapp/v3/certificate/get";

    /**
     * H5 - 单曲评论详情页
     */
    public static String WEB_URL_COMMENT_SINGLE = XIAODU_HOST + "/saiya/superapp/unicast.html#/commentSingle?sourceType=%s&sourceLevel=%s&sourceToken=%s";

    public static void changeEnv() {
        // 首页运营弹窗
        XIAODUAPP_INDEX_POP_WINDOW = XIAODU_BOSS_PATH + "/xiaoduapp/v1/index/index/popWindow";
        // 首页数据
        XIAODUAPP_MODULE_INDEX = XIAODU_BOSS_PATH + "/xiaoduapp/v3/module/index";
        // 首页TAB数据
        XIAODUAPP_MODULE_GET_LIST = XIAODU_HOST + XIAODU_BOSS_PATH + "/xiaoduapp/v3/module/getList?list=";
        // 智能家居：首页
        H5_IOT_DEVICE_CONTROL = XIAODU_HOST + "/saiya/smarthome/index.html?from=oneapp#/?fullPage=1";
        H5_STUDY_REPORT = XIAODU_HOST + "/saiya/superapp/parents.html#/usageReport";
        ABOUT_TYPE_USER_PROTOCOL = XIAODU_HOST + "/saiya/xiaodu/law/xiaodu.html";
        ABOUT_TYPE_PRIVATE_PROTOCOL = XIAODU_HOST + "/saiya/xiaodu/privacylaw/index.html?type=APP";
        ABOUT_TYPE_RESPONSIBILITY_FREE_PROTOCOL = XIAODU_HOST + "/saiya/superapp/tts.html#/protocolConfig?dataSource=https%3A%2F%2Fduerstatic.bj.bcebos.com%2Fsuperapp%2F家长鉴权功能说明.txt";
        ABOUT_TYPE_WATCH_ASSISTANT_PROTOCOL = XIAODU_HOST + "/saiya/superapp/tts.html#/protocolConfig?dataSource=https%3A%2F%2Fduerstatic.cdn.bcebos.com%2Fsuperapp%2FprotocolKanhu_1647406273370.txt ";
        // 金刚位分类广场
        XIAODUAPP_MODULE_KINGKONG_CATEGORY = XIAODU_BOSS_PATH + "/xiaoduapp/v3/module/kingkongCategory";

        // 隐私：bot看护助手发送申请
        PRIVACY_CAPTURE_PUSH_SHOW_CONFIRM = XIAODU_BOSS_PATH + "/xiaoduapp/v1/proxy/post?server=smart_capture&path=/smartcapture/api/pushshowconfirm";
        // 隐私：bot拉取看护助手风控状态
        PRIVACY_GET_CAPTURE_MODE = XIAODU_BOSS_PATH + "/xiaoduapp/v1/proxy/post?server=smart_capture&path=/smartcapture/api/getCaptureMode";
        // 获取礼物信息的接口
        URL_GET_GIFT_INFO_URL = XIAODU_BOSS_PATH + "/xiaoduapp/v3/gift/getReceivedGift";

        DIDP_OOBE_CONFIG = XIAODU_BOSS_PATH + "/xiaoduapp/v1/client/getDidpConf?clientConf=" + DIDP_OOBE_MODE;

        SAIYA_USER_GET_INFO = XIAODU_BOSS_PATH + "/saiya/user/getInfo";

        SAIYA_MERGE_LIST = XIAODU_BOSS_PATH + "/saiya/device/mergelist";

        SAIYA_DEVICE_LIST = XIAODU_BOSS_PATH + "/saiya/device/list";

        WEB_URL_COMMENT_SINGLE = XIAODU_HOST + "/saiya/superapp/unicast.html#/commentSingle?sourceType=%s&sourceLevel=%s&sourceToken=%s";
    }

}
