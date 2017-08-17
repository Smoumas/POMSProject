﻿<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>基础信息查询</title>
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
                cx-jcxxcx
            </div>
            <!--页面标题提示部分-->
            <div class="title">
                <h2>查询>基础信息查询</h2>
            </div>



                        <!--顶部添加，删除，等操作部分-->
                        <div class="operation">
                            <div class="search input-group">
                                <input type="text" name="newspaperName" class="form-control "
                                       placeholder="请输入报刊名">
                                <span class="input-group-btn"><button class="btn btn-info" type="button" id="search-newspaperName-for-Newspaper-btn">
							查询
						</button></span>
                            </div>
                        </div>

                        <!--表格部分-->
                        <div>
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th name="newspaperID">报刊编号</th>
                                    <th name="newspaperName">报刊名</th>
                                    <th name="dayPrice">日价</th>
                                    <th name="monthPrice">月价</th>
                                    <th name="seasonPrice">季价</th>
                                    <th name="halfYearPrice">报刊半年价</th>
                                    <th name="yearPrice" >年价</th>
                                    <th name="baseDiscount">折扣基础倍率</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>1</td>
                                    <td>1</td>
                                    <td>1</td>
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
    </div>
</div>
</body>
</html>