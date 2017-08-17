﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <!--页面标题提示部分-->


    <title>报刊订单查询</title>

</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <!--页面标题提示部分-->
                <div id="mark-id">
                    cx-bkddcx
                </div>
                <div class="title">
                    <h2>查询>报刊订单查询</h2>
                </div>
                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="search input-group">
                        <input type="text" class="form-control" placeholder="客户名称" name="customerName">
                        <span class="input-group-btn"><button class="btn btn-info" type="button" id="search-customerName-for-summaryOrder-btn">
							查询
						</button></span>
                    </div>
                </div>
                <!--表格部分-->
                <div>
                    <table class="table table-hover table-striped">
                        <thead>
                            <tr>
                                <th>报刊名称</th>
                                <th>客户名称</th>
                                <th>报刊份数</th>
                                <th>订单时间</th>
                                <th>订单地址</th>
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