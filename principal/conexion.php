<?php
    class Conexion{

        function ConexionBD(){
            $host = 'localhost';
            $dbname = 'Proyecto';
            $username = 'sa';
            $pasword = 'Javi-1508';
            $puerto = '1433';

            try{
                $com = new PDO("sqlrv:server=$host, $puerto; Database =$dbname, $username, $pasword");
                echo  'Successful';
            }
            catch(PDOException $exp){
                echo ('Not successfull');
            }
        }

    }
?>
