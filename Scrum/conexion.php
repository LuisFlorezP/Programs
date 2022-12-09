<?php
// Comentario
$usuario='root';
$contraseña='';

$conectar = new PDO("mysql:host=localhost;dbname=Scrum",$usuario,$contraseña);

echo "¡Conexión exitosa!</br>";
?>