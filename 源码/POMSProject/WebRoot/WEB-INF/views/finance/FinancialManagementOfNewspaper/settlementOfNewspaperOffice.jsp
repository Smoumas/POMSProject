<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>与报社结算</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                bkcwgl-ybsjs
            </div>
            <div class="title">
                <h2>报刊财务管理>与报社结算</h2>
            </div>

            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="add-btn operation-btn">
                    <button type="button" class="btn btn-info">
                        <span class="glyphicon glyphicon-ok"></span>一键结算
                    </button>
                </div>
                <div class="search input-group">
                    <input type="text" class="form-control" name="newspaperName"
                           placeholder="请输入报社名称">
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
                        <th>报社编号</th>
                        <th>报社名称</th>
                        <th>联系方式</th>
                    </tr>
                    </thead>

                    <tbody>
                    </tbody>
                </table>

                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>发行报刊编号</th>
                        <th>发行报刊</th>
                        <th>报刊份数</th>
                        <th>报刊费率</th>
                        <th>报刊应付金额</th>
                        <th>报刊实付金额</th>
                        <th>状态</th>
                        <th>管理</th>
                    </tr>
                    </thead>

                    <tbody>
                    </tbody>
                </table>
                <!--分页模块-->
     <!--           <div style="text-align: center">
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