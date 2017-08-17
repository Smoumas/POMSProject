<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>转址</title>
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
                spdg-zz
            </div>

            <!--页面标题提示部分-->
            <div class="title">
                <h2>商品订购>转址</h2>
            </div>

            <!--添加的表单-->
            <div class="add-form modify-password-form">
                <form method="POST" action="" role="form">
                    <!--<div class="form-group">
                        <label class="col-sm-2">客户名称</label>
                        <input  name="customerName" type="text" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">报刊名称</label>
                        <input  name="newspaperName" type="text" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">转址方式</label>
                        <select  name="changeType" class="form-control">
                            <option value="">部分转址</option>
                            <option value="">完全转址</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">原地址</label>
                        <input type="text" name="oldValue" class="form-control">
                    </div>-->
                    <div class="form-group">
                        <label class="col-sm-2">订单编号</label>
                        <input  name="orderID" type="text" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">新地址</label>
                        <input type="text" name="newAddress" class="form-control">
                    </div>
                    <div class="form-group">
                        <input type="submit" class="send-new-password-btn btn btn-info col-sm-offset-1" value="修改">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>