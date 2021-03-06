﻿<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <!--页面标题提示部分-->

    <title>代金券设置</title>

</head>

<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div id="mark-id">
                    yzsz-djqsz
                </div>
                <!--页面标题提示部分-->
                <div class="title">
                    <h2>附赠设置>代金券设置</h2>
                </div>

                <!--添加，删除，等操作部分-->
                <div class="operation">
                    <div class="add-btn operation-btn">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-plus" ></span>添加
                    </button>
                    </div>
                    <div class="search input-group">
                        <input type="text" class="form-control " placeholder="代金券号码" name="couponID">
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
                                <th>代金券号码</th>
                                <th name="price">金额</th>
                                <th name="isUsed">是否被使用</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- 模态框（Modal） -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                        <h4 class="modal-title" id="myModalLabel">
                            添加代金券
                        </h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">金额</label>
                                <div class="col-sm-10">
                                    <input name="price" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">是否被使用</label>
                                <div class="col-sm-10">
                                    <input name="isUsed" type="text" class="form-control" disabled value="0">
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-primary col-sm-offset-3 col-sm-6" value="添加">
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal -->
        </div>
    </div>

</body>

</html>