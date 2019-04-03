<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>Sign Up </title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body { padding-top:30px; }
.form-control { margin-bottom: 10px; }
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm">
            <legend><a href="http://www.jquery2dotnet.com"><i class="glyphicon glyphicon-globe"></i></a> Sign up!</legend>
            <form action="#" method="post" class="form" role="form" action="/Eshop/AddUserDetail">
            <div class="row">
			
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" name="firstName" placeholder="First Name" type="text"
                        required autofocus />
                </div>
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" name="lastName" placeholder="Last Name" type="text" required />
                </div>
            </div>
          
            <input class="form-control" name="password" placeholder="New Password" type="password" />
			<input class="form-control" name="contact" placeholder="Mobile Number" type="text" />
			<input class="form-control" name="shippingAddress" placeholder="Address" type="text" />
            
           
            
            <br />
            <br />
            <button class="btn btn-lg btn-primary btn-block" type="submit">
                Sign up</button>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript">

</script>
</body>
</html>
