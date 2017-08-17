﻿<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>确定投递段</title>
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
                tdgl-qdtdd
            </div>
            <!--页面标题提示部分-->
            <div class="title">
                <h2>投递管理>确定投递段</h2>
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th name="orderID">投递单</th>
                        <th name="deliverAreaValue">投递段</th><!--遍历已经存在的投递段-->
                        <th>确定</th>
                        <th>打印投递单</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>
                            <div class="col-md-6">
                            <!--遍历投递段的值得到下面的数据-->
                            <select class="form-control mySelect" >
                            <option>小区1-小区2</option>
                            <option>小区3-小区4</option>
                            <option>小区5-小区6</option>
                            </select>
                                </div>
                        </td>
                        <td>
                            <button type="button" class="btn btn-info">
                                确定
                            </button>
                        </td>
                        <td>
                            <button type="button" class="btn btn-info">
                                打印
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
</html>