<?php

    phpinfo();

    //Mi primera conexion de PHP con SQL Server
    
    $Conexion = new PDO("sqlsrv:server=Javi-laptop;database=Proyecto","sa","Javi-1508");
    $consulta = $Conexion -> prepare("select * from Registro");
    $consulta -> execute();
    $datos = $consulta -> fetchAll(PDO::FETCH_ASSOC);
    var_dump($datos);