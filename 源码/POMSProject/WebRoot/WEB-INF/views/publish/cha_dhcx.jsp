﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>订户查询</title>
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
                    cx-dhcx
                </div>
                <!--页面标题提示部分-->
                <div class="title">
                    <h2>查询>订户查询</h2>
                </div>

                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="search input-group">
                        <input type="text" name="customerName" class="form-control" placeholder="输入客户名">
                        <span class="input-group-btn"><button class="btn btn-info" type="button" >
							查询
						</button></span>
                    </div>
                </div>

                <!--表格部分-->
                <div>
                    <table class="table table-hover table-striped">
                        <thead>
                            <tr>
                                <th name="customerID">客户ID</th>
                                <th name="customerName">客户姓名</th>
                                <th name="customerPhone">联系方式</th>
                                <th name="customerType">客户类型</th>
                                <th name="customerType">所属分站ID</th>
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