<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>发票发放</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                fpgl-fpff
            </div>
            <div class="title">
                <h2>发票管理>发票发放</h2>
            </div>

            <!--查询报刊收订-->
            <div class="operation">
                <div class="add-btn operation-btn">
                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <!--<span class="glyphicon glyphicon-ok"></span>-->
                        发送
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
                        <th>分站名称</th>
                        <th>是否使用</th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

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
                            <label class="col-sm-2 control-label">该发票的分站编号</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="stationID">
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-info col-sm-offset-2 col-sm-8" value="发送">
                        </div>
                    </form>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</div>

</body>
</html>