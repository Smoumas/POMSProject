<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>大客户交款</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                dkhgl-dkhjk
            </div>
            <div class="title">
                <h2>大客户管理>大客户交款</h2>
            </div>

            <!--大客户交款-->
            <div class="operation">
                <div class="add-btn operation-btn">
                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-plus"></span>交款
                    </button>
                </div>
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>客户编号</th>
                        <th>客户名称</th>
                        <th>联系方式</th>
                        <th>客户类型</th>
                    </tr>
                    </thead>

                    <tbody>

                    </tbody>
                </table>

    <!--            <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>欠款订单编号</th>
                        <th>所订报刊</th>
                        <th>欠款金额</th>
                        <th>订阅时间</th>
                    </tr>
                    </thead>

                    <tbody>
                    </tbody>
                </table>-->
                <!--分页模块-->
        <!--        <div style="text-align: center">
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
                        大客户付款
                    </h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form"  method="POST" action="/POMSProject/advice/sendAdvice">
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">订单编号</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="orderID">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">支付类型</label>
                            <div class="col-sm-10">
                                <select  name="paymentType" class="form-control">
                                    <option value="3">现金</option>
                                    <option value="1">支票</option>
                                    <option value="2">现金+支票</option>
                                    <option value="4">现金+代金券</option>
                                    <option value="6">赠卡</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">支付状态</label>
                            <div class="col-sm-10">
                                <select   name="paymentState" class="form-control">
                                    <option value="0">已付款</option>
                                    <option value="1">待付款</option>
                                    <option value="2">部分缴费</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">支付的现金</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="cash">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">支付的支票资金</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="credit">
                            </div>
                        </div>
                        <div class="form-group">
                        <label class="col-sm-2 control-label">使用的赠卡ID</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="giftCardID">
                        </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">使用的代金券ID</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="couponID">
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary col-sm-offset-2 col-sm-8" value="付款">
                        </div>
                    </form>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>



</div>

</body>
</html>