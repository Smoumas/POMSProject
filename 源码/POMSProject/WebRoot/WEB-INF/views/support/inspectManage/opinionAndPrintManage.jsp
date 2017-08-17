<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>意见管理</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12">
            <!--页面标题提示部分-->
            <div id="mark-id">
                jdgl-yjgl
            </div>
            <div class="title">
                <h2>监督管理>意见管理</h2>
            </div>


            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="add-btn operation-btn">
                    <button type="button" class= "btn btn-info" data-toggle="modal" data-target="#myModal-add">
                        <span class="glyphicon glyphicon-plus"></span>添加
                    </button>
                </div>
                <div class="search input-group">
                    <select type="text" class="form-control" name="commentType">
                        <option value="1">批评</option>
                        <option value="2">表扬</option>
                        <option value="3">建议</option>
                    </select>
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
                        <th>意见编号</th>
                        <th>客户编号</th>
                        <th>意见类型</th>
                        <th>分站编号</th>
                        <th>意见内容</th>
                        <th>回访内容</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
                <!--分页模块-->
            </div>
        </div>
    </div>
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal-add" tabindex="-1" role="dialog" aria-labelledby="myModal-addLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModal-addLabel">
                        添加意见
                    </h4>
                </div>
                <div class="modal-body">
                    <form method="POST" action="/POMSProject/advice/sendAdvice" class="form-horizontal" role="form">
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">意见类型</label>
                            <div class="col-sm-10">
                                <select class="form-control" name="commentType">
                                    <option value="1">批评</option>
                                    <option value="2">表扬</option>
                                    <option value="3">建议</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">客户ID</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="customerID">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">意见内容</label>
                            <div class="col-sm-10">
                                <textarea class="form-control" name="content"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary col-sm-offset-2 col-sm-8" value="添加">
                        </div>
                    </form>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>

</div>

</body>
</html>