<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>客户管理系统</title>
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
                        <h1>客户管理系统</h1>
                    </li>
                    <li><a>监督管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../support/inspectManage/consumerManage">客户管理</a></li>
                            <li><a href="../support/inspectManage/opinionAndPrintManage">意见管理</a></li>
                            <li><a href="../support/inspectManage/tjhz">添加回执</a></li>
                        </ul>
                    </li>
                   <!--  
                    <li><a>查询<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked"> -->
                            <!-- <li><a href="../consumerManage/select/operationLogSelect.html">操作日志查询</a></li>-->
                            <!--  
                            <li><a href="../support/select/orderExpireSelect">订单到期数查询</a></li>
                        </ul>
                    </li>
                    -->
                    <li><a>辅助业务<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="../support/support/getNews">收取通知</a></li>
                            <li><a href="../support/support/sendNews">发送通知</a></li>
                            <li><a href="../support/support/modifyPassword">修改密码</a></li>
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
    <script src="../js/general-consumer.js"></script>
    <!--此处引用这个子系统需要的JS-->
    <script>
    </script>
</body>

</html>