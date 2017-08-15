<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <link href="css/login.css" rel="stylesheet">

</head>

<body>
    <div id="login-wrap" class="clearfix">
        <div class="login center-block">
            <!--图片-->
            <div>
                <img src="resources/icon.jpg" alt="logo" class="img-circle login-img">
            </div>
            <!--Sign in to POMS-->
            <h1 class="login-sign">Sign in to POMS</h1>

            <!--表单-->
            <div class="login-form-border center-block">
                <div class="login-form center-block">
                    <form>
                        <div>
                            <div class="form-group">
                                <label for="username" class="pull-left">UserName</label>
                                <input type="text" class="form-control" id="username" placeholder="UserName">
                            </div>
                            <div class="form-group">
                                <label for="password" class="pull-left">Password</label>
                                <input type="password" class="form-control" id="password" placeholder="Password">
                            </div>
                            <div>
                                <label id="show-text" style="height:1em;margin:0;"></label>
                            </div>
                            <input class="btn btn-block" type="submit" value="Sign in" id="login-btn">
                        </div>
                    </form>
                </div>
            </div>

            <!--下面的文本框 -->
            <div class="login-form-border center-block">
                <div class="text-new">
                    <p>New to POMS? Go to an order !</p>
                </div>
            </div>

            <!--底部文字-->
            <div class="text-bottom center-block">
                <ul>
                    <li>@Copyright five team</li>
                    <li>Terms</li>
                    <li>Privacy</li>
                    <li>Security</li>
                    <li>Contact</li>
                </ul>
            </div>
        </div>
    </div>

    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/Login.js"></script>
</body>

</html>