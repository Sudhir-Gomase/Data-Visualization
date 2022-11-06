<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="UTF-8">
        <title>  Reset Password Form  </title>
        <link rel="stylesheet" href="style1.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <script>

            function checkPassword(form) {
                password1 = form.pass1.value;
                password2 = form.pass2.value;


                if (password1 == '')
                    alert("Please enter Password");

                else if (password2 == '')
                    alert("<b>Please enter confirm password<b>");


                else if (password1 != password2) {
                    alert("Password did not match: Please try again...")
                    return false;
                } else {

                    return true;
                }
            }
        </script>
    </head>
    <body>
        <div class="container">
            <div class="title">Reset Password</div>
            <div class="content">
                <form action="#" onSubmit = "return checkPassword(this)">
                    <div class="user-details">
                       
                        <div class="input-box">
                            <span class="details">New Password</span>
                            <input type="password" placeholder="Enter your password " pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"  name="pass1"  required>
                        </div>
                        <div class="input-box">
                            <span class="details">Confirm Password</span>
                            <input type="password"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="Confirm your password" data-validate="required compare=pass1" name="pass2"  required>
                        </div>
                    </div>

                    <div class="button">
                        <a href="login.html"><input type="submit"  value="Submit" style="margin-top: 8px;text-align: center;"></a>
                    </div>
                </form>
            </div>
        </div>

    </body>
</html>

