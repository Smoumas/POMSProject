<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>客户管理</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                jdgl-khgl
            </div>
            <div class="title">
                <h2>监督管理>客户管理</h2>
            </div>
            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="search input-group">
                    <input type="text" class="form-control " placeholder="请输入客户姓名" name="customerName">
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
                        <th>客户编号</th>
                        <th>姓名</th>
                        <th>联系方式</th>
                        <th>客户类型</th>
                        <th>所属分站</th>
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