<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>

    <!-- stylesheets -->
    <link rel="stylesheet" href="css/app.css">
</head>

<body>
    <div class="main-container">
        <div class="logo">
            Simple Calculator
        </div>

        <form action="" method="POST">
            <div class="calculator">
                <h1>Made By: Naved</h1>
                <input type="text" name="firstNum" id="firstNum" placeholder="Enter first number">
                <input type="text" name="secondNum" id="secondNum" placeholder="Enter second number">
                <select name="operator" id="operator">
                    <option value="add">ADD</option>
                    <option value="sub">SUB</option>
                    <option value="mult">MULT</option>
                    <option value="div">DIV</option>
                </select>
                <input type="submit" value="Submit" name="Submit" id="submit">
            </div>
        </form>

        <div class="result">
            <?php
            if (isset($_POST['Submit'])) {
                $firstNum = $_POST['firstNum'];
                $secondNum = $_POST['secondNum'];
                $operator = $_POST['operator'];

                switch ($operator) {
                    case 'add':
                        echo $firstNum . ' + ' . $secondNum . ' = ' . $firstNum + $secondNum;
                        break;

                    case 'sub':
                        echo $firstNum . ' - ' . $secondNum . ' = ' . $firstNum - $secondNum;
                        break;

                    case 'mult':
                        echo $firstNum . ' x ' . $secondNum . ' = ' . $firstNum * $secondNum;
                        break;

                    case 'div':
                        echo $firstNum . ' / ' . $secondNum . ' = ' . $firstNum / $secondNum;
                        break;

                    default:
                        echo 'ERROR: NOT A VALID STATEMENT.';
                        break;
                }
            }
            ?>
        </div>
    </div>



</body>

</html>