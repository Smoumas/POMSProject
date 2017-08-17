<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>建议</title>
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
                jdgl-tjhz
            </div>

            <!--页面标题提示部分-->
            <div class="title">
                <h2>监督管理>添加回执</h2>
            </div>

            <div class="add-form send-news-form">
                <form method="POST" role="form">
                    <div class="form-group">
                        <label class="col-sm-2">意见ID</label>
                        <input type="text" placeholder="意见ID" name="recordID" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2">回执内容</label>
                        <textarea name="receipt" rows="5" class="form-control textarea"></textarea>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="send-news-btn btn btn-info col-sm-offset-3 col-sm-6" value="发送">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
