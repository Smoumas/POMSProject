<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>发行站管理系统</title>
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
                        <h1>发行站管理系统</h1>
                    </li>
                    <li><a>客户管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="ke_khgl.html">客户管理</a></li>
                        </ul>
                    </li>
                    <li><a>商品订购<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="shang_xd">新订</a></li>
                            <li><a href="shang_td">退订</a></li>
                            <li><a href="shang_zz">转址</a></li>
                            <!--<li><a href="shang_yqxdfz.html">延期续订附赠</a></li>-->
                            <li><a href="shang_yqxdfz">延期</a></li>
                            <li><a href="shang_xud">续订</a></li>
                        </ul>
                    </li>
                    <li><a>订购变更<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="ding_tdcx">退订撤销</a></li>
                            <li><a href="ding_zzcx">转址撤销</a></li>
                            <li><a href="ding_yqcx">延期撤销</a></li>
                        </ul>
                    </li>
                    <li><a>监督管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="jian_ts">投诉处理</a></li>
                            <li><a href="jian_by">表扬处理</a></li>
                            <li><a href="jian_jy">建议处理</a></li>
                            <li><a href="jian_tjhz">添加回执</a></li>
                        </ul>
                    </li>
                    <li><a>发票管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="fa_fpsz">发票设置</a></li>
                            <!-- <li><a href="fa_zfdj.html">发票作废登记</a></li> -->
                        </ul>
                    </li>
                    <li><a>投递管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <!--<li><a href="tou_tddgl.html">投递段管理</a></li>-->
                            <!--<li><a href="tou_qdtdd.html">确定投递段</a></li>-->
                            <li><a href="tou_xsd">下数单</a></li>
                            <li><a href="tou_ckd">催款单</a></li>
                        </ul>
                    </li>
                    <li><a>人事管理<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="ren_ygxxsz">员工信息设置</a></li>
                            <li><a href="ren_ygzzsz">员工职务设置</a></li>
                            <!-- <li><a href="ren_czyqx.html">操作员权限设置</a></li> -->
                        </ul>
                    </li>
                    <li><a>辅助业务<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="fu_sqtz">收取通知</a></li>
                            <li><a href="fu_fstz">发送通知</a></li>
                            <li><a href="fu_xgmm">修改密码</a></li>
                        </ul>
                    </li>
                    <li><a>查询<span>></span></a></li>
                    <li class="sub-list">
                        <ul class="nav nav-pills nav-stacked">
                            <!--<li><a href="cha_fpcx.html">发票查询</a></li>-->
                            <li><a href="cha_td">投递查询</a></li>
                            <!--<li><a href="cha_jcxxcx.html">基础信息查询</a></li>-->
                            <li><a href="cha_dhcx">订户查询</a></li>
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
    <script src="../js/general-issue.js"></script>
    <!--此处引用这个子系统需要的JS-->
    <script>
    </script>
</body>

</html>