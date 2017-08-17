<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>客户管理</title>
    <!--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
    <!--<link href="general.css" rel="stylesheet">-->
    <!--<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">

            <!--页面标题提示部分-->
            <div id="mark-id">
                khgl-khgl
            </div>

            <!--页面标题提示部分-->
            <div class="title">
                <h2>客户管理>客户管理</h2>
            </div>

            <!--顶部添加，删除，等操作部分-->
            <div class="operation">
                <div class="add-btn operation-btn" >
                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" >
                        <span class="glyphicon glyphicon-plus"></span>添加客户
                    </button>
                </div>
                <div class="search input-group">
                    <input type="text" class="form-control " name="customerName"
                           placeholder="请输入姓名">
                    <span class="input-group-btn"><button class="btn btn-info" type="button" >
							搜索
						</button></span>
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
                                客户信息登记
                            </h4>
                        </div>
                        <div class="modal-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="customerName" class="col-sm-2 control-label">客户名称</label>
                                    <div class="col-sm-10">
                                        <input  type="text" name= "customerName" class="form-control" id="customerName" placeholder="客户名字">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="customerPhone" class="col-sm-2 control-label">联系方式</label>
                                    <div class="col-sm-10">
                                        <input  type="text" name="customerPhone" class="form-control" id="customerPhone" placeholder="联系方式">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="customerType" class="col-sm-2 control-label">客户类型</label>
                                    <div class="col-sm-10">
                                        <select  name="customerType" class="col-sm-10 form-control" id="customerType">
                                            <option value="1">普通客户</option>
                                            <option value="2">大客户</option>
                                            <option value="3">会员</option>
                                        </select>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <div>
                                        <input type="submit" class="btn btn-primary col-sm-offset-4 col-sm-4" value="提交">
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            </input>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th name="customerID">客户编号</th>
                        <th name="customerName">客户名称</th>
                        <th name="customerPhone">联系方式</th>
                        <th name="customerType">客户类型</th>
                       
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