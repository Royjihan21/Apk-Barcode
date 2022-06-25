<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    include 'DatabaseConfig.php';

    $con = mysqli_connect($HostName, $HostUser, $HostPass, $DatabaseName);

    $username = $_POST['username'];
    $email = $_POST['email'];
    $password = $_POST['password'];

    $CheckSQL = "SELECT * FROM userlogintable WHERE user_email='$email'";

    $check = mysqli_fetch_array(mysqli_query($con, $CheckSQL));

    if (isset($check)) {

        echo 'Email Already Exist';
    } else {
        $Sql_Query = "INSERT INTO userlogintable (username,user_email,user_password) values ('$username','$email','$password')";

        if (mysqli_query($con, $Sql_Query)) {
            echo 'Registration Successfully';
        } else {
            echo 'Something went wrong';
        }
    }
}
mysqli_close($con);
?>