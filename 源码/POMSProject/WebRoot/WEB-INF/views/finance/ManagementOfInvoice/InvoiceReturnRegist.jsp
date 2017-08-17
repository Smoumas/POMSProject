<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>发票退回登记</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                bkcwgl-fpthdj
            </div>
            <div class="title">
                <h2>发票管理>发票退回登记</h2>
            </div>

            <!--查询报刊收订-->
            <div class="operation">
                <div class="add-btn operation-btn">
                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <!--<span class="glyphicon glyphicon-plus"></span>-->
                        退回登记
                    </button>
                </div>
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>发票编号</th>
                        <th>订单编号</th>
                        <th>分站编号</th>
                        <th>分站名</th>
                        <th>是否使用</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>

                <!--分页模块-->
      <!--          <div style="text-align: center">
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
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
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
                <form class="form-horizontal" role="form" method="POST" action="/POMSProject/advice/sendAdvice">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">发票编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="invoiceID">
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-info col-sm-offset-2 col-sm-8" value="添加">
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>


</body>
</html>