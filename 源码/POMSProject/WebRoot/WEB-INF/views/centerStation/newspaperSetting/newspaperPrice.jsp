 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!--页面标题提示部分-->

    <title>报刊基本定价</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div id="mark-id">
                bksz-bkjbdj
            </div>

            <!--页面标题提示部分-->
            <div class="title">
                <h2>报刊设置>报刊基本定价</h2>
            </div>
            <!--添加，删除，等操作部分-->
            <div class="operation">
            <div class="add-btn operation-btn">
                        <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-plus"></span>添加
                    </button>
                    </div>
                <div class="search input-group">
                    <input type="text" class="form-control " placeholder="请输入报刊ID" name="newspaperID">
                    <span class="input-group-btn"><button class="btn btn-info" type="button" id="search-newspaperName-for-newspaperPrice-btn">
							查询
						</button></span>
                </div>
            </div>
            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>报刊编号</th>
                       
                        <th name="dayPrice">日价</th>
                        <th name="monthPrice">月价</th>
                        <th name="seasonPrice">季价</th>
                        <th name="halfYearPrice">半年价</th>
                        <th name="yearPrice">年价</th>
                        <th name="baseDiscount">折扣基础倍率</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
     		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                        <h4 class="modal-title" id="myModalLabel">
                            添加报刊定价
                        </h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">报刊 编号</label>
                                <div class="col-sm-10">
                                    <input name="newspaperID" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">日价</label>
                                <div class="col-sm-10">
                                    <input name="dayPrice" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">月价</label>
                                <div class="col-sm-10">
                                    <input name="monthPrice" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">季价</label>
                                <div class="col-sm-10">
                                    <input name="seasonPrice" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">半年价</label>
                                <div class="col-sm-10">
                                    <input name="halfYearPrice" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">年价</label>
                                <div class="col-sm-10">
                                    <input name="yearPrice" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">折扣基础倍率</label>
                                <div class="col-sm-10">
                                    <input name="baseDiscount" type="text" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-primary col-sm-offset-3 col-sm-6" value="提交">
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal -->
        </div>
       
        </div>
    </div>
</div>

</body>
</html>