<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>发票登记与查询</title>

</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                fpgl-fpdjycx
            </div>
            <div class="title">
                <h2>发票管理>发票登记与查询</h2>
            </div>

            <div class="operation">
                <!--登记发票，向数据库添加发票-->
                <div class="add-btn operation-btn">
                    <form>
                    <input type="submit" class="btn btn-info" value="登记发票">
                    <!--&lt;!&ndash; data-toggle="modal" data-target="#myModal"&ndash;&gt;
                        <span class="glyphicon glyphicon-plus" ></span>登记发票-->
                    </input>
                    </form>
                </div>

                <div class="search input-group">
                    <input type="text" id="searchOfInvoice"  class="form-control" name="invoiceID"
                           placeholder="请输入发票编号" >
                   
                    <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
                </div>
            </div>

            <!--表格部分-->
            <div>
                <!--查询到的分站-->
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>发票编号</th>
                        <th>订单编号</th>
                        <th>分站编号</th>
                        <th>分站名称</th>
                        <th>是否使用</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>

                <!--分页模块-->
                <!--<div style="text-align: center">
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

<!-- 模态框（Modal） -->
<!--<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    发票登记
                </h4>
            </div>
            <div class="modal-body">
                <form method="POST" action="/POMSProject/advice/sendAdvice" class="form-horizontal" role="form">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">订单编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="orderID">
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary col-sm-offset-2 col-sm-8" value="添加">
                    </div>
                </form>
            </div>
        </div>&lt;!&ndash; /.modal-content &ndash;&gt;
    </div>&lt;!&ndash; /.modal &ndash;&gt;
</div>-->

</body>
</html>