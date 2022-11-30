<?php
include 'conexion.php';
$email = $_POST['email'];
$password = $_POST['password'];

$consulta = $conectar->query("select * from usuarios where email='$email'");
$datos = $consulta->fetch(PDO::FETCH_ASSOC);

if ($datos['password'] == $password) {
    header('location: blog.html');
}
else {
    echo "¡Contraseña incorrecta!";
}
?>