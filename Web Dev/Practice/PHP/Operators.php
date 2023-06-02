<?php

# Variable declaration
$firstNum = 10;
$secondNum = 5;
$result;
$fakeNum = "10";

/* ---------------------------
    Arithematic Operators
------------------------------ */

echo "\n$firstNum + $secondNum = ".$firstNum + $secondNum; // Add
echo "\n$firstNum - $secondNum = ".$firstNum - $secondNum; // Subtract
echo "\n$firstNum * $secondNum = ".$firstNum * $secondNum; // Multiply
echo "\n$firstNum / $secondNum = ".$firstNum / $secondNum; // Divide
echo "\n$firstNum % $secondNum = ".$firstNum % $secondNum; // Modulus
echo "\n$firstNum ^ $secondNum = ".$firstNum ** $secondNum; // Raise to the power

/* ---------------------------
    Assignment Operators
------------------------------ */

$result = $firstNum + $secondNum;
echo "\n\nResult : $result";

/* ---------------------------------
    Increment/ Decrement Operators
------------------------------------ */

echo "\n$firstNum + 1 = ".++$firstNum; // Preincrement
echo "\n$firstNum = ".$firstNum++;
echo "\nResult = ".$firstNum;

/* ---------------------------
    Logical Operators
------------------------------ */

echo "\n\n";
$firstNum > $secondNum;

?>