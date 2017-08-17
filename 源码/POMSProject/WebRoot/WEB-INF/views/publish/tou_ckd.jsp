<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>催款单</title>
    <!--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
    <!--<link href="general.css" rel="stylesheet">-->
    <!--<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">

                <!--页面标题提示部分-->
                <div id="mark-id">
                    tdgl-ckd
                </div>
                <!--页面标题提示部分-->
                <div class="title">
                    <h2>投递管理>催款单</h2>
                </div>
                <!--表格部分-->
                <div>
                    <table class="table table-hover table-striped">
                        <thead>
                            <!--后台遍历出所有欠费的客户，以及其订单-->
                            <tr>
                                <th name="customerName">订单号</th>
                                <th name="orderID">客户姓名</th>
                                <th name="paymentState">联系方式</th>
                                <th name="isPrinted">欠款状态</th>
                            </tr>
                        </thead>
                        <tbody>
                           
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

</body>

</html>