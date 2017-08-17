<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>分发管理系统</title>
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
                        <h1>分发管理系统</h1>
                    </li>
                    <li><a>系统管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../deliver/setting/PrintPointSettingTable">印点设置</a></li>
                            <li><a href="../deliver/setting/DeliveryPointSettingTable">送报点设置</a></li>
                            <li><a href="../deliver/setting/PrAndDelRelationSettingTable">关系设置</a></li>
                            <!--<li><a href="../deliveryManage/setting/PackNumberSettingTable.html">打包份数设置</a></li>-->
                        </ul>
                    </li>
                    <li><a>汇总统计<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../deliver/summary/PrintNumberAccounting">印数汇总</a></li>
                           <!-- <li><a href="../deliver/summary/DeliveryAccounting">分发统计</a></li> --> 
                        </ul>
                    </li>
                    <!--   <li><a>打印管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../deliveryManage/printManage/PrintTransportList.html">打印运输单</a></li>
                            <li><a href="../deliveryManage/printManage/PrintDeliveryList.html">打印分发单</a></li>
                            <li><a href="../deliveryManage/printManage/PrintPrintNumberList.html">打印印数单</a></li>
                        </ul>
                    </li>-->
                    <li><a>人事管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../deliver/empManage/ren_ygxxsz">员工信息设置</a></li>
                            <!--<li><a href="../deliveryManage/empManage/ren_ygzzsz.html">员工职务设置</a></li>-->
                            <li><a href="../deliver/empManage/ren_czyqx">操作员权限设置</a></li>
                        </ul>
                    </li>
                    <li><a>辅助业务<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../deliver/support/getNews">收取通知</a></li>
                            <li><a href="../deliver/support/sendNews">发送通知</a></li>
                            <!-- <li><a href="../deliveryManage/support/modifyPassword.html">修改密码</a></li> -->
                        </ul>
                    </li>
                </ul>
            </div>
            <!--主体左导航end-->
            <!--主体右导航-->
            <div class="main-right">

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
    <script src="../js/general-delivery.js"></script>
    <!--此处引用这个子系统需要的JS-->
    <script>
    </script>
</body>

</html>