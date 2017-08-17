<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>报刊收订统计</title>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!--页面标题提示部分-->
            <div id="mark-id">
                bkcwgl-bksdtj
            </div>
            <div class="title">
                <h2>报刊财务管理>报刊收订统计</h2>
            </div>

            <!--查询报刊收订-->
            <div class="operation">
                <div class="search input-group">
                    <input type="date" class="form-control end-datetime-input" name="endDate">
                    <input type="date" class="form-control start-datetime-input" name="startDate">
                    <input type="text" class="form-control " placeholder="请输入分站编号" name="stationID">
                    <span class="input-group-btn"><button class="btn btn-info" type="button">
							搜索
						</button></span>
                </div>
            </div>

            <!--表格部分-->
            <div>
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>分站编号</th>
                        <th>现金金额</th>
                        <th>支票金额</th>
                        <th>代金券金额</th>
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