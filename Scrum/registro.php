<?php
include 'conexion.php';
$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];
$clave = password_hash($password, PASSWORD_BCRYPT);
$phone = $_POST['phone'];
$age = $_POST['age'];
$document = $_POST['document'];

$registro = $conectar->query("INSERT INTO usuarios (name,email,password,phone,age,document) VALUES ('$name','$email','$clave','$phone','$age','$document')");

echo "¡Registro exitoso!";
?>