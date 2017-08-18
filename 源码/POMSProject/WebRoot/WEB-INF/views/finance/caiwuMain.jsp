﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>财务管理系统</title>
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
                            <li><a href="/POMSProject/logout">退出</a></li>
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
                        <h1>财务管理系统</h1>
                    </li>
                    <li><a>报刊财务管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../finance/FinancialManagementOfNewspaper/statisticsOfSubscribe">报刊收订统计</a></li>
                            <li><a href="../finance/FinancialManagementOfNewspaper/statisticsOfDistribution">报刊投递统计</a></li>
                            <!--       <li><a href="../caiwuguanli/FinancialManagementOfNewspaper/settlementOfNewspaperOffice.html">与报社结算</a></li>
                            <li><a href="../caiwuguanli/FinancialManagementOfNewspaper/settlementOfStation.html">与分站结算</a></li>
                            <li><a href="../caiwuguanli/FinancialManagementOfNewspaper/queryOfSettleHistory.html">结算记录查询</a></li>-->
                        </ul>
                    </li>
                    <li><a>发票管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../finance/ManagementOfInvoice/InvoiceRegist">发票登记与查询</a></li>
                            <li><a href="../finance/ManagementOfInvoice/InvoiceDistribute">发票发放</a></li>
                            <li><a href="../finance/ManagementOfInvoice/InvoiceReturnRegist">发票退回登记</a></li>
                        </ul>
                    </li>
                   <!--  <li><a>大客户管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../finance/ManagementOfBigCustomer/PaymentOfBigCustomer">大客户交款</a></li>
                            <li><a href="../finance/ManagementOfBigCustomer/DebtOfBigCustomer">大客户欠款查询</a></li>
                        </ul>
                    </li> -->
                    <!--    <li><a>日常维护<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../caiwuguanli/MaintainOfTransportRule/MaintainOfTransportRule.html">运输规则维护</a></li>
                        </ul>
                    </li>-->
                    <li><a>人事管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../finance/empManage/ren_ygxxsz">员工信息设置</a></li>
                            <!-- <li><a href="../caiwuguanli/empManage/ren_czyqx.html">操作员权限设置</a></li> -->
                        </ul>
                    </li>
                    <li><a>辅助业务<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../finance/support/getNews">收取通知</a></li>
                            <li><a href="../finance/support/sendNews">发送通知</a></li>
                            <li><a href="../finance/support/modifyPassword">修改密码</a></li>
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
    <script src="../js/general-caiwu.js"></script>
    <!--此处引用这个子系统需要的JS-->
    <script>
    </script>
</body>

</html>