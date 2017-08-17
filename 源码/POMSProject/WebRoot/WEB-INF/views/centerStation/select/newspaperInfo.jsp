﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <!--页面标题提示部分-->

    <title>报刊信息查询</title>
</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <!--页面标题提示部分-->
                <div id="mark-id">
                    cx-bkxxcx
                </div>
                <div class="title">
                    <h2>查询>报刊信息查询</h2>
                </div>
                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="search input-group">
                        <input type="text" class="form-control" placeholder="请输入报刊名称" name="newspaperName">
                        <span class="input-group-btn"><button class="btn btn-info" type="button" id="search-newspaperName-for-newspaper-btn">
							查询
						</button></span>
                    </div>
                </div>
                <!--表格部分-->
                <div>
                    <table class="table table-hover table-striped">
                        <thead>
                            <tr>
                                <th>报刊编号</th>
                                <th>报刊名称</th>
                                <th>所属报社</th>
                                <th>是否允许退订</th>
                                <th>是否允许转址</th>
                                <th>是否允许延期</th>
                                <th>刊期</th>
                                <th>发行费率</th>
                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                    <!--分页模块-->
                </div>
            </div>
        </div>
    </div>

</body>

</html>