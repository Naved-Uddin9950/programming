<?php

# Normal variable --- scope local
$name = "Naved";

# Constant variable --- scope global [Always defined in caps]
# Syntax : define(variable_name, variable_value)
define("GENDER","Male");

# Calling normal variable
echo "\nName : $name \n";

# Calling constant variable
echo GENDER;

# Another way of calling constant variable
echo "\nGender : ".GENDER;

?>