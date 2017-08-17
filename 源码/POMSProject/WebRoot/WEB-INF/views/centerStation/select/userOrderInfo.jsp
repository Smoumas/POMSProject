﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <!--页面标题提示部分-->
    <title>订户订购查询</title>

</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <!--页面标题提示部分-->
                <div id="mark-id">
                    cx-dhdgcx
                </div>
                <div class="title">
                    <h2>查询>订户订购查询</h2>
                </div>
                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="search input-group">
                        <input type="date" class="form-control end-datetime-input" name="endDate">
                        <input type="date" class="form-control start-datetime-input" name="beginDate">
                        <input type="text" class="form-control start-datetime-input" name="customerID" placeholder="客户ID">
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
                                <th>客户ID</th>
                                <th>报刊ID</th>
                                <th>订购份数</th>
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