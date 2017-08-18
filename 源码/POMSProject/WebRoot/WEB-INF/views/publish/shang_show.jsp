<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>查看订单</title>

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">

            <!--页面标题提示部分-->
            <div id="mark-id">
                shang-show
            </div>

            <!--页面标题提示部分-->
            <div class="title">
                <h2>商品订购>查看订单</h2>
            </div>

            <!--顶部添加，删除，等操作部分-->
            <div class="operation">
           
                <div class="search input-group">
                    <input type="text" class="form-control " name="customerName"
                           placeholder="请输入姓名">
                    <span class="input-group-btn"><button class="btn btn-info" type="button" >
							搜索
						</button></span>
                </div>
            </div>

       
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th >订单ID</th>
                        <th >报刊ID</th>
                        <th >客户ID</th>
                        <th >客户姓名</th>
                       	<th>订单类型</th>
                       	<th>订单地址</th>
                       	<th>订单数量</th>
                       	<th>征订员ID</th>
                       	<th>订单时间</th>
                       	<th>投递时间</th>
                       	<th>投递员ID</th>
                       	<th>订阅类型</th>
                       	<th>订单持续时间</th>
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