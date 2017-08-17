<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>报刊投递统计</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                bkcwgl-bktdtj
            </div>
            <div class="title">
                <h2>报刊财务管理>报刊投递统计</h2>
            </div>

<!--            &lt;!&ndash;选项卡处理&ndash;&gt;
            <div class="tabbable" id="tabs-981633">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#tab1" data-toggle="tab">按分站统计</a>
                    </li>
                    <li>
                        <a href="#tab2" data-toggle="tab">按报刊统计</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="tab1">

                        &lt;!&ndash;添加，删除，等操作部分&ndash;&gt;
                        <div class="operation">
                            <div class="search input-group">
                                <input type="text" class="form-control " name="stationName"
                                       placeholder="请输入分站名称">
                                <span class="input-group-btn"><button class="btn btn-info" type="button" >
							搜索
						</button></span>
                            </div>
                        </div>

                        &lt;!&ndash;表格部分&ndash;&gt;
                        <div>
                            &lt;!&ndash;查询到的分站&ndash;&gt;
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>分站编号</th>
                                    <th>分站名称</th>
                                    <th>分站地址</th>
                                    <th>总投递量</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                            </div>

                        </div>
                    <div class="tab-pane" id="tab2">
                        &lt;!&ndash;添加，删除，等操作部分&ndash;&gt;
                        <div class="operation">
                            <div class="search input-group">
                                <input type="text" class="form-control " name="newspaperName"
                                       placeholder="请输入报刊名称">
                                <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
                            </div>
                        </div>
                        <div>
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>报刊编号</th>
                                    <th>报刊种类</th>
                                    <th>投递量</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                        </div>

                    </div>
                </div>
            </div>-->

     <!--       <div class="operation">
                <div class="search input-group">
                    <input type="text" class="form-control " name="stationName"
                           placeholder="请输入分站名称">
                    <span class="input-group-btn"><button class="btn btn-info" type="button" >
							搜索
						</button></span>
                </div>
            </div>-->

           <!-- &lt;!&ndash;表格部分&ndash;&gt;-->
            <div>
               <!-- &lt;!&ndash;查询到的分站&ndash;&gt;-->
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>分站名称</th>
                        <th>报刊名</th>
                        <th>投递量</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>

        </div>




                <!--分页模块-->
   <!--             <div style="text-align: center">
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

</body>
</html>