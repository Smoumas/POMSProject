﻿<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>发票查询</title>
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
                cx-fpcx
            </div>
            <!--页面标题提示部分-->
            <div class="title">
                <h2>查询>发票查询</h2>
            </div>

            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="search input-group">
                    <div class="input-group " style="width: 240px;float: left">
                        <span class="input-group-addon">起始时间</span>
                        <input type="date" name="orderDate" class="form-control" placeholder="输入起始时间">
                    </div>
                    <div class="input-group " style="width: 240px;float: left;margin-left: 60px">
                        <span class="input-group-addon">截止时间</span>
                        <input type="date" name="orderDate" class="form-control" placeholder="输入截止时间">
                    </div>
                    <span class="input-group-btn"><button class="btn btn-info" type="button">
							查询
						</button></span>
                </div>
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th name="invoiceID">发票编号</th>
                        <th name="orderID">订单号</th>
                        <th name="orderDate">订单日期</th>
                        <th name="state">发票状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>1</td>
                        <td>1</td>
                        <td>1</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>