<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>操作日志查詢</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                cx-czrzcx
            </div>
            <div class="title">
                <h2>查询>操作日志查询</h2>
            </div>
            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="search input-group">
                    <input type="date" class="form-control" name="orderDate">
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
                        <th>操作日志编号</th>
                        <th>时间</th>
                        <th>客户名称</th>
                        <th>订单类型</th>
                        <th>报刊名称</th>
                        <th>新订、转址、退订等</th>
                        <th>操作</th>
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