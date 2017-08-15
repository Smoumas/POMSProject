﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>中心站管理</title>
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="../css/general.css" rel="stylesheet" media="screen">
    <!--此处引用这个子系统需要的CSS-->
</head>

<body>
    <div id="wrap">
        <!--头部-->
        <div id="header">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="main-fluid">
                    <div class="navbar-left">
                        <a>报刊发行系统</a>
                    </div>
                    <div class="navbar-right">
                        <ul class="nav navbar-nav">
                            <li><a href="#">收件箱</a></li>
                            <li><a href="#">退出</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <!--头部 end-->
        <!--主体-->
        <div id="main">
            <!--主体左导航-->
            <div class="main-left">
                <ul class="nav nav-pills nav-stacked first-list">
                    <li>
                        <h1>中心站管理系统</h1>
                    </li>
                    <li><a>字典维护<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/dictionarySetting/departmentSettingTable">部门设置</a></li>
                            <li><a href="../centerStation/dictionarySetting/positionSettingTable.html">职务类别设置</a></li>
                            <li><a href="../centerStation/dictionarySetting/newspaperOfficeSettingTable.html">报社设置</a></li>
                            <li><a href="../centerStation/dictionarySetting/TransferIncSettingTable.html">运输单位设置</a></li>
                            <li><a href="../centerStation/dictionarySetting/DistrictSettingTable.html">投递段设置</a></li>
                            <li><a href="../centerStation/dictionarySetting/ModificationReasonTable.html">变更原因设置</a></li>
                        </ul>
                    </li>
                    <li><a>人事管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/empManage/ren_ygxxsz.html">员工信息、职务设置</a></li>
                            <li><a href="../centerStation/empManage/ren_czyqx.html">操作员权限设置</a></li>
                            <li><a href="../centerStation/empManage/ren_yjtj.html">征订员业绩统计</a></li>
                            <li><a href="../centerStation/empManage/ren_tdyyjtj.html">投递员业绩统计</a></li>
                        </ul>
                    </li>
                    <li><a>报刊设置<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/newspaperSetting/newspaperAttrEdit.html">添加、修改报刊信息</a></li>
                            <li><a href="../centerStation/newspaperSetting/newspaperPrice.html">报刊基本定价、优惠设置</a></li>
                        </ul>
                    </li>
                    <li><a>附赠设置<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/extraFreeSetting/giftCard.html">赠卡信息</a></li>
                            <li><a href="../centerStation/extraFreeSetting/coupon.html">代金券信息</a></li>
                        </ul>
                    </li>
                    <li><a>辅助业务<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/support/getNews.html">收取通知</a></li>
                            <li><a href="../centerStation/support/sendNews.html">发送通知</a></li>
                            <li><a href="../centerStation/support/modifyPassword.html">修改密码</a></li>
                            <li><a href="../centerStation/support/correctAddress.html">纠正地址</a></li>
                        </ul>
                    </li>
                    <li><a>汇总<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/summary/summary.html">下单数汇总</a></li>
                        </ul>
                    </li>
                    <li><a>查询<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../centerStation/select/newspaperInfo.html">报刊信息查询</a></li>
                            <li><a href="../centerStation/select/userOrderInfo.html">订户订购查询</a></li>
                            <li><a href="../centerStation/select/newspaperOrderInfo.html">报刊订单查询</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!--主体左导航end-->
            <!--主体右导航-->
            <div class="main-right">
                <h3>欢迎来到中心站管理系统</h3>
            </div>
            <!--主体右导航end-->
        </div>
        <!--尾部-->
        <div id="footer">
        </div>
        <!--尾部end-->
    </div>


    <!--引用JQuery和Bootstrap的jquery-->
    <script src="../vendor/jquery/jquery.min.js"></script>
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="../js/general.js"></script>
    <!--此处引用这个子系统需要的JS-->
    <script>
    </script>
</body>

</html>