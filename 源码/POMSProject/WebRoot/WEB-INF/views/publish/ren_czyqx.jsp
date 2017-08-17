<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>操作员权限</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">

            <!--页面标题提示部分-->
            <div id="mark-id">
                rsgl-czyqxsz
            </div>
            <div class="title">
                <h2>人事管理>操作员权限设置</h2>
            </div>

            <!--添加，删除，等操作部分-->
            <div class="operation">
                <div class="add-btn operation-btn">
                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-plus"></span>添加
                    </button>
                </div>
             
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>员工编号</th>
                        <th>员工姓名</th>
                        <th>所属部门名称</th>
                        <th name="level">操作员权限</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>TB - Monthly</td>
                        <td>01/04/2012</td>
                        <td>01/04/2012</td>
                        <td>
                            <div class="btn-group">
                                <button type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-edit"></span>编辑
                                </button>
                                <button type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-trash"></span>删除
                                </button>
                            </div>
                        </td>
                    </tr>
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
                        添加操作员权限
                    </h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">员工编号</label>
                            <div class="col-sm-9">
                                <input name="employeeID" type="text" class="form-control" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">操作员账号</label>
                            <div class="col-sm-9">
                                <input name="operatorID" type="text" class="form-control" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">操作员密码</label>
                            <div class="col-sm-9">
                                <input name="password" type="text" class="form-control" placeholder="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">操作员权限</label>
                            <div class="col-sm-9">
                                <select name="level" class="form-control"></select>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-primary mySubmit">提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
