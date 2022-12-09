<?php
include_once 'conexion.php';
session_start();
session_unset();
session_destroy();

header('location: inicio.html');
echo "Salir!";
?>