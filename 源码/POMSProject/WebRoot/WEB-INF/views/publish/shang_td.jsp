﻿<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>退订</title>
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
                spdg-td
            </div>

            <!--页面标题提示部分-->
            <div class="title">
                <h2>商品订购>退订</h2>
            </div>

            <!--添加的表单-->
            <div class="add-form modify-password-form">
                <form method="POST" action="" role="form">
                    <div class="form-group">
                        <label class="col-sm-2">订单编号</label>
                        <input  name="orderID" type="text" class="form-control">
                    </div>
                 <!--   <div class="form-group">
                        <label class="col-sm-2">报刊名称</label>
                        <input  name="newspaperName" type="text" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">所属报社</label>
                        <select  name="noID" class="form-control">
                            <option>1报社</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">退订</label> &lt;!&ndash;订单操作表&ndash;&gt;
                        <select  name="changeType" class="form-control">
                            <option>1报社</option>
                        </select>
                    </div>-->
                    <div class="form-group">
                        <input type="submit" class="send-new-password-btn btn btn-info col-sm-offset-1" value="退订">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>