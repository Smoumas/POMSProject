<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>与分站结算</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                bkcwgl-yfzjs
            </div>
            <div class="title">
                <h2>报刊财务管理>与分站结算</h2>
            </div>

            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="add-btn operation-btn" >
                    <button type="button" class="btn btn-info">
                        <span class="glyphicon glyphicon-ok"></span>一键结算
                    </button>
                </div>
                <div class="search input-group">
                    <input type="text" class="form-control " name="stationName"
                           placeholder="请输入分站名称">
                    <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
                </div>
            </div>

            <!--查询到的报社-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>分站编号</th>
                        <th>分站名称</th>
                        <th>分站地址</th>
                        <th>总订阅量</th>
                    </tr>
                    </thead>

                    <tbody>
                    </tbody>
                </table>

                <!--分站内收取各报刊的订阅金额-->
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>报刊编号</th>
                        <th>报刊种类</th>
                        <th>订阅金额</th>
                        <th>缴纳金额</th>
                        <th>状态</th>
                        <th>管理</th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
                <!--分页模块--><!--
                <div style="text-align: center">
                    <ul class="pagination pagination-lg ">
                        <li><a href="#">&laquo;</a></li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>
                    </ul>
                </div>-->
            </div>
        </div>
    </div>
</div>

</body>
</html>