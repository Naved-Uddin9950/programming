<?php

$age = 20;

// If - else statements
if($age<18){
    echo "\nYou are underage";
}
else if($age>=18 and $age<=60){
    echo "You are adult";
}else{
    echo "\nYou are old";
}

// Switch statements
switch($age){
    case 18:
        echo "\n\nAdult";
        break;
    case 60:
        echo "\n\nOld";
        break;
    case 10:
        echo "\n\nChild";
        break;
    default:
    echo "\n\nERROR CASE";
    break;
}

?>