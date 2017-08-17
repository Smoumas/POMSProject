﻿<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>结算记录查询</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                bkcwgl-jsjlcx
            </div>
            <div class="title">
                <h2>报刊财务管理>结算记录查询</h2>
            </div>

            <div class="tabbable" id="tabs-981633">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#tab1" data-toggle="tab">与分站结算</a>
                    </li>
                    <li>
                        <a href="#tab2" data-toggle="tab">与报社结算</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="tab1">

                        <!--添加，删除，等操作部分-->
                        <div class="operation">
                            <div class="search input-group">
                                <input type="text" class="form-control " name="stationName"
                                       placeholder="请输入分站名称">
                                <span class="input-group-btn"><button class="btn btn-info" type="button" >
							搜索
						</button></span>
                            </div>
                        </div>

                        <!--表格部分-->
                        <div id="queryOfStation">
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>分站名称</th>
                                    <th>分站地址</th>
                                    <th>所属分站</th>
                                    <th>总订阅量</th>
                                </tr>
                                </thead>

                                <tbody>
                                </tbody>
                            </table>

                            <!--与分站结算记录-->
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>分站报刊种类</th>
                                    <th>结算时间</th>
                                    <th>结算金额</th>
                                </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                            <!--分页模块--><!--
                <div style="text-align: center">
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
                    <div class="tab-pane" id="tab2">
                        <!--添加，删除，等操作部分-->
                        <div class="operation">
                            <div class="search input-group">
                                <input type="text" class="form-control " name="noName"
                                       placeholder="请输入报社名称">
                                <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
                            </div>
                        </div>
                        <div id="queryOfNewspaperOffice">
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>报社名称</th>
                                    <th>联系方式</th>
                                </tr>
                                </thead>

                                <tbody>
                                </tbody>
                            </table>

                            <!--与报社结算记录-->
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>报社报刊种类</th>
                                    <th>结算时间</th>
                                    <th>结算金额</th>
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


          <!--  <div class="operation">
                &lt;!&ndash;select的监听事件&ndash;&gt;
&lt;!&ndash;                <script type="text/javascript">
                    function changePlaceHolder(indexOfSelect){
                        var searchStationOrOffice = $('#searchStationOrOffice');
                        if(indexOfSelect==0){
                            searchStationOrOffice.attr('name','stationName')
                            searchStationOrOffice.attr('placeholder','请输入分站名称');
                        }else {
                            searchStationOrOffice.attr('name','newspaperName')
                            searchStationOrOffice.attr('placeholder','请输入报社名称');
                        }
                    }
                    function showDiv() {
                        var sel = document.getElementsByTagName("select").item(0).options;
                        var optionValue = sel[sel.selectedIndex].value;
                        if(optionValue == 0){
                            $("#queryOfStation").show();
                            $("#queryOfNewspaperOffice").hide();
                        }else {
                            $("#queryOfStation").hide();
                            $("#queryOfNewspaperOffice").show();
                        }
                    }
                </script>&ndash;&gt;
                &lt;!&ndash;选择按分站id或者报社id查询结算记录&ndash;&gt;
                <div class="add-btn operation-btn">
                    <select class="form-control" onchange="changePlaceHolder(this.options[this.options.selectedIndex].value)">
                        <option value="0">查询与分站结算记录</option>
                        <option value="1">查询与报社结算记录</option>
                    </select>
                </div>
                <div class="search input-group">
                    <input type="text" id="searchStationOrOffice" class="form-control " name="stationName"
                           placeholder="请输入分站名称">
                    <span class="input-group-btn"><button onclick="showDiv()" class="btn btn-info" type="button">
							搜索
						</button></span>
                </div>
            </div>-->

           <!-- &lt;!&ndash;查询分站&ndash;&gt;
            <div id="queryOfStation" style="display: none">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>分站名称</th>
                        <th>分站地址</th>
                        <th>所属分站</th>
                        <th>总订阅量</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td>大连发行站</td>
                        <td>大连市谷歌里小区</td>
                        <td>辽宁省发行站</td>
                        <td>10000份</td>
                    </tr>
                    </tbody>
                </table>

                &lt;!&ndash;与分站结算记录&ndash;&gt;
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>分站报刊种类</th>
                        <th>结算时间</th>
                        <th>结算金额</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>人民日报</td>
                        <td>2014.5.29</td>
                        <td>10000</td>
                    </tr>
                    </tbody>
                </table>
                &lt;!&ndash;分页模块&ndash;&gt;&lt;!&ndash;
                <div style="text-align: center">
                    <ul class="pagination pagination-lg ">
                        <li><a href="#">&laquo;</a></li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>
                    </ul>
                </div>&ndash;&gt;
            </div>

            &lt;!&ndash;查询报社&ndash;&gt;
            <div id="queryOfNewspaperOffice" style="display: none">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>报社名称</th>
                        <th>联系方式</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td>内蒙古人民出版社</td>
                        <td>123456789</td>
                    </tr>
                    </tbody>
                </table>

                &lt;!&ndash;与报社结算记录&ndash;&gt;
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>报社报刊种类</th>
                        <th>结算时间</th>
                        <th>结算金额</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>人民日报</td>
                        <td>2014.5.29</td>
                        <td>10000</td>
                    </tr>
                    </tbody>
                </table>
                &lt;!&ndash;分页模块&ndash;&gt;
      &lt;!&ndash;          <div style="text-align: center">
                    <ul class="pagination pagination-lg ">
                        <li><a href="#">&laquo;</a></li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>
                    </ul>
                </div>&ndash;&gt;
            </div>-->
        </div>
    </div>
</div>

</body>
</html>